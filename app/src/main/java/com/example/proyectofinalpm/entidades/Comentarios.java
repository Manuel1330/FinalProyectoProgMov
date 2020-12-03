package com.example.proyectofinalpm.entidades;

import java.io.Serializable;

public class Comentarios implements Serializable {

    private Integer IdExposicion;
    private String NombreTrab;
    private String Comentario;

    public Comentarios(Integer idExposicion, String nombreTrab, String comentario) {
        IdExposicion = idExposicion;
        NombreTrab = nombreTrab;
        Comentario = comentario;
    }

    public Integer getIdExposicion() {
        return IdExposicion;
    }

    public void setIdExposicion(Integer idExposicion) {
        IdExposicion = idExposicion;
    }

    public String getNombreTrab() {
        return NombreTrab;
    }

    public void setNombreTrab(String nombreTrab) {
        NombreTrab = nombreTrab;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

}
