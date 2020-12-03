package com.example.proyectofinalpm.entidades;

import java.io.Serializable;

public class Trabajos implements Serializable {

    private String NombreTrab;
    private String DescripcionTrabajo;
    private String Tamaño;
    private String Peso;
    private String DniPasaporte;
    private String Foto;

    public Trabajos(String nombreTrab, String descripcionTrabajo, String tamaño, String peso, String dniPasaporte, String foto) {
        NombreTrab = nombreTrab;
        DescripcionTrabajo = descripcionTrabajo;
        Tamaño = tamaño;
        Peso = peso;
        DniPasaporte = dniPasaporte;
        Foto = foto;
    }

    public String getNombreTrab() {
        return NombreTrab;
    }

    public void setNombreTrab(String nombreTrab) {
        NombreTrab = nombreTrab;
    }

    public String getDescripcionTrabajo() {
        return DescripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        DescripcionTrabajo = descripcionTrabajo;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String peso) {
        Peso = peso;
    }

    public String getDniPasaporte() {
        return DniPasaporte;
    }

    public void setDniPasaporte(String dniPasaporte) {
        DniPasaporte = dniPasaporte;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }
}
