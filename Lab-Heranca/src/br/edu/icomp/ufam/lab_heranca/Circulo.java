package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {

	public double raio;
	public double pi = Math.PI;
	
	public Circulo(){
		this.posX = 0;
		this.posY = 0;
		this.raio = 0.0;
		
		
	}
	
	public Circulo(double raio){
		this.posX = 0;
		this.posY = 0;
		this.raio = raio;
		
		
	}
	
	public Circulo(int posX, int posY){
		this.posX = posX;
		this.posY = posY;;
		this.raio = 0.0;
		
		
	}
	
	public Circulo(int posX, int posY, double raio){
		this.posX = posX;
		this.posY = posY;
		this.raio = raio;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi*(raio*raio);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*(raio*pi);
	}
	
	public String toString () {
		return "Círculo na posição ("+posX+", "+posY+") com raio de "+raio+"cm (área="+getArea()+"cm2, perímetro="+getPerimetro()+"cm)";
		
	}
	
	

}
