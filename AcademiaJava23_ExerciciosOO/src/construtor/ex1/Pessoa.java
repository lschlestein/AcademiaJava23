package construtor.ex1;

/*1) Criar uma classe chamada Pessoa com 2 construtores, um que receba o nome e a idade 
 * da pessoa e outro recebendo apenas a idade. Solicite ao usuário qual dos construtores 
 * ele gostaria de utilizar na instanciação da classe. Além de receber parâmetros, 
 * os construtores imprimem na tela o conteúdo dos parâmetros recebidos.
*/
public class Pessoa {
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	String nome;
	int idade;

	public Pessoa(String nomePessoa, int idadePessoa) {
		nome = nomePessoa;
		idade = idadePessoa;
	}

	public Pessoa(int idadePessoa) {
		idade = idadePessoa;
	}
}
