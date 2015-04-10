/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao;

import java.util.List;

/**
 *
 * @author GlobalDev
 */
public interface IRepositoryBase<T> {
    public int Save(T entity);
    public void Delete(T entity);
    public List<T> GetAll();
    public T Get(int id);
    public void Update(T entity);
    public void LogSever(Exception ex);
}
