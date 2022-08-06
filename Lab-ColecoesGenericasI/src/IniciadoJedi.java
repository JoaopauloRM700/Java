
class IniciadoJedi {
	
	String nome;
	String especie;
	int anoNascimento;
	
	
	
	IniciadoJedi(){
		this(null,null,0);
	}
	
	IniciadoJedi(int anoNascimento){
		
		this (null,null, anoNascimento);
	}
	IniciadoJedi(String nome, String especie){
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = 0;
	}
	IniciadoJedi(String nome, String especie, int anoNascimento){
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}
	
	String getDescricao() {
		return nome+" (especie="+especie+", nascimento="+this.getAnoNascimento()+")";
		
	}
	
	String getAnoNascimento() {
		
		if(anoNascimento > 0) {
			return Math.abs(anoNascimento)+" DBY";
		}else {
			return Math.abs(anoNascimento)+" ABY"; 
		}
		
	}
	

}
