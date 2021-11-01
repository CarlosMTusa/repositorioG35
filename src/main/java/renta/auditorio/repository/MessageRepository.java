
package renta.auditorio.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import renta.auditorio.model.Message;
import renta.auditorio.repository.crud.MessageCrud;

@Repository

public class MessageRepository {
    
    @Autowired
    MessageCrud messageCrud;
    
    public List<Message>getAll(){
        return (List<Message>)messageCrud.findAll();
        
    }

    public Optional<Message>getMessage(int id){
        return messageCrud.findById(id);
    }
    
    public Message save (Message msg){
        return messageCrud.save(msg);
    }
}

