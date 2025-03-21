/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author yaelb
 */
public class POOP4 {

    /**
     * Método principal que inicializa la ejecución del porgrama
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        System.out.println(a);
        
        Punto punto = new Punto(); //Construcutor se llama igual que la clase
        System.out.println(punto); //Imprime la referencia del objeto
        punto.imprimePunto(); //Imprime los atributos del objeto
        punto.x = 3;
        punto.y = 6;
        punto.imprimePunto();
        
        Punto punto2 = new Punto(4,5);
        punto2.imprimePunto();
        
        System.out.println("*****Objeto Pokemon*****");
        Pokemon snorlax = new Pokemon();
        String objeto = "amuleto";
        snorlax.atacar();
        snorlax.curarse();
        snorlax.defender();
        snorlax.retirarse();
        snorlax.usarObjeto(objeto);
        
        System.out.println("*****Objeto perro*****");
        Perro nona = new Perro();
        nona.comer();
        nona.dormir();
        nona.caminar();
        nona.correr();
        nona.jugar();
        
        System.out.println("*****Objeto alumno*****");
        Alumno luis = new Alumno();
        luis.estudiar();
        luis.hacerTarea();
        luis.inscribirse();
        luis.hacerExamenes();
        luis.tomarApuntes();
        
        System.out.println("*****Objeto profesor*****");
        Profesor jose = new Profesor();
        jose.exponer();
        jose.dirigir();
        jose.crearHabilidad();
        jose.crearExamenes();
        jose.evaluar();
        //
    }
    
}
