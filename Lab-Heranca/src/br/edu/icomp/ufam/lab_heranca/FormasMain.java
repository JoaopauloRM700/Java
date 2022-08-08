package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		String[] formas = new String[100];
		
		Circulo c = new Circulo(4,5,2.5);
		Retangulo r = new Retangulo(4,5,2.5,7);
		Quadrado q = new Quadrado(4,5,2.5);

		
		formas[1] = c.toString();
		formas[2] = q.toString();
		formas[3] = r.toString();
		 System.out.println(c);
		 System.out.println(r);
		 System.out.println(q);
		
		

	}

}
