
class Processador {
	
	String marca;
	String modelo;
	double velocidade;
	int numNucleos;
	
	Processador(){
		
		this (null,null, 0.0 , 0 );
		
	}

	Processador(String marca, String modelo){
		
		this (marca,modelo, 0.0 , 0);
		
			
	}

	Processador(double velocidade){
			
			this(null,null, velocidade, 0 );
			
	}
	Processador(int numNucleos){
		
		this(null,null, 0.0, numNucleos );
		
	}	
	Processador(String marca, String modelo, double velocidade, int numNucleos){
		
		this.marca = marca;
		this.modelo =modelo;
		this.velocidade = velocidade;
		this.numNucleos = numNucleos;
		
	}
	
	
	//retorna um double contendo a multiplicação da velocidade do processador pela quantidade total de núcleos.
	double getVelocidadeParalela( ){
		return velocidade* numNucleos;
	}
	
	/*retorna uma String contendo a descrição do processador de acordo com a linha a seguir:
	Processador: marca=Intel, modelo=i7, velocidade=3.2GHz, numNucleos=8, velocidadeParalela=25.6GHz.*/
	
	String getDescricao() {
		return "Processador: marca="+marca+", modelo="+modelo+", velocidade="+velocidade+"GHz, numNucleos="+numNucleos+", velocidadeParalela="+getVelocidadeParalela( )+"GHz.";
	}
	
	

	
	
	
}
