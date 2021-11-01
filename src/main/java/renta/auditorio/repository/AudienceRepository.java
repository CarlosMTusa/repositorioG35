
package renta.auditorio.repository;

import renta.auditorio.model.Audience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import renta.auditorio.repository.crud.AudienceCrud;

@Repository

public class AudienceRepository {

    @Autowired
    AudienceCrud audienceCrud;
    
    public List<Audience>getAll(){
        return (List<Audience>)audienceCrud.findAll();
    }

    public Optional<Audience>getAudience(int id){
        return audienceCrud.findById(id);
    }
    
    public Audience save (Audience audi){
        return audienceCrud.save(audi);
    }

}
