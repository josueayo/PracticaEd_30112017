package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @Juan Carrera
 * @Estructura de Datos
 * @Ing.Solis Santiago
 */
public class EjerciciosPrueba2 {

    private Integer arrayTemperaturas[];

    public void dimensionar() {
        int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas temperaturas"));
        arrayTemperaturas = new Integer[dim];
    }

    public int tamaño() {
        return arrayTemperaturas.length;
    }
//Llena un arreglo de 10 elementos con nùmeros pandèmicos
    public void llenarArreglo(){
        for (int i = 0; i < tamaño(); i++) {
            arrayTemperaturas[i]=(int)(Math.random()*10);
            
        }
    }
//Implime el arreglo arrayTemperatura almacenàndolos previamente en el String
    public void imprimir(){
       String acu="";
        for (int i = 0; i < arrayTemperaturas.length; i++) {
           acu += " "+arrayTemperaturas[i];
        }
         JOptionPane.showMessageDialog(null,acu);
    }
    
//Imprime en un JOptionPane el arreglo arrayTemperaturas utilizando una clase del JDK de java  
    public void imprimirFacil(){
        
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
        
    }
//Ordena el arreglo en orden ascendente utilizando una clase del JDK de java
    public void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
//Retorna el màximo de un arreglo convirtièndo previamente a un Arraylist
    public void maximo(){
        List<Integer> arr = new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer max= Collections.max(arr);
        JOptionPane.showMessageDialog(null,max);
        
    }
    
    public  void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("INGRESE EL ITEM \n\n"
               + "  . . . . . . . . . .  MENU  . . . . . . . . . . \n\n"
               + "1.- DIMENSIONAR uno\n"
               + "2.- LLENAR ARREGLO\n"
               + "3.- IMPRIMIR FACIL\n"
               + "4.- ORDENAR\n"
               + "5.- MAXIMO\n"
               + "6.- SALIR....\n\n"));
        
       switch(op){
           
           case 1:
               dimensionar();
               break;
           case 2:
               llenarArreglo();
               break;
           case 3:
               imprimir();
               break;
           case 4:
               ordenar();
               break;
           case 5:
               maximo();
               break; 
       }       
    }while (op!=6); 
}
    
        
}
