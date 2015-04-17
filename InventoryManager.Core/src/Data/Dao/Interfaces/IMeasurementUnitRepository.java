/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Interfaces;

import Data.Dao.IRepositoryBase;
import Data.Entities.MeasurementUnit;

/**
 *
 * @author GlobalDev
 */
public interface IMeasurementUnitRepository extends IRepositoryBase<MeasurementUnit> {
    public Boolean CreateNewUnit(String description, String abbreviation);
}
