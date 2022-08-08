package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {
	
	
	public Quadrado(){ 
		
		this.posX = 0;
		this.posY = 0;
		this.altura = 0.0;
		this.largura = 0.0;
		
	}
	
	
	public Quadrado(double lado){ 
		
		this.posX = 0;
		this.posY = 0;
		this.altura = lado;
		this.largura = lado;
		
	}
	
	public Quadrado(int posX, int posY){ 
		
		this.posX = posX;
		this.posY = posY;
		this.altura = 0.0;
		this.largura = 0.0;
		
	}
	
	public Quadrado(int posX, int posY, double lado){ 
		
		this.posX = posX;
		this.posY = posY;
		this.altura = lado;
		this.largura = lado;
		
	}
	public String toString() {
		return "Quadrado na posição ("+posX+", "+posY+") com lado de "+altura+"cm (área="+getArea()+"cm2, perímetro="+getPerimetro()+"cm)";
	}

}
