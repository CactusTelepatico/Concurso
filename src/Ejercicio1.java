/**
 * @author Amigos y Mendi-gos. 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		Scanner scv = new Scanner(System.in);
		String DNI;
		int valor;
		valor = scv.nextInt();
		for (int i = 0; i < valor; i++) {
			DNI = sc.nextLine();
			// Pasar la letra de char a string
			char letra = 0;
			String numeros = DNI.substring(0, DNI.length() - 1);
			int numeros1 = 0;
			
			//se prueba el codigo
			try {
				numeros1 = Integer.parseInt(numeros);
			} catch (NumberFormatException excepcion) {
				System.out.println("DNI muy largo");
			}
			try {
				letra = DNI.charAt(8);
			} catch (IndexOutOfBoundsException excepcion2) {
				System.out.println("DNI muy corto");
			}
			
			//prueba de asignacion de letra
			int resto = numeros1 % 23;
			String mapa = "TRWAGMYFPDXBNJZSQVHLCKE";
			char posicion = mapa.charAt(resto);
			if (posicion == letra) {
				System.out.println("DNI valido");
			} else {
				System.out.println("DNI no valido");
			}
		}

	}
}
