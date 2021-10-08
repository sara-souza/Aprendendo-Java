package agencia;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Carro[] carros = new Carro[2];
		
		carros[0] =  new Carro("Vw","Fox","Azul",15560,50,12,28500); 	
		carros[1] =  new Carro("Fiat","Palio","Prata",0,47,14,32000); 	
 	
		
		for(int i=0;i<carros.length;i++){
		System.out.println("Marca: " + carros[i].getMarca());	//Pegar a marca do objeto
		System.out.println("Modelo: " + carros[i].getModelo());	//Pegar o modelo do objeto
		System.out.println("Cor: " + carros[i].getCor());		//Pegar a cor do objeto
		System.out.println("Km: " + carros[i].getKm());			//Pegar o km do objeto
		System.out.println("Capacidade do Tanque: " + carros[i].getCapacidadeTanque());
		System.out.println("Km por Litro: " + carros[i].getKmPorLitro());
		System.out.println("Rodagem do Veículo: " + carros[i].calcularKm());
		System.out.println("Preço: " + carros[i].getPreco());
		System.out.println("Desconto: " + carros[i].calcularDesconto(2,2));
		System.out.println("Valor Com Desconto: " + carros[i].getValorComDesconto());
		System.out.println();
		}
		
		System.out.println("========================================================");
		System.out.println("Quantidade de Carros: " + Carro.getTotalCarros());
		//System.out.println("Total Valor de Carros: " + Carro.getTotalValorCarros);
		
	}

}
