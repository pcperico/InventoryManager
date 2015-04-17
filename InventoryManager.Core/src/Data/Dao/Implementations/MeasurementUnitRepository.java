/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Implementations;

import Data.Dao.Interfaces.IMeasurementUnitRepository;
import Data.Dao.RepositoryBase;
import Data.Entities.MeasurementUnit;

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
}
