
package renta.auditorio.repository.crud;

import renta.auditorio.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrud extends CrudRepository <Message, Integer>{
    
}
