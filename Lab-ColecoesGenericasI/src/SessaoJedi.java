import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class SessaoJedi {
	String nome;
	TreinadorJedi	treinador = new TreinadorJedi();
	ArrayList<IniciadoJedi>	iniciados = new ArrayList<IniciadoJedi>() ;
	
	SessaoJedi(){
		this.nome = null;
		this.treinador = null;
	}
	
	SessaoJedi(String nome, TreinadorJedi treinador){
		this.nome = nome;
		this.treinador = treinador;
	}
	
	void addIniciado(IniciadoJedi iniciado) {
		
		if (iniciados.contains(iniciado)){
			  
			System.out.println("Ja existe");
		}
		else{
			iniciados.add(iniciado);
		}
		
		System.out.println(iniciados.get(0).getDescricao());
		
		
	}
	
	IniciadoJedi getIniciado(String nome) {
		
		
		for (int i=0 ; i<iniciados.size();  i++) {
			   if( iniciados.get(i).equals(nome)) {
				   return iniciados.get(i);
			   }
			   else{
					return null;
			   }
		}
		return null;
		
	}
	double	getMediaAnoNascimento() {
		
		double soma = 0.0 ;
		
		
		for (int i=0 ; i<iniciados.size();  i++) {
			soma = soma + iniciados.get(i).anoNascimento;
		}
		
		return soma/iniciados.size();
		
	} 
	String	getDescricao() {
				
		

		
		return "--> SESSÃO "+this.nome+" (Treinador: "+treinador.getDescricao()+")\r\n"
				+ "  - Iniciado 1: "+iniciados.4().getDescricao()+"\r\n"
				+ "  - Iniciado 2: "+iniciados.get(1).getDescricao()+"\r\n"
				+ "  - Iniciado 3: "+iniciados.get(2).getDescricao()+"\r\n"
				+ "  - Iniciado 4: "+iniciados.get(3).getDescricao()+"" ;
		
	} 
}
