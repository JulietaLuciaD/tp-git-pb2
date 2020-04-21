import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b = 0;
		Integer opcion;
		Scanner teclado = new Scanner(System.in);
		Integer resultado = null;
		
		do {
			System.out.println("Ingrese su operación \n 1 para multiplicar \n 2 para restar \n 3 para sumar \n 4 para dividir");
			opcion = teclado.nextInt();
		} while (opcion < 1 && opcion > 4);
		
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		switch (opcion) {
		case 3:
			resultado = sumar(a, b);
			break;
		case 2:
			resultado = restar(a, b);
			break;
		case 1:
			resultado = multiplicar (a, b);
			break;
		case 4:
			if (b != 0) {
				resultado = dividir(a, b);
			}
			else System.out.println("No se puede dividir por 0");
		
			break;
		default: 
			break;
		}
		
		System.out.println("El resultado es " + resultado);
	}

	private static Integer multiplicar(Integer a, Integer b) {
		return a*b;
	}

	private static Integer restar(Integer a, Integer b) {
		return a-b;
	}

	private static int sumar(Integer a, Integer b) {
		return a + b;
		
	}
	private static Integer dividir(Integer a, Integer b) {
		return a/b;
	}

	
}