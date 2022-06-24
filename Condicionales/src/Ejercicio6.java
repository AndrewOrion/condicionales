import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("CALCULADORA");
		System.out.println("--------------------");
		
		System.out.println("Introduce num 1: ");
		float num1=teclado.nextFloat();
		System.out.println("Introduce num 2: ");
		float num2=teclado.nextFloat();
		
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicacion");
		System.out.println("4: Division");
	
		int opcion=teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("La suma es: "+(num1+num2));
			break;
		case 2:
			System.out.println("La resta es: "+(num1-num2));
			break;
		case 3:
			System.out.println("La multiplicación es: "+(num1*num2));
			break;
		case 4:
			System.out.println("La división es: "+(num1/num2));
			break;
		default: 
			System.out.println("Opción incorrecta");

		}
	}
}
