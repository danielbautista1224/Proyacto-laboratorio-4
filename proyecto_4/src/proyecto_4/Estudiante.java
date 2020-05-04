/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_4;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    public String Nombre;
    public Vector notas=new Vector();
    
    
    public Estudiante (String Nombre,Vector notas){
        this.notas=notas;
        this.Nombre=Nombre;    
    }
    Estudiante(){}
 }
