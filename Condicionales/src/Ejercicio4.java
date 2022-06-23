import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("2 RECTAS");
		System.out.println("---------");
		
		System.out.println("Recta 1");
		System.out.println("Introduce num 1: ");
		float a1=teclado.nextFloat();
		System.out.println("Introduce num 2: ");
		float b1=teclado.nextFloat();
		System.out.println("Introduce num 3: ");
		float c1=teclado.nextFloat();
		
		System.out.println("Recta 2");
		System.out.println("Introduce num 1: ");
		float a2=teclado.nextFloat();
		System.out.println("Introduce num 2: ");
		float b2=teclado.nextFloat();
		System.out.println("Introduce num 3: ");
		float c2=teclado.nextFloat();

		if ( (a1/a2)!=(b1/b2) )	{
			System.out.println("Las rectas son secantes");
			if ( (a1/b1)==(-b2/a2) )
				System.out.println(" y perpendiculares");
			}	
		else {
			System.out.println("Las rectas son paralelas");
			if ( (a1/a2)==(c1/c2) )
				System.out.println(" y coincidentes");
			}	

	}

}
