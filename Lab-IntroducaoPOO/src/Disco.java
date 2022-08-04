
class Disco {
	
	String marca;
	String tipo; 
	double capacidade;
	int rpm;
	
	Disco(){
		
		this (null,null, 0.0 , 0 );
		
	}

	Disco(String marca, String tipo){
		
		this (marca,tipo, 0.0 , 0);
		
			
	}

	Disco(double capacidade){
			
			this(null,null, capacidade, 0 );
			
	}
	Disco(int rpm){
		
		this(null,null, 0.0, rpm );
		
	}	
	Disco(String marca, String tipo, double capacidade, int rpm){
		
		this.marca = marca;
		this.tipo =tipo;
		this.capacidade = capacidade;
		this.rpm = rpm;
		
	}
	
		//getDescricao: retorna uma String contendo a descrição da memória de acordo com a linha a seguir:
		//Disco: marca=Western Digital, tipo=HDD, capacidade=4000.0GB, rpm=9600rpm.
	
	String getDescricao() {
		return "Disco: marca="+marca+", tipo="+tipo+", capacidade="+capacidade+"GB, rpm="+rpm+"rpm." ;
	}
	

}
