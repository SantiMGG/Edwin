package com.sena.objects;

import java.util.Calendar;
import java.util.Date;

public class Profesor {
    int id;
    String nombre;
    int telefono;
    String direccion;
    String titulo;
    Date fecha_registro;


    public Profesor() {
    }

    public Profesor(int id, String nombre, int telefono, String direccion, String titulo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.titulo = titulo;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String infoP(){
        String info="Documento: "+this.id+"\n"+
                "Nombre: "+this.nombre+"\n"+
                "Telefono: "+this.telefono+"\n"+
                "Direccion: "+this.direccion+"\n"+
                "Titulo: "+this.titulo+"\n"+
                "Fecha de Registro: "+this.fecha_registro+"\n";
        return info;
    }
}

