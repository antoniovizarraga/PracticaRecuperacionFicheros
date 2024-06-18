package lecturayescritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
	public static boolean EscribirFichero(String rutaFichero, String contenidoAEscribir) {

		boolean res = true;

		// Tiene que ponerse a null porque si no, el bw.flush() y el bw.close() no
		// funcionan.
		BufferedWriter bw = null;

		try {
			// Fijarse en este trozo de código más tarde para comprobar si añade los
			// datos en una nueva línea o sustituye su contenido
			bw = new BufferedWriter(new FileWriter(rutaFichero, true));

			bw.write(contenidoAEscribir);
			bw.newLine();

		} catch (IOException e) {
			System.err.println("Error de escritura del fichero: No se ha podido escribir el contenido"
					+ " en el fichero de texto.");
			res = false;
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.err.println("Error de escritura del fichero: No se ha podido guardar el contenido"
						+ " en el fichero de texto correctamente.");
				res = false;
			}
		}
		return res;
	}
}
