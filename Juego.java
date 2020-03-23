/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Juego {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        Pokemon[] p1 = new Pokemon[4];

        System.out.println("Nombre del primer jugador ");
        String n = sc.next();
        p1[0] = new Entrenador(n);

        for (int i = 1; i < 4; i++) {
            int op;
            System.out.println("Seleccione tipo vez:" + i);
            System.out.println("1.Fuego");
            System.out.println("2.Agua");
            System.out.println("3.Planta");
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Solo numeros enteros");
                op = 3;

            }

            if (3 != op && op != 1 && op != 2) {
                i--;
                System.out.println("Ese numero no es valido");
            } else {

                switch (op) {
                    case 1:
                        p1[i] = new Fuego();
                        break;
                    case 2:
                        p1[i] = new Agua();
                        break;
                    case 3:
                        p1[i] = new Planta();
                        break;

                }
            }
        }

        Pokemon[] p2 = new Pokemon[4];

        System.out.println("Nombre del segundo jugador ");
        String m = sc.next();
        p2[0] = new Entrenador(m);

        for (int i = 1; i < 4; i++) {
            int op;
            System.out.println("Seleccione tipo vez:" + i);
            System.out.println("1.Fuego");
            System.out.println("2.Agua");
            System.out.println("3.Planta");
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Solo numeros enteros");
                op = 3;

            }

            if (3 != op && op != 1 && op != 2) {
                i--;
                System.out.println("Ese numero no es valido");
            } else {

                switch (op) {
                    case 1:
                        p2[i] = new Fuego();
                        break;
                    case 2:
                        p2[i] = new Agua();
                        break;
                    case 3:
                        p2[i] = new Planta();
                        break;

                }
            }
        }
        p1[0].present(p1,p2);
      

        
        
        
        
        
        
        
        
        
        
    }

}
