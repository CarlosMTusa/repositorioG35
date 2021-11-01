
package renta.auditorio.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import renta.auditorio.model.Reservation;
import renta.auditorio.repository.crud.ReservationCrud;

@Repository

public class ReservationRepository {
    
    @Autowired
    ReservationCrud reservationCrud;
    
    public List<Reservation>getAll(){
        return (List<Reservation>)reservationCrud.findAll();
        
    }

    public Optional<Reservation>getReservation(int id){
        return reservationCrud.findById(id);
    }
    
    public Reservation save (Reservation rsvt){
        return reservationCrud.save(rsvt);
    }
}
