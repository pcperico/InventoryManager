/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GlobalDev
 */
public class StringsKeysHelper {
    public static final String applicationContextFile="applicationContext.xml";
    public static final String ProveedorRepository="IProviderRepository";
    public static final String UserRepository="IUserRepository";    
    public static final String MeasurementeUnitRepository="IMeasurementUnitRepository";   
    public static String GetAppConfigPath()
    {
        File file=new File("");        
        return file.getAbsolutePath()+"\\src";
    }
        
    public static Properties GetConfigKeysApp()
    {
        Properties props = new Properties();                    
        InputStream is;
        try {
            is = new FileInputStream(GetAppConfigPath()+"\\appConfig.xml");
            props.loadFromXML(is);
        } catch (Exception ex) {
            Logger.getLogger(StringsKeysHelper.class.getName()).log(Level.SEVERE, null, ex);
        }  
    	return props;
    }
}
