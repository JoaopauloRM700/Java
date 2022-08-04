
import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		/*Para atrair mais clientes, uma loja de roupas oferece um desconto de 5% em compras de R$200,00 ou mais.
		 *  Escreva um programa (classe Desconto) que lê o preço sem desconto de uma compra 
		 *  e imprime o valor a ser pago pelo cliente (com duas casas decimais).*/
		
		
		double valor;
		double valorComDesc;
		//double desconto;
		
		Scanner read = new Scanner(System.in);
		valor = read.nextDouble();
		//System.out.println(valor);
		if(valor >= 200) {
			//desconto = valor*(0.05);
			//System.out.println(desconto);
			valorComDesc = valor - ( valor * (0.05));
			System.out.printf("%.2f",valorComDesc);
		}
		else {
			System.out.printf("%.2f",valor);
		}
		
		read.close();

	}

}
