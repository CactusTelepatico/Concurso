
/**
 * @author Amigos y Mendi-gos.
 */
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String valor1 = "";
		String valor2 = "";
		String valor3 = "";
		
		Scanner sc = new Scanner(System.in);
		//el usuario introduce los valores 
		valor1 = sc.nextLine();
		valor2 = sc.nextLine();
		valor3 = sc.nextLine();
		
		String[] comida = { valor1, valor2, valor3 };
		//recorremos el array
		for (int i = 0; i < comida.length; i++) {
			String[] partes = comida[i].split(":");
			System.out.println(partes[1] + ": " + ((int) (Math.random() * 5) + 5 + "," + ((int) (Math.random() * 9))
					+ ((int) (Math.random() * 9)) + "€"));
		}

	}
}
