/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreranumérica;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CarreraNumérica {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        Scanner DE = new Scanner (System.in);
        int n;
        System.out.println("**CARRERA NUMÉRICA**");
        System.out.print("Digité cantidad de jugadores(2-4): ");
        n = DE.nextInt();
        // Validación de 2-4 player
        while(n<2&&n>4){
            //Vuelve a pedir un numero valido.
            System.out.println("Cantidad incorrecta!.");
            System.out.print("Digité cantidad de jugadores(2-4): ");
            n = DE.nextInt();            
        }
        juego(n);
    }
    public static void juego(int n){
        System.out.println("metodo:"+n);
    }
}
