/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Implementations;

import Data.Dao.Interfaces.IMeasurementUnitRepository;
import Data.Dao.RepositoryBase;
import Data.Entities.MeasurementUnit;
import java.util.List;

/**
 *
 * @author GlobalDev
 */
public class MeasurementUnitRepository extends RepositoryBase<MeasurementUnit> implements IMeasurementUnitRepository {

    @Override
    public Boolean CreateNewUnit(String description, String abbreviation) {
        try
        {
            MeasurementUnit unit = new MeasurementUnit();
            unit.setDescription(description);
            unit.setAbbreviation(abbreviation);
            if(this.Save(unit)>0)
                return true;
            this.LogInfo("Can't create new MeasurementUnit");
            return false;
        }
        catch(Exception ex)
        {
            this.LogSever(ex);
            return false;
        }       
    }    

    @Override
    public List<MeasurementUnit> FindByDescription(String description) {
        try
        {
            beginOperation();
            List<MeasurementUnit> units= sesion.getNamedQuery("MeasurementUnit.FindByDescription").setString("description","%"+ description+"%").list();       
            sesion.close();
            return units;
        }
        catch(Exception ex)
        {
            this.LogSever(ex);
            return null;
        }        
    }

    @Override
    public Boolean UpdateUnit(MeasurementUnit mu) {
        try
        {
            this.Update(mu);
            return true;
        }
        catch(Exception ex)
        {
            this.LogSever(ex);
            return false;
        }
    }
}
