/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class extraccion {
    private File archivo;
    extraccion(String path){
        this.archivo=new File(path);
    }
    public List<Estudiante> crearListado() throws FileNotFoundException{
         List<Estudiante> listadoFinal = new ArrayList<>();
        try (Scanner scanner = new Scanner(this.archivo);) {
            while (scanner.hasNextLine()) {
                List<String> record=getRecordFromLine(scanner.nextLine());
                Estudiante dato=new Estudiante();
                dato.Nombre=record.get(0);
                for (int index=1;index<numeroestudiant;index++){
                    dato.notas.set(index, record.get(index));
                            }
                listadoFinal.add(dato);
            }
        }
         return listadoFinal;
    }
    
}

