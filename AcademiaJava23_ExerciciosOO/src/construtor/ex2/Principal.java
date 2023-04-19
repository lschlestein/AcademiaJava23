package construtor.ex2;
/*2) Criar uma classe chamada Aluno com 3 construtores, sendo que o primeiro recebe o nome e a matrícula do aluno, 
 * o segundo recebe apenas a data de nascimento do aluno e o terceiro construtor recebe o nome do aluno, a data de 
 * nascimento e o ano em que o aluno ingressou na faculdade. Crie uma classe principal, com 3 objetos, 
 * cada um instanciando a classe com um construtor diferente.
 * */

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Lucas", 123456);
		Aluno aluno2 = new Aluno("27/03/1990");
		Aluno aluno3 = new Aluno("Lucas", "27/03/1990", "01/05/2020");
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);
	}

}
