package com.misiontic.reserva_ms.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Reserva {
    @Id
    private String idReserva;
    private String username;
    private String name;
    private String email;
    private String phone;
    private Date date;
    private Integer numberperson;
    private String observations;

    public Reserva(String idReserva, String username, String name, String email, String phone, Date date,Integer numberperson, String observations){
        this.idReserva= idReserva;
        this.username=username;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.date=date;
        this.numberperson=numberperson;
        this.observations=observations;

    }
    public String getIdReserva(){
        return idReserva;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhone(){
        return email;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public Integer getNumberPerson(){
        return numberperson;
    }
    public void setNumberPerson(Integer numberperson){
        this.numberperson=numberperson;
    }
    public String getObservations (){
        return observations;
    }
    public void setObservations(String observations){
        this.observations=observations;
    }


}
