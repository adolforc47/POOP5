/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Carolina
 */
public class Fecha {
    
    private int dia, mes, año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    /**
     * Metodo que modifica el dia 
     * @param dia Dia en que nacio el Alumno
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Metodo que modifica el mes 
     * @param mes Mes en que nacio el alumno
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Metodo que modifica el año
     * @param año Año en que nacio el alumno
     */
    public void setAño(int año) {
        this.año = año;
    }
    
    
    /**
     * Metodo que regresa el dia de nacimiento del alumno
     * @return 
     */
    public int getDia() {
        return dia;
    }

    /**
     * Metodo que regresa el mes de nacimiento del alumno
     * @return 
     */
    public int getMes() {
        return mes;
    }

    /**
     * Metodo que regresa el año de nacimiento del alumno
     * @return 
     */
    public int getAño() {
        return año;
    }

    /**
     * Imprime los atributos de la clase Fecha
     * @return 
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + año + '}';
    }   
}
