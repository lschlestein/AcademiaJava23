package heranca.ex1;

/*Crie uma classe Principal para solicitar e exibir na tela as informações de nome, e-mail e telefone do usuário. 
 * Esses atributos são herdados da classe Usuario.
*/

public class Usuario {

	protected static String nome;
	protected static String email;
	protected static String telefone;

	protected static void exibirInformacoes() {
		System.out.println("Nome: " + nome + " Email: " + email + " Telefone: " + telefone);
	}

}
