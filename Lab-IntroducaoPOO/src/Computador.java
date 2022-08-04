
class Computador {

	String fabricante;
	Processador processador; 
	Memoria memoria;
	Disco disco;

	Computador(){
		this.fabricante = null;
		this.processador = null;
		this.memoria = null;
		this.disco = null;
	}
	
	Computador(String fabricante){
		this.fabricante = fabricante;
		this.processador = null;
		this.memoria = null;
		this.disco = null;
	}
	
	Computador(Processador processador){
		this.fabricante = null;
		this.processador = processador;
		this.memoria = null;
		this.disco = null;
	}
	Computador( Memoria memoria){
		this.fabricante = null;
		this.processador = null;
		this.memoria = memoria;
		this.disco = null;
	}
	Computador(Disco disco){
		this.fabricante = null;
		this.processador = null;
		this.memoria = null;
		this.disco = disco;
	}
	
	
	
	Computador(String fabricante, Processador processador, Memoria memoria, Disco disco){
		this.fabricante = fabricante;
		this.processador = processador;
		this.memoria = memoria;
		this.disco = disco;
	}
	String getDescricao() {
		return "Computador da fabricante "+fabricante+". "+processador.getDescricao()+" "+memoria.getDescricao()+" "+disco.getDescricao()+" " ;
	}
}
