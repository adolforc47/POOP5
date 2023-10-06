/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Carolina
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Alumno alumno = new Alumno();
        
        alumno.setNombre("Pedro");
        alumno.setApellido("Gomez");
        alumno.setCarrera("Mecatronica");
        alumno.setEscuela("UNAM");
        alumno.setSemestre(6);
        Fecha fecha2 = new Fecha(13,2,2001);
        alumno.setfNacimiento(fecha2);
        
        Fecha fecha = new Fecha(29,9,2003);
        Alumno alumno2 = new Alumno("Eduardo","Rodriguez","Computacion","UNAM",3,fecha);
        
        String var = alumno2.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alumno);
    }
    
}
