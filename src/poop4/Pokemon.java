
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que construye a un objeto pokemon.
 * @author yaelb
 */
public class Pokemon {
    int ataque;
    int defensa;
    int defensaEsp;
    int ataqueEsp;
    float velocidad;
    /**
     * Csontructor vacío de la clase pokemon.
     */
    public Pokemon(){}
    /**
     * Constructor que inicializa todos los atributos de la clase pokemon.
     * @param ataque
     * @param defensa
     * @param defensaEsp
     * @param ataqueEsp
     * @param velocidad 
     */
    public Pokemon(int ataque, int defensa, int defensaEsp, int ataqueEsp, float velocidad) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.defensaEsp = defensaEsp;
        this.ataqueEsp = ataqueEsp;
        this.velocidad = velocidad;
    }
    /**
     * Método que imprime el mansaje de atacar.
     */
    public void atacar() {
        System.out.println("Te voy a atacar");
    }
    /**
     * Método que imprime el mensaje de usar un objeto.
     */
    public void usarObjeto(String objeto) {
        System.out.println("He usado el objeto "+objeto);   
    }
    /**
     * Método que imprime el mensaje para retirarse.
     */
    public void retirarse() {
        System.out.println("Se retira");
    }
    /**
     * Método que imprime el mensaje para curarse.
     */
    public void curarse() {
        System.out.println("Me voy a curar");
    }
    /**
     * Método que imprime el mensaje para defenderse.
     */
    public void defender() {
        System.out.println("Me voy a defender");
    }
    
    
}
