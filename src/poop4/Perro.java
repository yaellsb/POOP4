/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que construye a un objeto perro.
 * @author yaelb
 */
public class Perro {
    String nombre;
    String raza;
    String colorPelo;
    String colorOjos;
    float size;
    /**
     * Constructor vacío de la clase perro.
     */
    public Perro() {}
    /**
     * Constructor que inicializa todos los atributos de la clase perro.
     * @param nombre
     * @param raza
     * @param colorPelo
     * @param colorOjos
     * @param size 
     */
    public Perro(String nombre, String raza, String colorPelo, String colorOjos, float size) {
        this.nombre = nombre;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
        this.size = size;
    }
    /**
     * Método que imprime el mensaje para comer.
     */
    public void comer() {
        System.out.println("El perro esta comiendo");
    }
    /**
     * Método que imprime el mensaje para dormir.
     */
    public void dormir() {
        System.out.println("El perro esta durmiendo");
    }
    /**
     * Método que imprime el mensaje para correr.
     */
    public void correr() {
        System.out.println("El perro esta corriendo");
    }
    /**
     * Método que imprime el mesaje para caminar.
     */
    public void caminar() {
        System.out.println("El perro esta caminando");
    }
    /**
     * Método que imprime el mensaje para jugar.
     */
    public void jugar() {
        System.out.println("El perro esta jugando.");
    }
}
