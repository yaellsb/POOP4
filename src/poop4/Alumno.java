/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que construye a un objeto alumno. 
 * @author yaelb
 */
public class Alumno {
    int numeroCuenta;
    String carrera;
    int semestre;
    float promedio;
    String nombre;
    /**
     * Cosntructor vacío de la clase alumno.
     */
    public Alumno() {}
    /**
     * Cosntructor que inicializa todos los atributos de la clase alumno.
     * @param numeroCuenta
     * @param carrera
     * @param semestre
     * @param promedio
     * @param nombre 
     */
    public Alumno(int numeroCuenta, String carrera, int semestre, float promedio, String nombre) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
        this.nombre = nombre;
    }
    /**
     * Método que imprime el mensaje para estudiar.
     */
    public void estudiar() {
        System.out.println("El alumno esta estudiando");
    }
    /**
     * Método que imprime el mensaje para hacer tarea.
     */
    public void hacerTarea() {
        System.out.println("El alumno esta haciendo tarea");
    }
    /**
     * Método que imprime el mensaje para inscripción.
     */
    public void inscribirse() {
        System.out.println("El alumno se inscribio");
    }
    /**
     * Método que imprime el examen para hacer examen.
     */
    public void hacerExamenes() {
        System.out.println("El alumno esta haciendo un examen");
    }
    /**
     * Método que imprime el mesaje para tomar apuntes.
     */
    public void tomarApuntes() {
        System.out.println("El alumno esta tomando notas");
    }
}
