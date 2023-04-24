package pessoa;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o nome:");
		String nome = s.nextLine().toString();
		
		System.out.println("Insira o nome:");
		p1.setNome(nome);
		System.out.println("O nome da pessoa é:"+p1.getNome());

	}

}
