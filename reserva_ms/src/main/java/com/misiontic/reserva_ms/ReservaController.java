package com.misiontic.reserva_ms;

import com.misiontic.reserva_ms.exceptions.ReservaNotFoundException;
import com.misiontic.reserva_ms.models.Reserva;
import com.misiontic.reserva_ms.repositories.ReservaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController

public class ReservaController {
    private final ReservaRepository reservaRepository;

    public ReservaController(ReservaRepository reservaRepository){
        this.reservaRepository=reservaRepository;
    }

    @PostMapping("/reservas")
    Reserva newReserva(@RequestBody Reserva reserva){
        Reserva solicitudReserva= reservaRepository.findById(reserva.getUsername()).orElse(null);

        if (solicitudReserva==null)
            throw new ReservaNotFoundException("Reserva no realizada.No se encontró una reserva con el usernername:"+reserva.getUsername());

            solicitudReserva.setUsername(reserva.getUsername());
            solicitudReserva.setName(reserva.getName());
            solicitudReserva.setEmail(reserva.getEmail());
            solicitudReserva.setPhone(reserva.getPhone());
            solicitudReserva.setDate(new Date());
            solicitudReserva.setNumberPerson(reserva.getNumberPerson());
            solicitudReserva.setObservations(reserva.getObservations());
            return reservaRepository.save(solicitudReserva);

    }
    @GetMapping("/reservas/{username}")
        List<Reserva>userReserva(@PathVariable String username){
            Reserva userReserva = reservaRepository.findById(username).orElse(null);
            if (userReserva==null)
                throw  new ReservaNotFoundException("No se encontro una reserva con el username:"+username);
            List<Reserva>reservaUser= reservaRepository.findByUsername(username);
            return reservaUser;
    }
    }




