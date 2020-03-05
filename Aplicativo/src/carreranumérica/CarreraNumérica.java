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
        System.out.println("");
        juego(n, m);
    }
    //Creación metodo del juego
    public static void juego(int n, int m){
        int sum=0;
        Scanner DE = new Scanner (System.in);
        String r = "";
        System.out.println("****Inicio del juego****");
        if(m==1){
            System.out.println("El primer jugador en llegar a la meta (posición 20) GANA!!!");
        }else if(m==2){
            System.out.println("El primer jugador en llegar a la meta (posición 30) GANA!!!");
        }else{
            System.out.println("El primer jugador en llegar a la meta (posición 50) GANA!!!");
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.println("Jugador " + i + " en posición de partida.");
        }
            int sumf1=0;
            int sumf2=0;
            int sumf3=0;
            int sumf4=0;
            if(n==2){
                System.out.println("");
                dosplayer(sumf1, sumf2, r, sum, n, m);
            }else if(n==3){
                System.out.println("");
                tresplayer(sumf1, sumf2, r, sum, n, sumf3, m);
            }else if(n==4){
                System.out.println("");
                cuatroplayer(sumf1, sumf2, r, sum, n, sumf3, sumf4, m);
            }
        
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
    public static void dosplayer(int sumf1, int sumf2, String r, int sum, int n, int m){
        Scanner DE = new Scanner (System.in);
        int mm = 0;
        if(m==1){
            mm=20;
        }else if(m==2){
            mm=30;
        }else if(m==3){
            mm=50;
        }
        while(sumf1<mm || sumf2<mm){
                for (int i = 1; i < n; i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf1 = sumf1 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf1);
                }
                if(sumf1>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 1!!");
                    System.exit(0);                   
                }
                for (int i = 2; i <= n; i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf2 = sumf2 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf2);
                if(sumf2>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 2!!");
                    System.exit(0);                   
                }
                }
            }
    }
    public static void tresplayer(int sumf1, int sumf2, String r, int sum, int n, int sumf3, int m){
        Scanner DE = new Scanner (System.in);
        int mm = 0;
        if(m==1){
            mm=20;
        }else if(m==2){
            mm=30;
        }else if(m==3){
            mm=50;
        }
        while(sumf1<mm || sumf2<mm || sumf3<mm){
                for (int i = 1; i < (n-1); i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf1 = sumf1 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf1);
                }
                if(sumf1>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 1!!");
                    System.exit(0);                   
                }
                for (int i = 2; i < n; i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf2 = sumf2 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf2);
                if(sumf2>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 2!!");
                    System.exit(0);                   
                }
                }
                for (int i = 3; i <= n; i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf3 = sumf3 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf3);
                }
                if(sumf3>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 3!!");
                    System.exit(0);                   
                }
            }
        
    }
      public static void cuatroplayer(int sumf1, int sumf2, String r, int sum, int n, int sumf3, int sumf4, int m){
        Scanner DE = new Scanner (System.in);
        int mm = 0;
        if(m==1){
            mm=20;
        }else if(m==2){
            mm=30;
        }else if(m==3){
            mm=50;
        }
        while(sumf1<mm || sumf2<mm || sumf3<mm || sumf4<mm){
                for (int i = 1; i <= (n-3); i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf1 = sumf1 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf1);
                }
                if(sumf1>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 1!!");
                    System.exit(0);                   
                }
                for (int i = 2; i < (n-1); i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf2 = sumf2 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf2);
                if(sumf2>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 2!!");
                    System.exit(0);                   
                }
                }
                for (int i = 3; i < n; i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf3 = sumf3 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf3);
                }
                if(sumf3>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 3!!");
                    System.exit(0);                   
                }
                for (int i = 4; i <= n; i++) {
                    System.out.println("");
                System.out.println("Turno del jugador " + i);
                System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                r = DE.next();
                while(!"r".equals(r)){
                    System.out.print("Cuando te sientas con buena suerte lanza los dados (r para lanzar dados): ");
                    r = DE.next(); 
                }
                sumf4 = sumf4 + lanzardados(sum);
                System.out.println("Jugador " + i + " en Posición: " + sumf4);
                }
                if(sumf4>=mm){
                    System.out.println("¡¡GANADOR JUGADOR 4!!");
                    System.exit(0);                   
                }
            }
        
    }
}
