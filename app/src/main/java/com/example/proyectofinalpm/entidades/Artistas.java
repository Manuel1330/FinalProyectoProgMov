package com.example.proyectofinalpm.entidades;

import java.io.Serializable;
import java.util.Date;

public class Artistas implements Serializable {

    private String DniPasaporte;
    private String Nombre;
    private String Direccion;
    private String Poblacion;
    private String Provincia;
    private String Pais;
    private Integer MovilTrabajo;
    private Integer MovilPersonal;
    private Integer TelefonoFijo;
    private String Email;
    private String WebBlog;
    private Date FechaNacimiento;

    public Artistas(String dniPasaporte, String nombre, String direccion, String poblacion, String provincia, String pais, Integer movilTrabajo, Integer movilPersonal, Integer telefonoFijo, String email, String webBlog, Date fechaNacimiento) {
        DniPasaporte = dniPasaporte;
        Nombre = nombre;
        Direccion = direccion;
        Poblacion = poblacion;
        Provincia = provincia;
        Pais = pais;
        MovilTrabajo = movilTrabajo;
        MovilPersonal = movilPersonal;
        TelefonoFijo = telefonoFijo;
        Email = email;
        WebBlog = webBlog;
        FechaNacimiento = fechaNacimiento;
    }

    public String getDniPasaporte() {
        return DniPasaporte;
    }

    public void setDniPasaporte(String dniPasaporte) {
        DniPasaporte = dniPasaporte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public Integer getMovilTrabajo() {
        return MovilTrabajo;
    }

    public void setMovilTrabajo(Integer movilTrabajo) {
        MovilTrabajo = movilTrabajo;
    }

    public Integer getMovilPersonal() {
        return MovilPersonal;
    }

    public void setMovilPersonal(Integer movilPersonal) {
        MovilPersonal = movilPersonal;
    }

    public Integer getTelefonoFijo() {
        return TelefonoFijo;
    }

    public void setTelefonoFijo(Integer telefonoFijo) {
        TelefonoFijo = telefonoFijo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWebBlog() {
        return WebBlog;
    }

    public void setWebBlog(String webBlog) {
        WebBlog = webBlog;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

}
