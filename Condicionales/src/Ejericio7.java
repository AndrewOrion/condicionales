import java.util.Scanner;

public class Ejericio7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("EL MAYOR DE 3 NUMEROS");
		System.out.println("--------------------");
		
		System.out.println("Introduce sueldo: ");
		float sueldo=teclado.nextFloat();
		System.out.println("Introduce num hijos: ");
		int hijos=teclado.nextInt();
		float res=0, impuesto=0, descuento=0;

		if ( sueldo>=1000 && sueldo<1600 ) {	
			impuesto=0.05f;
			descuento=0.01f*hijos;
				
			if (descuento>0.1f)
				descuento=0.1f;
		}
		else if ( sueldo>=1600 && sueldo<3000 ) {	
			impuesto=0.1f;
			descuento=Math.min(0.1f, 0.01f*hijos);
		}	
		else if ( sueldo>=3000 && sueldo<4600 ) {	
			impuesto=0.15f;
			descuento=Math.min(0.1f, 0.01f*hijos);
		}
		else if ( sueldo>=4600 ) {	
			impuesto=0.2f;
			descuento=Math.min(0.15f, 0.015f*hijos);
		}
		
		res=sueldo*impuesto;
		res=res-res*descuento;
		System.out.println("Impuestos: "+res);

	}

}
