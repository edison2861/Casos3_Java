import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1, num_mayor = 0, num = 0;
		
		while (c <= 4) {
			System.out.print("Número "+ c + ": ");
			num =sc.nextInt();
			if (num > num_mayor)
				num_mayor = num;
			
			c++;
		}
		System.out.println("El mayor es: "+ num_mayor);
		
	}

}
