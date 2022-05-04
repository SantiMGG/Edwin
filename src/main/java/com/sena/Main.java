package com.sena;
import com.sena.DAO.DAOEstudiante;
import com.sena.DAO.DAOProfesor;
import com.sena.objects.Estudiante;
import com.sena.objects.Profesor;
import com.sena.utils.Conexion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        DAOEstudiante crud = new DAOEstudiante();
        Estudiante estudiante1 = new Estudiante();
        ArrayList<Estudiante> Estudiantes = new ArrayList<Estudiante>();

        DAOProfesor crudp = new DAOProfesor();
        Profesor profesor1  = new Profesor();
        ArrayList<Profesor> Profesores = new ArrayList<Profesor>();
        boolean ciclo=true;
        while(ciclo==true) {
            String[] opciones = {"Estudiante", "Profesor","Salir"};
            int idRespuesta2 = 0;
            int ventana = JOptionPane.showOptionDialog(null,
                    "¿Con cual desea trabajar?:",
                    "Cuadro de seleccion",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    opciones, opciones[0] + "\n");
            if (ventana == 0) {
                idRespuesta2 = 1;
            } else if (ventana == 1) {
                idRespuesta2 = 2;
            } else if (ventana == 2) {
                idRespuesta2 = 3;
            }

            switch (idRespuesta2) {
                case 1:
                    String[] opciones2 = {"Insertar" + "\n", "Modificar", "Eliminar", "Seleccionar todos", "Seleccionar por documento"};
                    int idRespuesta3 = 0;
                    int ventana2 = JOptionPane.showOptionDialog(null,
                            "¿Qué desea hacer?:",
                            "CRUD",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null,
                            opciones2, opciones2[0]);
                    if (ventana2 == 0) {
                        idRespuesta3 = 1;
                    } else if (ventana2 == 1) {
                        idRespuesta3 = 2;
                    } else if (ventana2 == 2) {
                        idRespuesta3 = 3;
                    } else if (ventana2 == 3) {
                        idRespuesta3 = 4;
                    } else if (ventana2 == 4) {
                        idRespuesta3 = 5;
                    }


                /*JOptionPane.showMessageDialog(null,"¿Que desea hacer?: ");
                String respuesta = JOptionPane.showInputDialog("1: Seleccionar por documento"+"\n"+
                        "2: Insertar"+"\n"+
                        "3: Modificar"+"\n"+
                        "4: Eliminar"+"\n"+
                        "5: Seleccionar todos");
                int idRespuesta = Integer.parseInt(respuesta);*/
                    switch (idRespuesta3) {

                        case 1:
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del estudiante: ");
                            String tipoE = JOptionPane.showInputDialog("Ingrese el tipo de documento: ");
                            String documentoE1 = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
                            String nombreE = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                            String apellidoE = JOptionPane.showInputDialog("Ingrese el apellido del estudiante: ");
                            String valorMatricula = JOptionPane.showInputDialog("Ingrese el valor de la matricula: ");
                            double valorMatriculaE = Double.parseDouble(valorMatricula);
                            estudiante1 = new Estudiante(tipoE, documentoE1, nombreE, apellidoE, valorMatriculaE);
                            crud.createEstudiante(estudiante1);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Ingrese el documento del estudiante que desea modificar: ");
                            String documentoE2 = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
                            JOptionPane.showMessageDialog(null, "Ingrese los nuevos datos: ");
                            String tipoEs = JOptionPane.showInputDialog("Ingrese el tipo de documento: ");
                            String documentoE1s = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
                            String nombreEs = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                            String apellidoEs = JOptionPane.showInputDialog("Ingrese el apellido del estudiante: ");
                            String valorMatriculas = JOptionPane.showInputDialog("Ingrese el valor de la matricula: ");
                            double valorMatriculaEs = Double.parseDouble(valorMatriculas);
                            estudiante1 = new Estudiante(tipoEs, documentoE1s, nombreEs, apellidoEs, valorMatriculaEs);
                            crud.updateEstudiante(estudiante1, documentoE2);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Ingrese el documento del estudiante que desea eliminar: ");
                            String documentoE3 = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
                            crud.deleteEstudiante(documentoE3);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Los estudiantes registrados son: ");
                            Estudiantes = crud.readAllEstudiante();

                            int i = 1;
                            for (Estudiante info : Estudiantes) {
                                System.out.println("Registro N° " + i + "\n" +
                                        "Tipo de documento: " + info.getTipo() + "\n" +
                                        "Nombre: " + info.getNombre() + "\n" +
                                        "Apellido: " + info.getApellido() + "\n" +
                                        "Valor Matricula: " + info.getValorMatricula() + "\n" +
                                        "------------------------------");
                                i++;
                            }
                            break;
                        case 5:
                            String documentoE = JOptionPane.showInputDialog("Ingrese el documento del estudiante: ");
                            estudiante1 = crud.readEstudianteByDocumento(documentoE);
                            JOptionPane.showMessageDialog(null, estudiante1.infoE());
                            break;
                    }
                    break;
                case 2:
                    String[] opciones3 = {"Insertar", "Modificar", "Eliminar", "Seleccionar todos", "Seleccionar por documento"};
                    int idRespuesta4 = 0;
                    int ventana3 = JOptionPane.showOptionDialog(null,
                            "¿Qué desea hacer?:",
                            "CRUD",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null,
                            opciones3, opciones3[0] + "\n");
                    if (ventana3 == 0) {
                        idRespuesta4 = 1;
                    } else if (ventana3 == 1) {
                        idRespuesta4 = 2;
                    } else if (ventana3 == 2) {
                        idRespuesta4 = 3;
                    } else if (ventana3 == 3) {
                        idRespuesta4 = 4;
                    } else if (ventana3 == 4) {
                        idRespuesta4 = 5;
                    }

                    switch (idRespuesta4) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del Profesor: ");
                            String id1 = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
                            int documentoP1 = Integer.parseInt(id1);
                            String nombreP = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
                            String telefonoP = JOptionPane.showInputDialog("Ingrese el telefono del profesor: ");
                            int telefonoP1 = Integer.parseInt(telefonoP);
                            String direccionP = JOptionPane.showInputDialog("Ingrese la direccion del profesor: ");
                            String tituloP = JOptionPane.showInputDialog("Ingrese el titulo del profesor: ");

                            profesor1 = new Profesor(documentoP1, nombreP, telefonoP1, direccionP, tituloP);
                            crudp.createProfesor(profesor1);
                            break;
                        case 2:

                            String id2 = JOptionPane.showInputDialog("Ingrese el numero de documento que desea modificar: ");
                            int documentoP2 = Integer.parseInt(id2);
                            JOptionPane.showMessageDialog(null, "Ingrese los nuevos datos: ");
                            String nombrePs = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
                            String telefonoPs = JOptionPane.showInputDialog("Ingrese el telefono del profesor: ");
                            int telefonoPs2 = Integer.parseInt(telefonoPs);
                            String direccionPs = JOptionPane.showInputDialog("Ingrese la direccion del profesor: ");
                            String tituloPs = JOptionPane.showInputDialog("Ingrese el titulo del profesor: ");

                            profesor1 = new Profesor(documentoP2, nombrePs, telefonoPs2, direccionPs, tituloPs);
                            crudp.updateProfesor(profesor1, documentoP2);
                            break;
                        case 3:
                            String id3 = JOptionPane.showInputDialog("Ingrese el numero de documento que desea modificar: ");
                            int documentoP3 = Integer.parseInt(id3);
                            crudp.deleteProfesor(documentoP3);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Los profesores registrados son: ");
                            Profesores = crudp.readAllProfesor();

                            int i = 1;
                            for (Profesor info : Profesores) {
                                System.out.println("Registro N° " + i + "\n" +
                                        "Numero de documento: " + info.getId() + "\n" +
                                        "Nombre: " + info.getNombre() + "\n" +
                                        "Telefono: " + info.getTelefono() + "\n" +
                                        "Direccion: " + info.getDireccion() + "\n" +
                                        "Titulo: " + info.getTitulo() + "\n" +
                                        "Fecha de registro: " + info.getFecha_registro() + "\n" +
                                        "------------------------------");
                                i++;
                            }
                            break;
                        case 5:
                            String id = JOptionPane.showInputDialog("Ingrese el documento del profesor: ");
                            int documentoP = Integer.parseInt(id);
                            profesor1 = crudp.readProfesorByDocumento(documentoP);
                            JOptionPane.showMessageDialog(null, profesor1.infoP());

                            break;
                    }
                    break;

                case 3:
                    ciclo=false;
                    break;

            }
        }



    }
}
