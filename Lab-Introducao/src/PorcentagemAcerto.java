
import java.util.Scanner;

public class PorcentagemAcerto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ic = 0 ;
		int ig = 0;
		int count = 0;
		int candidato[] = new int[5];
		//int digitados = 0;
		double porcentagem;
		Scanner scan = new Scanner(System.in);
		
		
		while (ic < candidato.length) {
			
			candidato[ic] = scan.nextInt();
			System.out.println(candidato[ic]);
			ic++;
		}
		
		
		
		 
		//for(int i = 0;i < ic ; i++) {System.out.println(candidato[i]);}
		 
		 System.out.println(candidato[0]);
		 System.out.println(ic);
		 
		 /*
		 int gabarito[] = new int[ic];
		 
		 while (  scan.nextInt() != -1) {
				
				
				gabarito[ig] = scan.nextInt();
				
				ig++;
			
		}
		
		for (int c = 0 ; c < gabarito.length; c++) {
			
			if (candidato[c] == gabarito[c] ) {
				
				System.out.printf("%d = %d \n",candidato[c], gabarito[c]);
				count++;
			}
		}
		
		porcentagem = 100.00 * (count / (double)gabarito.length);
		
		System.out.println(count);
		System.out.printf("%.2f",porcentagem);*/
		
		

	}

}
