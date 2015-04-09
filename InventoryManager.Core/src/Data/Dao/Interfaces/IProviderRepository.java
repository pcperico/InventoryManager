/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Interfaces;

import Data.Dao.IRepositoryBase;
import Data.Entities.Provider;
import java.util.List;

/**
 *
 * @author GlobalDev
 */
public interface IProviderRepository extends IRepositoryBase<Provider> {
    List<Provider> GetAllActives(); 
    List<Provider> GetAllInactives(); 
    List<Provider> FindByName(String name);
    void DisableProvider(int providerId);
    void EnableProvider(int providerId);
}
