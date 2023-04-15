import java.util.Scanner;

public class Carro {
	private String modelo;
	private String cilindrada;
	private int ano;
	private Scanner s = new Scanner(System.in);

	public Carro(int ano) {
		this.ano = ano;
		System.out.println("Recebi" + this.ano + "como parâmetro");
	}

	public Carro() {
		System.out.println("Insira o ano:");
		try {
			this.ano = s.nextInt();
		} catch (Exception e) {
			System.out.println("Erro de digitação: "+e);
		}
	}

	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public Carro(String modelo) {
		super();
		this.modelo = modelo;
	}

	public Carro(String modelo, String cilindrada) {
		super();
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}

	public Carro(String modelo, String cilindrada, int ano) {
		super();
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Carro modelo=" + modelo + ", ano=" + ano;
	}

}
