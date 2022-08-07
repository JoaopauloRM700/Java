
import java.util.Scanner;

public class PorcentagemAcerto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ic = 0 ;
		int ig = 0;
		int count = 0;
		int valor = 0;
		int candidato[] = new int[100];
		//int digitados = 0;
		double porcentagem;
		Scanner scan = new Scanner(System.in);
	
		 do {
	            valor = scan.nextInt();
	            if(valor >-1) {
	            candidato[ic++] = valor;
	            }
	        } while (valor != -1);
		
		 
		 //for(int i = 0;i < ic ; i++) {System.out.println(candidato[i]);}
		 
		 //System.out.println(candidato[0]);
		 //System.out.println(ic);
		 
		 
		 int gabarito[] = new int[ic];
		 
		 do {
	            valor = scan.nextInt();
	            if(valor >-1) {
	            gabarito[ig++] = valor;
	            }
	        } while (valor != -1);
		 
		 //System.out.println(ig);
		 //for(int i = 0;i < ig ; i++) {System.out.println(gabarito[i]);}
		 
		for (int c = 0 ; c < gabarito.length ; c++) {
			
			//System.out.println(candidato[c]);
			//System.out.println(gabarito[c]);
			
			if (candidato[c] == (gabarito[c]) ) {
				
				//System.out.printf("%d = %d \n",candidato[c], gabarito[c]);
				count++;
			}
			/*else {
				System.out.printf("%d =! %d \n",candidato[c], gabarito[c]);
			}*/
			
		}
		
		porcentagem = 100.00 * (count / (double)gabarito.length);
		
		//System.out.println(count);
		System.out.printf("%.2f",porcentagem);
		
		

	}

}
