package practica2;
import java.util.Scanner;

/**
 * Clase que calcula la nota final de un estudiante basándose en las notas de tres unidades formativas.
 * Permite ingresar las notas de cada unidad, verifica si las notas son válidas, calcula la nota final,
 * y determina si el estudiante ha aprobado o suspendido basado en esa nota final.
 * 
 * @author Alejandro
 * @version 1.0
 * @since 4/3/1993
 */
public class Practica2 {
    // Variables para almacenar las notas de las unidades formativas y el cálculo de la nota final.
    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;
    
    // Scanner para la entrada de datos del usuario.
    Scanner entrada = new Scanner(System.in);
    
    /**
     * Solicita al usuario que ingrese las notas de las tres unidades formativas del estudiante.
     * Las notas se leen desde la entrada estándar y se almacenan en las variables uf1, uf2 y uf3.
     * 
     * @param uf1
     * @param uf2
     * @param uf3
     * 
     */
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();
        
        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();
        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }
    
    /**
     * Verifica que las notas ingresadas estén dentro del rango válido (0 a 10).
     * Imprime un mensaje para cada nota indicando si fue correctamente introducida o no.
     */
    public void comprobarcion() {
        System.out.println(uf1 > 10 ? "Nota 1 mal introducida" : "Nota 1 correcta");
        System.out.println(uf2 > 10 ? "Nota 2 mal introducida" : "Nota 2 correcta");
        System.out.println(uf3 > 10 ? "Nota 3 mal introducida" : "Nota 3 correcta");
    }
    
    /**
     * Calcula la nota final del estudiante basándose en las notas introducidas.
     * Utiliza una ponderación específica para cada nota (35%, 35%, 30%) para calcular la nota final.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }
    
    /**
     * Muestra las notas introducidas por el usuario, los acumulados calculados para cada unidad formativa,
     * y @returns la nota final del estudiante.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva es = " + def);
    }

    /**
     * Determina si el estudiante ha aprobado o suspendido basado en la nota final.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendido");
        } else if (def >= 5 && def <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Error en las notas");
        }
    }
    
    /**
     * Método principal que ejecuta la aplicación.
     * Crea una instancia de Practica2 y ejecuta los métodos para ingresar notas, verificarlas,
     * calcular la nota final, mostrar los resultados y determinar si el estudiante ha aprobado.
     * 
     * @param 
     */
    public static void main(String[] args) {
        Practica2 fc = new Practica2();
        
        fc.IngresaNotas();
        fc.comprobarcion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}
