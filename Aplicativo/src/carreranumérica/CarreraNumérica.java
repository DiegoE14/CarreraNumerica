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
        // n = cantidad de jugadores
        int n;
        // m = nivel del tablero
        int m;
        System.out.println("**CARRERA NUMÉRICA**");
        System.out.print("Digité cantidad de jugadores(2-4): ");
        n = DE.nextInt();
        // Validación de 2-4 player
        while(n<2||n>4){
            //Vuelve a pedir un numero valido.
            System.out.println("Cantidad incorrecta!.");
            System.out.print("Digité cantidad de jugadores(2-4): ");
            n = DE.nextInt();            
        }
        System.out.println("Dificultad del tablero a jugar: ");
        System.out.println("   1. Nivel básico (Tablero de 20 posiciones)\n" +
                            "   2. Nivel intermedio (Tablero de 30 posiciones)\n" +
                            "   3. Nivel avanzado (Tablero de 50 posiciones)");
        System.out.print("Dificultad (1-3): ");
        m = DE.nextInt();
        while(m<1||m>3){
            //Vuelve a pedir un numero valido.
            System.out.println("Dificultad incorrecta!.");
            System.out.print("Dificultad (1-3): ");
            m = DE.nextInt();            
        }
        juego(n, m);
    }
    //Creación metodo del juego
    public static void juego(int n, int m){
        int sum=0;
        Scanner DE = new Scanner (System.in);
        String r;
        System.out.println("****Inicio del juego****");
        if(m==1){
            System.out.println("El primer jugador en llegar a la meta (posición 20) GANA!!!");
        }else if(m==2){
            System.out.println("El primer jugador en llegar a la meta (posición 30) GANA!!!");
        }else{
            System.out.println("El primer jugador en llegar a la meta (posición 50) GANA!!!");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Jugador " + i + " en posición de partida.");
        }
            int sumf=0;
            while(sumf<20){
                for (int i = 1; i <= n; i++) {
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf = sumf + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf);
                sumf=0;
                }
            }
            
//            if(m==1){
//                if(sumf==20){
//                    System.out.println("-*-*-*-FELICITACIONES JUGADOR " + i + " HAS GANADO ");
//                    System.exit(0);
//                }else if(sumf==30){
//                    System.out.println("-*-*-*-FELICITACIONES JUGADOR " + i + " HAS GANADO ");
//                    System.exit(0);
//                }else if(sumf==50){
//                    System.out.println("-*-*-*-FELICITACIONES JUGADOR " + i + " HAS GANADO ");
//                    System.exit(0);
//                }                                 
//            }
        
    }
    public static int lanzardados(int sum){
        int d1,d2,t;
        d1=(int) (Math.random() * 6);
        d1 = d1+1;
        d2=(int) (Math.random() * 6);
        d2 =d2+1;
        System.out.println("Dado 1: "+d1);
        System.out.println("Dado 2: "+d2);
        t = d1+d2;
        System.out.println("Total: "+t);
        sum = sum+t;
        return sum;
    }
}
