package teste;

public class TesteVetor {

	public static void main(String[] args) {
		
		//1° Exemplo
		int[] valores = new int[5];
		valores[0] = 10;
		valores[1] = 5;
		valores[2] = 14;
		valores[3] = 50;
		valores[4] = 28;
		
		System.out.println("valores[0]: " + valores[0]);
		System.out.println("valores[1]: " + valores[1]);
		System.out.println("valores[2]: " + valores[2]);
		System.out.println("valores[3]: " + valores[3]);
		System.out.println("valores[4]: " + valores[4]);
		
		System.out.println();
		
		//2° Exemplo
		int[] valores2 = {10,5,14,50,28};
		
		for(int i=0;i<5;i++) {
			System.out.println("valores[" + i + "]: " + valores2[i]);
		}
		
	

	}

}
