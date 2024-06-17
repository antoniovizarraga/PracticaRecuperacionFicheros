package ejercicio02.programa;

import lecturayescritura.Lectura;

public class Programa {

	public static void main(String[] args) {

		String rutaFichero = "src/ejercicio02/ficherotexto/Enteros.txt";
		
		String numerosCadena = Lectura.LeerFicheroConScanner(rutaFichero);
		
		System.out.println(numerosCadena);
		
		String[] numeros = numerosCadena.split(" ");
		
		int suma = 0;
		int media = 0;
		
		for(String valor : numeros) {
			suma += Integer.valueOf(valor);
		}
		
		media = suma / numeros.length;
		
		System.out.println("La suma total es: " + suma);
		System.out.println("La media aritmética es: " + media);
		System.out.println();
		
		
		
	}

}
