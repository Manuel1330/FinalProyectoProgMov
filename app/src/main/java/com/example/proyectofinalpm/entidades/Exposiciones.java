package com.example.proyectofinalpm.entidades;

import java.io.Serializable;
import java.util.Date;

public class Exposiciones implements Serializable {

    private Integer IdExposicion;
    private String NombreExp;
    private String Descripcion;
    private Date FechaInicio;
    private Date FechaFin;

    public Exposiciones(Integer IdExposicion, String NombreExp, String Descripcion, Date FechaInicio, Date FechaFin){
        this.IdExposicion = IdExposicion;
        this.NombreExp = NombreExp;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }

    public Integer getIdExposicion() {
        return IdExposicion;
    }

    public void setIdExposicion(Integer idExposicion) {
        IdExposicion = idExposicion;
    }

    public String getNombreExp() {
        return NombreExp;
    }

    public void setNombreExp(String nombreExp) {
        NombreExp = nombreExp;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }
}
