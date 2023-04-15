package pacoteCalculadora;

public class Calculadora implements Icalculadora{
	
	public double somar(double a, double b) {
		return a+b;
	}
	
	public double multiplicar(double a, double b) {
		return a*b;
	}

	@Override
	public int calcular(int a, int b) {
		return a-b;
	}

}
