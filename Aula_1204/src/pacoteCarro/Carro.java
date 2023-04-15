package pacoteCarro;

public class Carro {
	private String fabricante = "Vw";
	private String modelo = "Fusca";

	public void ligar() {
		System.out.println("Carro ligado");
	}
	
	public void desligar() {
		System.out.println("Carro desligado");
	}
	
	public void exibirDados() {
		System.out.println("Dados: "+ fabricante + " "+ modelo);
	}
	
	public void atribuirDados(String fabricanteCarro, String modeloCarro) {
		fabricante = fabricanteCarro;
		modelo = modeloCarro;
	}
	
	public Carro(String fabricanteCarro, String modeloCarro) {
		fabricante = fabricanteCarro;
		modelo = modeloCarro;
	}
	public Carro() {
		
	}
	
	public Carro(int anoCarro, String modeloCarro) {
		
	}
	
	public Carro(String modeloCarro) {
		System.out.println("Construtor String "+modeloCarro);
	}
	public Carro(int fabricanteCarro) {
		System.out.println("Construtor inteiro");
	}
}
