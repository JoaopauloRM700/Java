import java.util.ArrayList;
import java.util.Iterator;

public class SessaoJedi {
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
		
		
		
	}
	
	IniciadoJedi getIniciado( String nome ) {
		
		int i = 0;
		
		
		Iterator<IniciadoJedi> iterator = iniciados.iterator();
	    while (iterator.hasNext()) {
	    if(iniciados.get(i).nome.contains(nome)) {
	    	return iniciados.get(i);
	    }
	    
	    i++;
	      
	    }
		
		return iniciados.get(i);
		
		
		
	}
	double	getMediaAnoNascimento() {
		
		double soma = 0.0 ;
		
		
		for (int i=0 ; i<iniciados.size();  i++) {
			soma = soma + iniciados.get(i).anoNascimento;
		}
		
		return soma/iniciados.size();
		
	} 
	String	getDescricao() {
		
		String texto = "";
		int i = 1 ;
		
		Iterator<IniciadoJedi> iterator = iniciados.iterator();
	    while (iterator.hasNext()) {
	      IniciadoJedi iniciado = iterator.next();
	      texto =texto +" - Iniciado "+i+": "+ iniciado.getDescricao()+"\n";
	      
	      i++;
	    
	    } 
	  	
	    
		

		
	    return "--> SESSÃO "+this.nome+" (Treinador: "+treinador.getDescricao()+")\n"
				+ texto;
		
	} 
}
