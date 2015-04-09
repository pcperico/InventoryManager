/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Implementations;

import Data.Dao.Interfaces.IProviderRepository;
import Data.Dao.RepositoryBase;
import Data.Entities.Provider;
import java.util.List;

/**
 *
 * @author GlobalDev
 */
public class ProviderRepository extends RepositoryBase<Provider>  implements IProviderRepository 
{
    @Override
    public List<Provider> GetAllActives()
    {
       beginOperation();
       List<Provider> proveedores= sesion.getNamedQuery("Provider.GetActives").list();       
       sesion.close();
       return proveedores;
    }    

    @Override
    public List<Provider> FindByName(String name) {
        beginOperation();
        List<Provider> proveedores=sesion.getNamedQuery("Provider.FindByName").setString("name","%"+ name+"%").list();
        sesion.close();
        return proveedores;
    }

    @Override
    public void DisableProvider(int providerId) {        
        Provider p = this.Get(providerId);
        p.setActive(0);
        this.Update(p);        
    }

    @Override
    public void EnableProvider(int providerId) {
        Provider p = this.Get(providerId);
        p.setActive(1);
        this.Update(p);        
    }

    @Override
    public List<Provider> GetAllInactives() {
        beginOperation();
       List<Provider> proveedores= sesion.getNamedQuery("Provider.GetInactives").list();       
       sesion.close();
       return proveedores;
    }
}
