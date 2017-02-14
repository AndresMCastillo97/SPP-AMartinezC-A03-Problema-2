/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a03.problema.pkg2;
import java.util.*;
/**
 *
 * @author andres
 */
public class SPPAMartinezCA03Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, a, b;
        Scanner kb=new Scanner(System.in);
        
        System.out.println("Redondeo al entero mayor y menor de la raíz cuadrada de un número");
        System.out.println("Ingrese un número");
        x=Math.sqrt(kb.nextDouble());//Método "sqrt": raiz cuadrada
        
        a=Math.floor(x);//Método "floor": Redondeo al entero menor
        b=Math.ceil(x);//Método "Ceil": Redondeo al entero mayor
        
        System.out.println("Raiz cuadrada= "+x);
        System.out.println("Redondeo al entero menor: "+a);
        System.out.println("Redondeo al entero mayor: "+b);
        
    }
    
}
