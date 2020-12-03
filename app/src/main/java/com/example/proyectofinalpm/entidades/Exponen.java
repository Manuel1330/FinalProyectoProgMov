package com.example.proyectofinalpm.entidades;

import java.io.Serializable;

public class Exponen implements Serializable {

    private Integer IdExposicion;
    private String DniPasaporte;

    public Exponen(Integer idExposicion, String dniPasaporte) {
        IdExposicion = idExposicion;
        DniPasaporte = dniPasaporte;
    }

    public Integer getIdExposicion() {
        return IdExposicion;
    }

    public void setIdExposicion(Integer idExposicion) {
        IdExposicion = idExposicion;
    }

    public String getDniPasaporte() {
        return DniPasaporte;
    }

    public void setDniPasaporte(String dniPasaporte) {
        DniPasaporte = dniPasaporte;
    }
}
