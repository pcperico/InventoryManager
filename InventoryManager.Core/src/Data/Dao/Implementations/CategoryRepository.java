/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dao.Implementations;

import Data.Dao.Interfaces.ICategoryRepository;
import Data.Dao.RepositoryBase;
import Data.Entities.Category;
import Dtos.CategoryDto;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.transform.Transformers;

/**
 *
 * @author GlobalDev
 */
public class CategoryRepository extends RepositoryBase<Category> implements ICategoryRepository {

    @Override
    public boolean CreateCategory(String description) {
        try
        {
            Category c = new Category();
            c.setDescription(description);
            this.Save(c);
            return true;
        }
        catch(Exception ex)
        {
            this.LogSever(ex);
            return false;
        }        
    }    

    @Override
    public boolean UpdateCategory(Category category) {
        try
        {
            Update(category);
            return true;
        }
        catch(Exception ex)
        {
            this.LogSever(ex);
            return false;
        }        
    }

    @Override
    public List<CategoryDto> FilterByDescription(String description) {
        try
        {
            beginOperation();
            Query qu = sesion.getNamedQuery("Category.FindByDescription").setString("description","%"+ description+"%"); 
            List<CategoryDto> categories=  qu.setResultTransformer(Transformers.aliasToBean(CategoryDto.class)).list();            
            sesion.close();
            return categories;
        }
        catch(Exception ex)
        {
            this.LogSever(ex);
            return null;
        }
    }

    @Override
    public List<CategoryDto> ListAll() {
        try
        {
            beginOperation();
            Query qu = sesion.getNamedQuery("Category.FindByDescription").setString("description","%%");             
            List<CategoryDto> categories=  qu.setResultTransformer(Transformers.aliasToBean(CategoryDto.class)).list();
            sesion.close();
            return categories;
        }
        catch(Exception ex)
        {
            this.LogSever(ex);
            return null;
        }
    }    
}
