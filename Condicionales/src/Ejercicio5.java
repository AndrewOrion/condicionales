import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("BISIESTO");
		System.out.println("--------------------");
		
		System.out.println("Introduce año: ");
		int ano=teclado.nextInt();
		

		if (ano%4==0)  {	
				if ( (ano%100==0 && ano!=0) )
					System.out.println(ano + " no es bisiesto");
				else
					System.out.println(ano + " es bisiesto");
		}
		else
			System.out.println(ano + " no es bisiesto");

	}

}
