
package renta.auditorio.repository.crud;

import renta.auditorio.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrud extends CrudRepository <Reservation,Integer> {
    
}
