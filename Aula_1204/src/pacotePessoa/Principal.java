package pacotePessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nome = "Paulo";
		pessoa2.nome = "Roberto";
		
		System.out.println("Nome:"+pessoa1.nome);
		System.out.println("Nome:"+pessoa2.nome);

	}

}
