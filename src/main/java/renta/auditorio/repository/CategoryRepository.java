
package renta.auditorio.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import renta.auditorio.model.Category;
import renta.auditorio.repository.crud.CategoryCrud;


@Repository

public class CategoryRepository {

    @Autowired
    CategoryCrud categoryCrud;
    
    public List<Category>getAll(){
        return (List<Category>)categoryCrud.findAll();
    }

    public Optional<Category>getCategory(int id){
        return categoryCrud.findById(id);
    }
    
    public Category save (Category catd){
        return categoryCrud.save(catd);
    }

}
