package com.misiontic.reserva_ms.repositories;

import com.misiontic.reserva_ms.models.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Date;
import java.util.List;

public interface ReservaRepository extends MongoRepository <Reserva,String>{
    List<Reserva>findByUsername(String username);
    List<Reserva>findByDate(Date date);
}

