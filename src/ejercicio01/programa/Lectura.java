package ejercicio01.programa;

import java.io.*;

public class Lectura {

	public static String LeerFichero(String rutaFichero) {
		
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

}
