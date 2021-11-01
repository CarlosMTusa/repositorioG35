
package renta.auditorio.repository;

//import java.util.List;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import renta.auditorio.model.Client;
import renta.auditorio.repository.crud.ClientCrud;


@Repository

public class ClientRepository {
    
    @Autowired
    ClientCrud clientCrud;
    
    public List<Client>getAll(){
        return (List<Client>)clientCrud.findAll();
        
    }

    public Optional<Client>getClient(int id){
        return clientCrud.findById(id);
    }
    
    public Client save (Client clt){
        return clientCrud.save(clt);
    }

        
}
