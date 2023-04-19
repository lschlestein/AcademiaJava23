package heranca.ex1;

import java.util.Scanner;

/*Crie uma classe Principal para solicitar e exibir na tela as informações de nome, e-mail e telefone do usuÃ¡rio. 
 * Esses atributos são herdados da classe Usuario.Usuario
*/
public class Principal extends Usuario{

	public static void main(String[] args) {
		var leitura = new Scanner(System.in);
		System.out.println("Insira o nome:");
		nome = leitura.nextLine();
		System.out.println("Insira o email:");
		email = leitura.nextLine();
		System.out.println("Insira o telefone:");
		telefone = leitura.nextLine();
		leitura.close();
		exibirInformacoes();
	}

}
