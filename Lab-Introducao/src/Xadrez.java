import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crie uma classe em Java chamada Xadrez que leia a quantidade de linhas do usuário e imprima o padrão abaixo (para entrada 6).*/
		
		int QtLinhas;
		Scanner read = new Scanner(System.in);
		QtLinhas = read.nextInt();
		
		for(int c = 0; c<QtLinhas;c++) {
			for(int l = 0; l<QtLinhas;l++) {
				 if(c%2==0) {System.out.print("* ");}
				 else {System.out.print(" *");}
			}
			System.out.print("\n");
		}
		
		read.close();

	}

}
