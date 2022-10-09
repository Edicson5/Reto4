package com.usa.misiontic.herramientas.repository.crudRepository;



import com.usa.misiontic.herramientas.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
