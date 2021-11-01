
package renta.auditorio.repository.crud;

import renta.auditorio.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrud extends CrudRepository<Category, Integer>{
    
}
