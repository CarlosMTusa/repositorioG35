
package renta.auditorio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renta.auditorio.model.Reservation;
import renta.auditorio.repository.ReservationRepository;

@Service

public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll() {
        return reservationRepository.getAll();
    }

    public Optional<Reservation> getReservation(int reservationId) {
        return reservationRepository.getReservation(reservationId);
    }

    public Reservation save(Reservation rsvt) {
        if (rsvt.getIdReservation() == null) {
            return reservationRepository.save(rsvt);
        } else {
            Optional<Reservation> consulta = reservationRepository.getReservation(rsvt.getIdReservation());
            if (consulta.isEmpty()) {
                return reservationRepository.save(rsvt);
            } else {
                return rsvt;

            }
        }
    }

}


