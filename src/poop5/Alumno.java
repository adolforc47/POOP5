/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Carolina
 */
public class Alumno {
    private String nombre,apellido,carrera,escuela;
    private int semestre;
    private Fecha fNacimiento;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }

    /**
     * Metodo que regresa el nombre del alumno
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que regresa el apellido del alumno
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo que regresa la carrera del alumno
     * @return 
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Metodo que regresa la escuela del alumno
     * @return 
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * Metodo que regresa el semestre del alumno
     * @return 
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Metodo que regresa la fecha de nacimiento del alumno
     * @return 
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    
    
    /**
     * Metodo que modifica el nombre del alumno
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que modifica el apellido del alumno
     * @param apellido apellido del alumno
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Metodo que modifica la carrera del alumno
     * @param carrera carrea del alumno a la que pertenece
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    /**
     * Metodo que modifica la escuela del alumno
     * @param escuela escuela del alumno a la que pertenece
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    /**
     * Metodo que modifica el semestre del alumno
     * @param semestre semestre del alumno en curso
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Metodo que modifica la fecha de nacimiento del alumno
     * @param fNacimiento fecha de nacimiento del alumno
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
     
    
    /**
     * Imprime el sonido de dormir
     */
    public void dormir(){
        System.out.println("zzZZZZZZzzz");
    }
    
    /**
     * Imprime el sonido de comer
     */
    public void comer(){
        System.out.println("niam niam");
    }
    
    /**
     * Imprime la accion de estudiar
     */
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
    /**
     * Imprime la accion de trabajar
     */
    public void trabajar(){
        System.out.println("Estoy trabajando");
    }
    
    /**
     * Imprime la accion de jugar 
     */
    public void jugar(){
        System.out.println("Estoy jugando");
    }

    /**
     * Imprime los atributos de la clase Alumno
     * @return 
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
    
}