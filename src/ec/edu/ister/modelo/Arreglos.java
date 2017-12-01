package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Arreglos {

    private Integer arrayTemperaturas[];

    public void dimensionar() {
        int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas temperaturas"));
        arrayTemperaturas = new Integer[dim];
    }

    public int tamaño() {
        return arrayTemperaturas.length;
    }

    public void llenarArreglo(){
        for (int i = 0; i < tamaño(); i++) {
            arrayTemperaturas[i]=(int)(Math.random()*10);
            
        }
    }
    
    public void imprimir(){
       String acu="";
        for (int i = 0; i < arrayTemperaturas.length; i++) {
           acu += " "+arrayTemperaturas[i];
        }
         JOptionPane.showMessageDialog(null,acu);
    }
    
    public void imprimirFacil(){
        
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
        
    }
    public void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
    public void maximo(){
        List<Integer> arr = new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer max= Collections.max(arr);
        JOptionPane.showMessageDialog(null,max);
        
    }
    
    
    public void minimo(){
        List<Integer> arr = new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer min = Collections.min(arr);
        JOptionPane.showMessageDialog(null, min);
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
               + "6.- MINIMO\n"
               + "7.- SALIR....\n\n"));
        
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
           case 6:
               minimo();
               break;   
       }       
    }while (op!=7); 
}
    
        
}
