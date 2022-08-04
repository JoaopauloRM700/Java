
public class ComputadorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Processador p = new Processador("Intel", "i7", 3.2, 8);
		System.out.println(p.getDescricao());
		Memoria m = new Memoria("Corsair Vengeance LPX", "DDR4", 8.0, 2.1, 8);
		System.out.println(m.getDescricao());
		Disco d = new Disco("Western Digital","HDD",4000.0, 9600);
		System.out.println(d.getDescricao());
		Computador pc = new Computador("Pichau", p, m, d);
		System.out.println(pc.getDescricao());
		
	}

}
