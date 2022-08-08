package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public double largura;
	public double altura;
	
	
	public Retangulo(){
		
		this.posX = 0;
		this.posY = 0;
		this.largura = 0.0;
		this.altura = 0.0;
	}
	
	public Retangulo(int posX, int posY){
		
		this.posX = posX;
		this.posY = posY;
		this.largura = 0.0;
		this.altura = 0.0;
	}
	
	public Retangulo(double largura, double altura){
		
		this.posX = 0;
		this.posY = 0;
		this.largura = largura;
		this.altura = altura;
	}
	
	public Retangulo(int posX, int posY, double largura, double altura){
		
		this.posX = posX;
		this.posY = posY;
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return largura*altura;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*(largura+altura);
	}
	
	public String toString () {
		return "Retângulo na posição ("+posX+", "+posY+") com largura de "+largura+"cm e altura de "+altura+"cm (área="+getArea()+"cm2, perímetro="+getPerimetro()+"cm)";
		
	}

}
