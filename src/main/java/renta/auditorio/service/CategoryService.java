
package renta.auditorio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renta.auditorio.model.Category;
import renta.auditorio.repository.CategoryRepository;

@Service

public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryRepository.getCategory(id);
    }

    public Category save(Category catg) {
        if (catg.getId() == null) {
            return categoryRepository.save(catg);
        } else {
            Optional<Category> consulta = categoryRepository.getCategory(catg.getId());
            if (consulta.isEmpty()) {
                return categoryRepository.save(catg);
            } else {
                return catg;

            }
        }
    }

}
