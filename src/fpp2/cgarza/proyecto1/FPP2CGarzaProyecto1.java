/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpp2.cgarza.proyecto1;

import java.util.Scanner;

/**
 *
 * @author Carlos Rafael
 */
public class FPP2CGarzaProyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int dato,op;
        double l, gal,resultados,c;
        double cm, pul, m,pie,km,mil, gr,libra,f;
        l=3.78541;
        pul=0.393701;
        pie=0.3048;
        mil=1.60934;
        gr=0.00220462;
        
        
        System.out.println("Que tipo de conversión deseas realizar");
        Scanner entrada=new Scanner(System.in);
        System.out.println("¨1.Liquido¨");
        System.out.println("¨2.Distancia¨"); 
        System.out.println("¨3.Tempetatura¨");
        System.out.println("¨4.Peso¨");
        
         op= entrada.nextInt();
        
      switch(op){
        case 1:
            System.out.println("Ingresa una cantidad");
            gal=entrada.nextDouble();
            resultados= l * gal;
            System.out.println("El resultado es: " + gal + " galones" + " es = " + resultados + "litros");
             break;
        case 2:
            cm=entrada.nextDouble();
            resultados= cm* pul;
            System.out.println("El resultado es : " + cm + " cm" + " es = " + resultados + "pulgadas");
            m=entrada.nextDouble();
            resultados=m*pie;
            System.out.println("El resultado es : " + l + " litros " + "es = " + resultados + "pies");
            km=entrada.nextDouble();
            resultados=km*mil;
            System.out.println("el resultado es :" + km + " km " + "es = " + resultados + "millas");
            break;
        case 3:
            c=entrada.nextDouble();
            resultados=((c * 9/5) + 32);;
            System.out.println("El resultado es:" + c + "celcius" + " es = " + resultados + "fahrenheit");
            break;
        case 4:
            libra=entrada.nextDouble();
            resultados=libra*gr;
            System.out.println("El resultado es: " + l + " libras " + "es = " + resultados + "gramos");
            break;
        default:
            resultados=0;
            System.out.println("No esta dentro del menú");
                
       }
        
        
    }
    
}
