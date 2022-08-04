
class Memoria {
	
	String marca;
	String tipo;
	double tamanho;
	double velocidade;
	int numPentes; 
	
	Memoria(){
		
		this (null,null, 0.0 , 0.0,  0 );
		
	}
	
	Memoria(String marca, String tipo){
			
			this (marca,tipo, 0.0 , 0.0,  0 );
			
	}
	
	Memoria(double tamanho, double velocidade){
		
		this (null,null, tamanho , velocidade,  0 );
		
	}

	Memoria(double tamanho){
		
		this (null,null, tamanho , 0.0,  0 );
		
	}
	Memoria(int numPentes){
		
		this (null,null, 0.0 , 0.0,  numPentes );
		
	}
	
	
	
	Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes){
		
		this.marca = marca;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.velocidade = velocidade;
		this.numPentes = numPentes;
		
	}
	
	
	
	//getTamanhoTotal: retorna um double contendo a multiplicação da quantidade pelo tamanho dos pentes de memória.
	double getTamanhoTotal() {
		return numPentes*tamanho ;
	}
	//getVelocidadeParalela: retorna um double contendo a multiplicação da quantidade pela velocidade dos pentes de memória.
	double getVelocidadeParalela() {
		return velocidade * numPentes;
	}
	//getDescricao: retorna uma String contendo a descrição da memória de acordo com a linha a seguir:
	
	String getDescricao() {
		return "Memoria: marca="+marca+", tipo="+tipo+", tamanho="+tamanho+"GB, velocidade="+velocidade+"GHz, numPentes="+numPentes+", tamanhoTotal="+getTamanhoTotal()+"GB, velocidadeParalela="+getVelocidadeParalela()+"GHz." ;
	}
	
	

}
