package pacoteStringArgs;

public class ExemploArgs {

	public static void main(String[] args) {
		int i;
		
		if(args.length>0) {
			System.out.println("Foram passados por parametro " + args.length+" valores");
			for(i=0;i<args.length;i++) {
				System.out.println("args["+args[i]+"]");
				
			}
		}else {
			System.out.println("Não foram encontrados parâmetros no vetor args");
		}

	}

}
