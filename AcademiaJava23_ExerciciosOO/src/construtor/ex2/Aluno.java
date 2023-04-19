/*2) Criar uma classe chamada Aluno com 3 construtores, sendo que o primeiro recebe o nome e a matrícula do aluno, 
 * o segundo recebe apenas a data de nascimento do aluno e o terceiro construtor recebe o nome do aluno, a data de 
 * nascimento e o ano em que o aluno ingressou na faculdade. Crie uma classe principal, com 3 objetos, 
 * cada um instanciando a classe com um construtor diferente.
 * */

package construtor.ex2;

public class Aluno {
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", dataNascimento=" + dataNascimento
				+ ", dataIngresso=" + dataIngresso + "]";
	}

	String nome;
	int matricula;
	String dataNascimento;
	String dataIngresso;

	public Aluno(String nomeAluno, int matriculaAluno) {
		nome = nomeAluno;
		matricula = matriculaAluno;
	}

	public Aluno(String dataNasicmentoAluno) {
		dataNascimento = dataNasicmentoAluno;
	}

	public Aluno(String nomeAluno, String dataNascimentoAluno, String dataIngressoAluno) {
		nome = nomeAluno;
		dataNascimento = dataNascimentoAluno;
		dataIngresso = dataIngressoAluno;
	}

}
