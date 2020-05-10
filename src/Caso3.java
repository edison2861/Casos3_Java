import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el número: ");
		int num = sc.nextInt();
		
		if ( num <= 7);
		
		int c = 1, fact = 1;
		
		
		
		while ( c <= num) {
			
			fact = (fact * c );
			
			c++;
		}
		
		System.out.println("El factorial de "+ num +" es: "+ fact);
		
		 
		}
	}


