package Logica;
import java.util.*;
import java.text.*;

public class Calcular {
	/**
	 * @param args sirven para colocar cosas 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n;
		double f,p;
		double i=13.0/100;
		System.out.println("ingrese luka, pa movela y que se active, el dinero quieto no produce riqueza: ");
		p= scanner.nextDouble();
		System.out.println("Ingrese la cantidad de tiempo en que dejara el dinero :");
		n=scanner.nextDouble();
		
		// pa todo se tiene que instaciar 
		double traer = metodos.formulaInteres(p,n,i);
		DecimalFormat df = new DecimalFormat("#,###.00");
        String traerFormateado = df.format(traer);
		
		System.out.println("aqui essta: "+ traerFormateado); 	
		

	}
	// aqui se calcula con la formula magica jajaja
	

	
	

}
