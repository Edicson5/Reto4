package com.usa.misiontic.herramientas.controller;


import com.usa.misiontic.herramientas.entities.Reservation;
import com.usa.misiontic.herramientas.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll() { return reservationService.getAll();}

    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable("id") int id){
        return reservationService.getReservation(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save (@RequestBody Reservation a) {return reservationService.save(a);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update (@RequestBody Reservation a){return reservationService.update(a);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return reservationService.delete(id);
    }

}
