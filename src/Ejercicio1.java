
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		String DNI;
		Scanner sc = new Scanner(System.in);
		DNI = sc.nextLine();
		// Pasar la letra de char a string
		char letra = DNI.charAt(8);
		String numeros = DNI.substring(0, DNI.length() - 1);
		int numeros1 = Integer.parseInt(numeros);
		int resto = numeros1 % 23;
		String mapa = "TRWAGMYFPDXBNJZSQVHLCKE";
		char posicion = mapa.charAt(resto);
		if (posicion == letra) {
			System.out.println("DNI valido");
		} else {
			System.out.println("DNI no valido");
		}
		sc.close();
	}
}
