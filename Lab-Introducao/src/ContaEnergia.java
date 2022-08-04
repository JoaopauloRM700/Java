
import java.util.Scanner;

public class ContaEnergia {

	public static void main(String[] args) {
		// consumo de energia (em kWh)
		// tipo de instalação (R para residências, I para indústrias, e C para comércios)
		
		double consumo, precoPagar;
		Scanner scan = new Scanner(System.in);
		consumo = scan.nextDouble();
		char tipo = scan.next().charAt(0);
		Character.toUpperCase( tipo);
		String T = ""+tipo;
		
		
		//System.out.println(T);
		//System.out.println(consumo);
		
		if (consumo < 0) {
			System.out.println("-1.00");
		}
		else {
			switch (T) {
			case "R": 
				
				if(consumo > 500) {
					
					precoPagar= consumo * 0.65;
					System.out.printf("%.2f ",precoPagar);
				}
				else {
					
					precoPagar= consumo * 0.40;
					System.out.printf("%.2f",precoPagar);
				}
				
			break;
			
			case "I" :
				
				if(consumo > 1000) {
					
					precoPagar = consumo * 0.60;
					System.out.printf("%.2f ",precoPagar);
				}
				else {
					
					precoPagar= consumo * 0.55;
					System.out.printf("%.2f",precoPagar);
				}
				
			break;

			case "C" :
				
				if(consumo > 5000) {
					
					precoPagar= consumo * 0.60;
					System.out.printf("%.2f ",precoPagar);
				}
				else {
					
					precoPagar= consumo * 0.55;
					System.out.printf("%.2f",precoPagar);
				}

			break;

			default:

				System.out.println("-1.00");
			}
		}
		
		scan.close();
		

	}

}
