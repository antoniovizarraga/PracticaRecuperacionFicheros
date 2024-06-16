package ejercicio01.programa;


public class Principal {

	public static void main(String[] args) {
		String rutaFichero = "src/ejercicio01/ficherotexto/NumerosReales.txt";
		
		String contenido = Lectura.LeerFichero(rutaFichero);
		
		System.out.println(contenido);
		
		contenido = contenido.replace("\n", " ");
		
		String[] numeros = contenido.split(" ");
		
		double suma = 0;
		double media = 0;
		
		for(String valor : numeros) {
			suma += Double.valueOf(valor);
		}
		
		media = suma / numeros.length;
		
		System.out.println("La suma total es: " + suma);
		System.out.println("La media aritmética es: " + media);
		System.out.println();

	}

}
