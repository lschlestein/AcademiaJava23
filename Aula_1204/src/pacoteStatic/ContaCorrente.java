package pacoteStatic;

public class ContaCorrente {
	private static int ultimaCC=2;
	private int nCC;
	public int contaNaoEstatica=10;
	
	public void ultimaCC() {
		System.out.println(ultimaCC);
	}
	public ContaCorrente() {
		nCC = ultimaCC;
		System.out.println("Nova conta aberta n: "+nCC);
		ultimaCC++;
	}

	public int getnCC() {
		return nCC;
	}

	public void setnCC(int nCC) {
		this.nCC = nCC;
	}

}
