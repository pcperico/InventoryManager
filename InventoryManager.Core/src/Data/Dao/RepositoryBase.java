/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao;

import Data.Configuration.HibernateUtil;
import Data.Configuration.StringsKeysHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GlobalDev
 */
public class RepositoryBase<T> implements IRepositoryBase<T> {
    protected Session sesion;
    protected Transaction tx;    
    
    protected void beginOperation() throws HibernateException
    {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }
    protected void manageException(Exception he) throws HibernateException
    {
        tx.rollback();
        sesion.close();
        this.LogSever(he);
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
    
    protected void finishOperation()
    {
        tx.commit();        
    }
    
    @Override
    public int Save(T entity)
    {
        int id =0;
        try 
        { 
            beginOperation();
            id=(int) sesion.save(entity);             
        }catch(Exception he) 
        { 
            manageException(he);
            throw he; 
        }finally 
        { 
            finishOperation();
        } 
        return id;
    }    

    @Override
    public void Delete(T entity) {
        try 
        { 
            beginOperation();
            sesion.delete(entity);             
        }catch(HibernateException he) 
        { 
            manageException(he);
            throw he; 
        }finally 
        { 
            finishOperation();
        } 
    }

    @Override
    public List<T> GetAll() {
        beginOperation();
        try {
            return sesion.createCriteria(getGenericClass()).list();            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepositoryBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            sesion.close();
        }
        return null;
    }
    
    @Override
    public T Get(int id) {
        beginOperation();
        try {
            return (T) sesion.get(getGenericClass(), id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepositoryBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            sesion.close();
        }
        return null;
    }

    private Class<T> getGenericClass() throws ClassNotFoundException{
        Class<T> inferedClass = null;
        if(inferedClass == null){
            Type mySuperclass = getClass().getGenericSuperclass();
            Type tType = ((ParameterizedType)mySuperclass).getActualTypeArguments()[0];
            String className = tType.toString().split(" ")[1];
            inferedClass = (Class<T>) Class.forName(className);
        }
        return inferedClass;
    }    

    @Override
    public void Update(T entity) {
        try 
        { 
            beginOperation();
            sesion.update(entity);
        }catch(HibernateException he) 
        { 
            manageException(he);
            throw he; 
        }finally 
        { 
            finishOperation();
        } 
    }

    Logger logger = Logger.getLogger("Logs");  
    FileHandler fh;  
    
    @Override
    public void LogSever(Exception ex) {        
        try {          
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            fh = new FileHandler(StringsKeysHelper.GetConfigKeysApp().getProperty("logFile")+"Log-"+ dateFormat.format(Calendar.getInstance().getTime())+".log",true);            
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
        } catch (IOException ex1) {
            System.out.println(ex1.getMessage());
        } catch (SecurityException ex1) {
            System.out.println(ex1.getMessage());
        }
        StringWriter errors = new StringWriter();
        ex.printStackTrace(new PrintWriter(errors));        
        logger.severe(errors.toString());
        fh.flush();
        fh.close();
    }
    
    @Override
    public void LogInfo(String info) {
        try {      
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");            
            fh = new FileHandler(StringsKeysHelper.GetConfigKeysApp().getProperty("logFile")+"Log-"+ dateFormat.format(Calendar.getInstance().getTime())+".log",true);                      
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
        } catch (IOException ex1) {
            System.out.println(ex1.getMessage());
        } catch (SecurityException ex1) {
            System.out.println(ex1.getMessage());
        }
        logger.info(info);        
        fh.flush();
        fh.close();
    }
}
