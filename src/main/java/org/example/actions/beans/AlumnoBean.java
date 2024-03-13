package org.example.actions.beans;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AlumnoBean {

    public static Map<String,AlumnoBean> alumnos = new HashMap<>();

    public  String name;
    public String surname;
    private Date bornDate;
    private String dni;

    public static Map<String, AlumnoBean> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(Map<String, AlumnoBean> alumnos) {
        AlumnoBean.alumnos = alumnos;
    }

    public static boolean addAlumnosInMap(AlumnoBean alumno){
        try {
            String keymap = alumno.getDni();
            alumnos.put(keymap, alumno);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    public static boolean removeAlumnosInMap(AlumnoBean alumnoBean){
        try {
            String dni = alumnoBean.getDni();
            alumnos.remove(dni);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
