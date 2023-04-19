package construtor.ex1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa;
		var leitura = new Scanner(System.in);
		int opcao;
		System.out.println("Deseja criar pessoa com um ou dois construtores");

		do {
			System.out.println("1 = idade e 2 = nome e idade");
			opcao = Integer.parseInt(leitura.nextLine());
		} while (opcao != 1 && opcao != 2);

		switch (opcao) {
		case 1:
			System.out.println("Digite a idade:");
			pessoa = new Pessoa(Integer.parseInt(leitura.nextLine()));
			System.out.println(pessoa);
			leitura.close();
			break;

		case 2:
			System.out.println("Digite o nome:, digite 'Enter' e após a idade:");
			pessoa = new Pessoa(leitura.nextLine(), Integer.parseInt(leitura.nextLine()));
			System.out.println(pessoa);
			leitura.close();
			break;
		}

	}
}
