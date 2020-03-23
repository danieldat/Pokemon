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
public class Planta extends Pokemon implements Ataques{
    
    
    private int aleatorio=(int)(Math.random()*10);   
 private String salvaje;  
 private int poder;
    
 
 private String genera(){
   switch (aleatorio){
       case 1:salvaje="Bulbasur  ";poder=100;break;
       case 2:salvaje="Odish     ";poder=30;break;
       case 6:salvaje="Odish     ";poder=50;break;
       case 7:salvaje="Bellsprout";poder=20;break;
       case 3:salvaje="Ponita    ";poder=50;break;
       case 4:salvaje="Chikorita ";poder=100;break;
       case 8:salvaje="Chikorita ";poder=150;break;
       case 9:salvaje="Odish     ";poder=10;break;
       case 10:salvaje="Bellsprout";poder=10;break;
       case 5:salvaje="Celebi    ";poder=400;break;
       case 0:salvaje="Tangela   ";poder=120;break;
   }
   return salvaje;
 }
 


 
 
  public  Planta(){
  
      
      
  setNombre(genera());
  setDefensa(gen()+poder);
  setLevel(experiencia());
  setNivel(1+up());
  setPs(200+(poder/4));
  setTipo("Planta");
  setAtaque(gen()+poder); 
  
  }
  
  private int gen(){
  return (int)(Math.random()*100);
  }
 
  @Override
  public void recibe(){
  
  }
  
  public double experiencia(){
  double exp=(Math.random()*1000);    
  return this.level+exp;
  
  }
  
  public int up(){
  if(this.level>=4000){
  this.nivel+=1;this.level=0;
  }
  return this.nivel;
  
  }
  
  
  
  
  
/////en modo poke test habra una movida que restara ps
   public int  atack(){
    return getAtaque();
      
       
  }
    @Override
    public int placaje(){
    int at=20;
    return at;
    }
    
    
    
    
    
    
    
    
}

    

