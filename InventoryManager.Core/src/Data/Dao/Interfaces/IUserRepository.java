/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Interfaces;

import Data.Dao.IRepositoryBase;
import Data.Entities.User;
import java.util.Date;

/**
 *
 * @author GlobalDev
 */
public interface IUserRepository extends IRepositoryBase<User> {
    public User createUser(String name, String lastName,Date birthDate,String phone,String email,String address,String username,String password);
}
