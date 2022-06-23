import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("POSICION CENTRAL");
		System.out.println("--------------------");
		
		System.out.println("Introduce num 1: ");
		float num1=teclado.nextFloat();
		System.out.println("Introduce num 2: ");
		float num2=teclado.nextFloat();
		System.out.println("Introduce num 3: ");
		float num3=teclado.nextFloat();

		if ( ( (num1>num2) && (num1<num3) ) || ( (num1<num2) && (num1>num3) ) ) {	
				System.out.println(num1 + " es el central");
			}	
		else
			if ( ( (num2>num1) && (num2<num3) ) || ( (num2<num1) && (num2>num3) )  ){				
				System.out.println(num2 + " es el central");
			}
		else
				System.out.println(num3 + " es el central");
		

}

}
