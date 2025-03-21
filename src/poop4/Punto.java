/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que construye a un objeto punto.
 * @author yaelb
 */
public class Punto {
    int x;
    int y;
    /*
    public Punto(){
        x = 0;
        y = 0;
    }*/
    /**
     * Constructor vacío de la clase punto.
     */
    public Punto(){}
    /**
     * Constructor que inicializa todos los atributos de la clase punto.
     * @param x
     * @param y 
     */
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    /**
     * Método que imprime las coordenadas del punto.
     */
    public void imprimePunto(){
        System.out.println("x = "+x+", y = "+y);
    }
}
