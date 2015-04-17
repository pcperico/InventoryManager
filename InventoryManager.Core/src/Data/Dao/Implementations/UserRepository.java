/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Implementations;

import Data.Dao.Interfaces.IUserRepository;
import Data.Dao.RepositoryBase;
import Data.Entities.User;
import java.util.Date;

/**
 *
 * @author GlobalDev
 */
public class UserRepository extends RepositoryBase<User> implements IUserRepository{   
    @Override
    public User createUser(String name, String lastName, Date birthDate, String phone, String email, String address, String username, String password) {
        try
        {
            if(birthDate==null)
            {
                this.LogInfo("Invalid date on birthdate of user");                
                return null;
            }
            
            User u = new User(name, lastName, birthDate, phone, email, address, username, password);
            int id=Save(u);
            u.setId(id);
            return u;
        }
        catch(Exception ex)
        {        
            this.LogSever(ex);            
        }
        return null;
    }        
}
