/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que construye a un objeto profesor.
 * @author yaelb
 */
public class Profesor {
    String licenciatura;
    int conocimiento;
    boolean empatia;
    int cuenta;
    boolean inteligencia;
    /**
     * Constructor vacío de la clase profesor.
     */
    public Profesor() {}
    /**
     * Constructor que inicializa todos los atributos de la clase profesor.
     * @param licenciatura
     * @param conocimiento
     * @param empatia
     * @param cuenta
     * @param inteligencia 
     */
    public Profesor(String licenciatura, int conocimiento, boolean empatia, int cuenta, boolean inteligencia) {
         this.licenciatura = licenciatura;
         this.conocimiento = conocimiento;
         this.empatia = empatia;
         this.cuenta = cuenta;
         this.inteligencia = inteligencia;
    }
    /**
     * Método que imprime el mesnaje para exponer.
     */
    public void exponer() {
        System.out.println("El profesor ha expuesto");
    }
    /**
     * Método que imprime el mesaje para dirigir.
     */
    public void dirigir() {
        System.out.println("El profesor ha dirigido");
    }
    /**
     * Método que imrpime el mensaje para crear habilidad.
     */
    public void crearHabilidad() {
        System.out.println("El profesor ha creado habilidad");
    }
    /**
     * Método que imprime el mensaje para crear exámenes.
     */
    public void crearExamenes() {
        System.out.println("El profesor ha creado examenes");
    }
    /**
     * Método que imprime el mensaje para evaluar.
     */
    public void evaluar() {
        System.out.println("El profesor ha evaluado");
    }
}
