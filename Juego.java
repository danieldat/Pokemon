/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Juego {

    public static void main(String[] Args) {

         Scanner sc = new Scanner(System.in);
        Pokemon[] p1 = new Pokemon[4];
        Pokemon[] p2 = new Pokemon[4];
        p1[0]=new Entrenador();
        p2[0]=new Entrenador();
        
        p1[0].select(p1);
        p2[0].select(p2);
        ArrayList <Pokemon> poke = new ArrayList<Pokemon>();
        
        poke.add(p1[1]);
        poke.add(p1[2]);
        poke.add(p1[3]);
        
        ArrayList <Pokemon> poke2=new ArrayList<Pokemon>();
             
        poke2.add(p2[1]);
        poke2.add(p2[2]);
        poke2.add(p2[3]);
        
        p1[0].present(p1, p2);
        
        /*for(Pokemon pokemon:poke){
        
            pokemon.ficha();
        
        }
        for(Pokemon pokemon:poke2){
        
        pokemon.ficha();
        }*/
        
        
    }

}
