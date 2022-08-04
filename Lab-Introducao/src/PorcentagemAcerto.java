
import java.util.Scanner;

public class PorcentagemAcerto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0 ;
		int count = 0;
		int candidato[] = {1,2,3,4,5};
		int gabarito[] = {1,2,3,4,7};
		int digitados = 0;
		double porcentagem;
		
		/* 
		 * new int[candidato.length];
		 *while ( candidato[i] != -1) {
			
			Scanner scan = new Scanner(System.in);
			candidato[i] = scan.nextInt();
			
			i++;
		
		}*/
		
		for (int c = 0 ; c < gabarito.length; c++) {
			
			if (candidato[c] == gabarito[c] ) {
				
				System.out.printf("%d = %d \n",candidato[c], gabarito[c]);
				count++;
			}
		}
		
		porcentagem = 100.00 * (count / (double)gabarito.length);
		
		System.out.println(count);
		System.out.printf("%.2f",porcentagem);
		
		

	}

}
