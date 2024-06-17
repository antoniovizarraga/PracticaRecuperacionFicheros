package lecturayescritura;

import java.io.*;
import java.util.Scanner;

public class Lectura {

	public static String LeerFicheroConBufer(String rutaFichero) {
		
		String contenido = "";
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(rutaFichero));
			
			try {
				linea = br.readLine();

				while (linea != null) {
					contenido += linea + "\n";
					linea = br.readLine();
				}
			} catch (IOException e) {
				System.err.println("Error de lectura del fichero: No se ha podido leer el fichero correctamente.");
			}
			
			
			try {
				br.close();
			} catch (IOException e) {
				System.err.println("Error de lectura del fichero: No se ha podido cerrar el búfer de lectura.");
			}

		} catch (FileNotFoundException e) {
			System.err.println("Fichero de texto no encontrado.");
		}
		
		return contenido;

	}
	
	public static String LeerFicheroConScanner(String rutaFichero) {
		Scanner sc;
		
		String contenido = "";
		
		try {
			sc = new Scanner(new FileReader(rutaFichero));
			
			
			while(sc.hasNextInt()) {
				contenido += sc.nextInt() + " ";
			}
			
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fichero de texto no encontrado.");
		}
		
		
		
		return contenido;
		
		
	}

}
