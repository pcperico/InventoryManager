/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Interfaces;

import Data.Dao.IRepositoryBase;
import Data.Entities.Proveedor;
import java.util.List;

/**
 *
 * @author GlobalDev
 */
public interface IProveedorRepository extends IRepositoryBase<Proveedor> {
    List<Proveedor> GetAllActives(); 
    List<Proveedor> GetAllInactives(); 
    List<Proveedor> FindByName(String name);
    void DisableProveedor(int proveedorId);
    void EnableProveedor(int proveedorId);
}
