package pacoteCarro;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro("Jetta");
		Carro carro2 = new Carro();
		Scanner leitura = new Scanner(System.in);
		
		String fabricante;
		String modelo;
		
		
		//System.out.println("Insira o Fabricante do Carro");
		//fabricante = leitura.nextLine();
		//System.out.println("Insira o Modelo do Carro");
		//modelo = leitura.nextLine();
		//leitura.close();
		
		//carro.atribuirDados(fabricante, modelo);
		carro.ligar();
		carro.desligar();
		carro.exibirDados();
		
		
	}

}
