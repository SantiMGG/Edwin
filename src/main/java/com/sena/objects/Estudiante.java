package com.sena.objects;

public class Estudiante {
    int id;
    String tipo;
    String documento;
    String nombre;
    String apellido;
    double valorMatricula;


    public Estudiante() {
    }

    public Estudiante( String tipo, String documento, String nombre, String apellido, double valorMatricula) {
        this.tipo = tipo;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.valorMatricula = valorMatricula;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public String infoE(){
        String info= "Tipo de documento: "+this.tipo+"\n"+
                     "Documento: "+this.documento+"\n"+
                     "Nombre: "+this.nombre+"\n"+
                     "Apellido: "+this.apellido+"\n"+
                     "Valor Matricula: "+this.valorMatricula+"\n";
        return info;
    }
}
