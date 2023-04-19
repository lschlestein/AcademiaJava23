package heranca.ex4;

import java.util.Scanner;

public class Netbook extends Computador {

	public static void main(String[] args) {
		var leitura = new Scanner(System.in);

		System.out.println("Insira a Marca:");
		marca = leitura.nextLine();
		leitura.close();

		System.out.println("Marca: " + marca + " modelo: " + modelo);

	}

}
