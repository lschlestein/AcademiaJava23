
public class Principal {

	public static void main(String[] args) {
		
		Carro fusca, c1, c3;
		fusca= new Carro(3000);
		System.out.println(fusca.getAno());
		fusca= new Carro("Fusca", "1300", 1969);
		System.out.println(fusca.getAno());
		
		c1 = new Carro();
		System.out.println(c1.getAno());
		
		
		
		c1 = new Carro(2000);
		fusca.setAno(1234);
		System.out.println("o ano do carro é "+ fusca.getAno());
		fusca = new Carro();
		fusca.setAno(2023);
		System.out.println("o ano do carro é "+ fusca.getAno());
		System.out.println(fusca);
	}

}
