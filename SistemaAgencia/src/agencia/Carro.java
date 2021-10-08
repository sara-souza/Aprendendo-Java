package agencia;

 class Carro {
	 
	 //construtor personalizado
	 public Carro(String marca, String modelo, String cor, int km, int capacidadeTanque, int kmPorLitro, double preco, int totalCarros) {
		 this.marca = marca;
		 this.modelo = modelo;
		 this.cor = cor;
		 
		 if(km>=0 && km<=20000) {
			 this.km = km;
		 }else {
			 System.out.println("Quilometragem Alta");
			 System.exit(0);
		 }
		 this.km = km;
		 this.capacidadeTanque = capacidadeTanque;
		 this.kmPorLitro = kmPorLitro;
		 this.preco = preco;
		 Carro.totalCarros += 1;
		 
	 }
	
 
	 public Carro(int km) {
		 
		 if(km>=0 && km<=20000) {
			 this.km = km;
		 }else {
			 System.out.println("Quilometragem Alta");
			 System.exit(0);
		 }
		 Carro.totalCarros += 1;
	 }
	 
	 //Construtot Padrão
	 public Carro() {
		 Carro.totalCarros += 1;
		 
	 }
	 
	 //Propriedades ou Atributos
	 private String marca;
	 private String modelo;
	 private String cor;
	 private int km;
	 private int capacidadeTanque;
	 private int kmPorLitro;
	 private double preco;
	 private double valorComDesconto;
	 private static int totalCarros;
	
	 
	 
	 
	 //Métodos para acessar as propriedades/atributos dp objeto
	 
	 
	 public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public int getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(int kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}
	
	

	public static int getTotalCarros() {
		return totalCarros;
	}

	//Método
	 int calcularKm() {
		 return this.capacidadeTanque * this.kmPorLitro;
	 }
	 
	 double calcularDesconto(double percentualDescontoVendedor) {
		
		 if(percentualDescontoVendedor>=0 && percentualDescontoVendedor<=4) {
		return this.preco * (percentualDescontoVendedor/100);
		 }else if(percentualDescontoVendedor < 0) {
			 return 0.0;
		 }else {
			 return this.preco * 0.04;
		 }
			 }
	 
	 double calcularDesconto(double percentualDescontoVendedor, double percentualDescontoGerente) {
		 
		 //Alterar o percentual do Vendedor se a venda for menor que 0 ou maior que 4
		 if(percentualDescontoVendedor<0) {
			 percentualDescontoVendedor = 0;
		 }else if(percentualDescontoVendedor>4) {
			 percentualDescontoVendedor = 4;
		 }
		 
		//Alterar o percentual do Gerente se a venda for menor que 0 ou maior que 2
		 if(percentualDescontoGerente<0) {
			 percentualDescontoGerente = 0;
		 }else if(percentualDescontoGerente>2) {
			 percentualDescontoGerente = 2;
		 }
		 
		//Efetuar o cálcular de desconto
		 double desconto =  this.preco * ((percentualDescontoVendedor/100) + (percentualDescontoGerente/100));
		 this.valorComDesconto = preco - desconto;
		 
		 return desconto;
		 
		 
			 
			 
		 
				
	 }
		 }
 
	 


