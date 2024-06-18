package ejercicio05.programa;

import java.util.Scanner;

import lecturayescritura.Escritura;

import java.util.InputMismatchException;

public class Aplicacion {

	public static void main(String[] args) {

		String nombre = "";

		int edad;

		String contenidoGuardado = "";

		boolean estadoEscritura;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduzca su nombre: ");
			nombre = sc.nextLine();

			System.out.println("Introduzca su edad: ");
			edad = sc.nextInt();

			contenidoGuardado = nombre + ":" + edad;

			estadoEscritura = Escritura.EscribirFichero("src/ejercicio05/ficherotexto/datos.txt", contenidoGuardado);
			
			if(estadoEscritura) {
				System.out.println("Datos escritos con éxito.");
			} else {
				System.out.println("Los datos no pudieron escribirse en el fichero.");
			}

		} catch (InputMismatchException e) {
			System.err.println("Error: Has intentado introducir un valor con decimales o una letra"
					+ " en el apartado de la edad.");
		}

	}

}
