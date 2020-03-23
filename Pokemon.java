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
public abstract class Pokemon {

    protected int ataque;
    protected int defensa;
    protected int ps;
    protected double level;
    protected int nivel;
    protected String nombre;
    protected String tipo;
    protected int type;
    protected int danio;

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected void ficha() {

        System.out.println("\n Nombre:" + this.nombre);
        System.out.print(" Nivel:" + this.nivel);
        System.out.print(" Tipo:" + this.tipo);
        System.out.print(" ps:" + this.ps);
        System.out.print(" Ataq:" + this.ataque);
        System.out.print(" Def:" + this.defensa);

    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Pokemon() {
    }

    public Pokemon(String nombre) {
        this.nombre = nombre;///hacemos que con el math random enlazamos un numero al nombre del pokemon que va a aparecer
    }

    protected void ataque() {
    }

    ;
    protected void recibir() {
    }

    ;
    
    
    

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int atack() {
        return this.danio;

    }

    public void recibe() {
    }

    protected String tficha() {

        return "(Nivel:" + this.nivel + " Tipo:" + this.tipo + " ps:" + this.ps + " Ataq:" + this.ataque + " Def:" + this.defensa + ")";

    }

    public void present(Pokemon p[], Pokemon y[]) {
        System.out.println("Estos son los Pokemons de cada participante \n");
        System.out.println("\t" + p[0].nombre + "\t\t\t\t\t\t\t" + y[0].nombre);
        System.out.println("-------------------------------------------------|-----------------------------------------------------------------------");
        for (int u = 1; u < 4; u++) {
            System.out.print("         " + p[u].nombre.toUpperCase() + "\t\t\t\t |\t\t\t      " + y[u].nombre.toUpperCase() + "\n");
            System.out.print(p[u].tficha() + "\t | \t  " + y[u].tficha() + "\n");
            System.out.println("-------------------------------------------------|-----------------------------------------------------------------------");
        }
        System.out.println("-------------------------------------------------|-----------------------------------------------------------------------");
    }

}
