
package renta.auditorio.repository.crud;

import renta.auditorio.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrud extends CrudRepository<Client, Integer> {
    
}
