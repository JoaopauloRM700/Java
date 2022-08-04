
import java.util.Scanner;

public class IdadeUfam {

	public static void main(String[] args) {
		
		/*Crie uma classe em Java chamada IdadeUfam que leia o ano atual do teclado e imprima 
		 * "A UFAM tem X anos de fundacao", trocando o X pela idade da UFAM.*/  	
	
		int FundacaoUfam = 1909;
		int AnoAtual;
		int IdadeUfam;
		Scanner read = new Scanner(System.in);
		AnoAtual = read.nextInt();
		IdadeUfam = (AnoAtual - FundacaoUfam);
		System.out.printf("A UFAM tem %d anos de fundacao", IdadeUfam );
		read.close();
	}

}