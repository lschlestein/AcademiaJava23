package heranca.ex3;

import java.util.Scanner;

public class Principal extends Funcionario {

	public static void main(String[] args) {

		var leitura = new Scanner(System.in);

		System.out.println("Insira nome:");
		nome = leitura.nextLine();
		System.out.println("Insira idade:");
		idade = Integer.parseInt(leitura.nextLine());
		System.out.println("Insira telefone:");
		telefone = leitura.nextLine();
		System.out.println("Insira setor:");
		setor = leitura.nextLine();
		System.out.println("Insira cargo:");
		cargo = leitura.nextLine();
		System.out.println("Insira funcao:");
		funcao = leitura.nextLine();
		leitura.close();

		exibirInformacoes();

	}

}
