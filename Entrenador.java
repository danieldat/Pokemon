/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

/**
 *
 * @author alumnot
 */
public class Entrenador extends Pokemon {
    
 
 int oportunidad=3;
 
 public Entrenador(String nombre){
 super(nombre=nombre);
 }
    
 
 public void win(){
 this.oportunidad-=1;
 }
    
  public String nom(){
  return this.nombre;
  }  
    
    
    
    
    
}
