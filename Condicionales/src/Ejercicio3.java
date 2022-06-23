import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("AJEDREZ");
		System.out.println("-------");

		System.out.println("PIEZA 1 ");
		System.out.println("Introduce fila: ");
		int fila1=teclado.nextInt();
		System.out.println("Introduce columna: ");
		int col1=teclado.nextInt();
		
		System.out.println("PIEZA 2 ");
		System.out.println("Introduce fila: ");
		int fila2=teclado.nextInt();
		System.out.println("Introduce columna: ");
		int col2=teclado.nextInt();
		
		if (fila1==fila2) {
		System.out.println("Las piezas están en la misma fila");
		}
		
		if (col1==col2) {
			System.out.println("Las piezas están en la misma columna");
		}
		
		if ( (fila1-fila2)==(col1-col2) ) {
			
		}
	}

}
