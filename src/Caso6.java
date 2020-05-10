import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String continuar = "S", nombre = "", estado = "";
		int edad = 0, c = 0, c_aptos =0;
		
		while (continuar.contentEquals("S") || continuar.equals("s")){
			c++;
			System.out.println("Registro N. "+ c);
			System.out.println("============");
			
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			
			System.out.println("Edad: ");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				c_aptos++;
			}
			else 
				estado = "Menor de edad";
			
			System.out.println("Estado: "+ estado);
			
			sc.nextLine(); //Para reiniciar la lectura de texto
			
			System.out.println("Desea continuar <S/N>?: ");
			continuar = sc.nextLine();
		
		
		}	
			
		}
		
		
		
		
	}


