package pacoteCalculadora;

public class Principal {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		System.out.println("Somando:" + String.valueOf(c.somar(3, 5)));
		System.out.println("Subtraindo Interface:"+String.valueOf(c.calcular(4, 1)));
	}

}
