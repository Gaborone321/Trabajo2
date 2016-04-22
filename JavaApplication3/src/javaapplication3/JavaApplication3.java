/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 19546366-2
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        int  Resto, Dec, Uni, N;
            System.out.println("Ingrese un Numero:");
            N = leer.nextInt();
            Dec = N / 10;
            Resto = N % 10;
            Uni = Resto;
            System.out.println("En Números Romanos es : ");
           
            switch (Dec)
            {
                case 1:System.out.println("X");break;
                case 2:System.out.println("XX");break;
                case 3:System.out.println("XXX");break;
                case 4:System.out.println("XL");break;
                case 5:System.out.println("L");break;
                case 6:System.out.println("LX");break;
                case 7:System.out.println("LXX");break;
                case 8:System.out.println("LXXX");break;
                case 9:System.out.println("XC");break;
            }
            switch (Uni)
            {
                case 1: System.out.println("I"); break;
                case 2: System.out.println("II"); break;
                case 3: System.out.println("III"); break;
                case 4: System.out.println("IV"); break;
                case 5: System.out.println("V"); break;
                case 6: System.out.println("VI"); break;
                case 7: System.out.println("VII"); break;
                case 8: System.out.println("VIII"); break;
                case 9: System.out.println("IX"); break;
            }
    }
    
}
