/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Implementations;

import Data.Dao.Interfaces.IProveedorRepository;
import Data.Dao.RepositoryBase;
import Data.Entities.Proveedor;
import java.util.List;

/**
 *
 * @author GlobalDev
 */
public class ProveedorRepository extends RepositoryBase<Proveedor>  implements IProveedorRepository 
{
    @Override
    public List<Proveedor> GetAllActives()
    {
       beginOperation();
       List<Proveedor> proveedores= sesion.getNamedQuery("Proveedor.GetActives").list();       
       sesion.close();
       return proveedores;
    }    

    @Override
    public List<Proveedor> FindByName(String name) {
        beginOperation();
        List<Proveedor> proveedores=sesion.getNamedQuery("Proveedor.FindByName").setString("name","%"+ name+"%").list();
        sesion.close();
        return proveedores;
    }
}
