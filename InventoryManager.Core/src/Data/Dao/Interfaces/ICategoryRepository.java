/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Interfaces;

import Data.Dao.IRepositoryBase;
import Data.Entities.Category;
import Dtos.CategoryDto;
import java.util.List;

/**
 *
 * @author GlobalDev
 */
public interface ICategoryRepository extends IRepositoryBase<Category> {
    public boolean CreateCategory(String description);
    public boolean UpdateCategory(Category category);
    public List<CategoryDto>FilterByDescription(String description);
    public List<CategoryDto>ListAll();
}
