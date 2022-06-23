import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
			Scanner teclado= new Scanner(System.in);
			System.out.println("MAYOR-MENOR-IGUAL");
			System.out.println("--------------------");
			
			System.out.println("Introduce num 1: ");
			int num1=teclado.nextInt();
			System.out.println("Introduce num 2: ");
			int num2=teclado.nextInt();

			if (num1>num2){
				System.out.println(num1 + " es mayor que "+num2);
			}
			else
				if (num1<num2){
					System.out.println(num2 + " es mayor que "+num1);
				}	
			else
				System.out.println(num1 + " y "+num2+" son iguales");

	}

}
