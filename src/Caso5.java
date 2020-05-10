import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1, num_mayor = 1, num = 1;
		
		while (c <= 5) {
			System.out.print("Número "+ c + ": ");
			num =sc.nextInt();
			if (num < num_mayor)
				num_mayor = num;
			
			c++;
		}
		System.out.println("El menor es: "+ num_mayor);
		
	}

}
