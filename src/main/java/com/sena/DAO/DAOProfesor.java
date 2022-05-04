package com.sena.DAO;


import com.sena.objects.Profesor;
import com.sena.utils.Conexion;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class DAOProfesor extends Conexion{

    Profesor profesor = new Profesor();

    public void createProfesor(Profesor profesor){
        Connection connection = this.getConexion();
        //Estudiante estudiante1 = new Estudiante(6,"Cedula de ciudadania","1086773898","Santiago","Gomez",1200000);
        Profesor profesor1 = profesor;
        String createSQL = "INSERT INTO profesor (documento,nombre,telefono,direccion,titulo,fecha_registro) VALUES (?,?,?,?,?,now())";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(createSQL);
            preparedStatement.setInt(1,profesor1.getId());
            preparedStatement.setString(2,profesor1.getNombre());
            preparedStatement.setInt(3,profesor1.getTelefono());
            preparedStatement.setString(4,profesor1.getDireccion());
            preparedStatement.setString(5,profesor1.getTitulo());
            preparedStatement.executeUpdate();
        } catch (SQLException ea) {
            System.out.println("Error "+ea.getMessage());
        }

    }

    public ArrayList readAllProfesor() {
        Connection connection = this.getConexion();

        String selectAllSQL = "SELECT documento,nombre,telefono,direccion,titulo,fecha_registro FROM profesor";
        ArrayList<Profesor> Profesores = new ArrayList<Profesor>();

        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(selectAllSQL);
            while (rs.next()) {
                Profesor profesor1 = new Profesor();
                profesor1.setId(rs.getInt(1));
                profesor1.setNombre(rs.getString(2));
                profesor1.setTelefono(rs.getInt(3));
                profesor1.setDireccion(rs.getString(4));
                profesor1.setTitulo(rs.getString(5));
                profesor1.setFecha_registro(rs.getDate(6));
                Profesores.add(profesor1);
            }

        } catch (SQLException ea) {
            System.out.println(ea.getMessage());
        }
        return Profesores;
    }
    public Profesor readProfesorByDocumento(int id){
        Connection connection = this.getConexion();
        Profesor profesor1 = new Profesor();
        int documento1 = id;
        String createSQL = "SELECT documento,nombre,telefono,direccion,titulo,fecha_registro FROM profesor WHERE documento ='"+documento1+"'";
        try{
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(createSQL);
            while(rs.next()) {
                profesor1.setId(rs.getInt(1));
                profesor1.setNombre(rs.getString(2));
                profesor1.setTelefono(rs.getInt(3));
                profesor1.setDireccion(rs.getString(4));
                profesor1.setTitulo(rs.getString(5));
                profesor1.setFecha_registro(rs.getDate(6));
            }

        }catch (SQLException ea) {
            System.out.println(ea.getMessage());
        }
        return profesor1;
    }
    public void updateProfesor(Profesor profesor, int id){
        Connection connection = this.getConexion();
        Profesor profesor1 = profesor;
        int documento1 = id;
        //String createSQL = "SELECT id_estudiante FROM estudiante WHERE documento ='"+documento1+"'";
        //int id_estudiante=0;
        try{
            /*Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(createSQL);
            while(rs.next()){
                id_estudiante = rs.getInt(1);

            }*/
            int id_profesor=profesor1.getId();
            String nombre=profesor1.getNombre();
            int telefono=profesor1.getTelefono();
            String direccion=profesor1.getDireccion();
            String titulo =profesor1.getTitulo();
            String createSQL2 = "UPDATE profesor SET nombre='"+nombre+"',telefono='"+telefono+"',direccion='"+direccion+"',titulo='"+titulo+"' WHERE documento ='"+id_profesor+"'";
            PreparedStatement preparedStatement = connection.prepareStatement(createSQL2);
            preparedStatement.execute();


        }catch (SQLException ea) {
            System.out.println(ea.getMessage());
        }

    }

    public void deleteProfesor(int documentoP){
        Connection connection = this.getConexion();
        int documento1 = documentoP;
        try{

            String createSQL2 = "DELETE FROM profesor WHERE documento ='"+documento1+"'";
            PreparedStatement preparedStatement = connection.prepareStatement(createSQL2);
            preparedStatement.execute();

        }catch (SQLException ea) {
            System.out.println(ea.getMessage());
        }
    }
}
