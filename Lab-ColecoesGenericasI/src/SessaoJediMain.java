
public class SessaoJediMain {

	public static void main(String[] args) {
		
		IniciadoJedi jedi = new IniciadoJedi();
		jedi.nome="Joao Paulo";
		jedi.anoNascimento = -50;
		jedi.especie = "humando";
		
		System.out.println(jedi.getDescricao());
		
		TreinadorJedi mestre = new TreinadorJedi("Grão-Mestre","yoda");
		System.out.println(mestre.getDescricao());
		
		SessaoJedi sessao = new SessaoJedi();
		//System.out.println(sessao.getDescricao());
		
		IniciadoJedi i1 = new IniciadoJedi("Ashla", "Togruta", -23);
		IniciadoJedi i2 = new IniciadoJedi("Jempa", "Whiphid", -22);
		IniciadoJedi i3 = new IniciadoJedi("Liam", "Human", -21);
		TreinadorJedi t1 = new TreinadorJedi("High Jedi General", "Mace Windu");
		SessaoJedi s1 = new SessaoJedi("Invisibilidade", t1);
		s1.addIniciado(i1);
		//s1.addIniciado(i2);
		//s1.addIniciado(i3);
		
		System.out.println(i1.getDescricao());
	}

}
