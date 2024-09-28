package Logica;
import java.util.Scanner;

public class Probar {
    public static void main(String[] args) {
    	
    	
    	
    	System.out.println("Este es un mensaje nuevo para aprender github");
        Scanner scanner = new Scanner(System.in);
        double n;
        double f, p;
        double i = 12.0 / 100;  // Usar 12.0 para que la división sea decimal
        
        // Solicitar el capital
        System.out.println("Ingrese el capital inicial (p): ");
        p = scanner.nextDouble();
        
        // Solicitar el tiempo en años
        System.out.println("Ingrese la cantidad de tiempo (n) en años: ");
        n = scanner.nextDouble();
        
        // Calcular el interés compuesto usando el método estático
        double traer = formulaInteres(p, n, i);
        
        // Mostrar el resultado
        System.out.println("El valor futuro con interés compuesto es: " + traer);
    }
    
    // Método que calcula el interés compuesto
    public static double formulaInteres(double p, double n, double i) {
        double f;
        f = Math.pow((1 + i), n) * p;  // Fórmula de interés compuesto
        return f;
    }
}
