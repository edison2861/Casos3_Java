import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String continuar = "S", nombre_mayor="", nombre_menor="",empleado_t="";
		float sueldo=0, bonificacion=0, sueldo_neto=0, porcentaje=0,descuento=0;
		
		float sueldo_mayor = 0, sueldo_menor = 0;
		int c=0, empleado_porcentaje=0,mayor_tardanza=0;
		
		while(continuar.contentEquals("S")|| continuar.contentEquals("s")) {
			c++;
			
			System.out.println("Registro de empleados("+c+")");
			System.out.println("Empleado: "); String nombre=sc.nextLine();
			System.out.println("Horas trabajadas: ");
			int horas=sc.nextInt();
			System.out.println("Tarifa por hora: ");
			float tarifa = sc.nextFloat();
			System.out.println("Minutos de tardanza: ");
			int minutos = sc.nextInt();
			
			sueldo = horas*tarifa;
			
			if (horas<=50) {
				bonificacion=0;
			}
			if(horas>50 & horas<=60) {
				bonificacion=(sueldo*0.02f);
			}
			if(horas>60 & horas<=70) {
				bonificacion=(sueldo*0.08f);
			}
			if(horas>70 & horas<=80) {
				bonificacion=(sueldo*0.13f);
			}
			if(horas>80) {
				bonificacion=(sueldo*0.15f);
			}
			if(minutos<=15) {
				descuento=0;
			}
			if(minutos>15 & minutos<=30) {
				descuento=(sueldo*0.003f)*minutos;
			}
			if (minutos>30) {
				descuento=(sueldo*0.05f)*minutos;
			}
			
			sueldo_neto=sueldo+bonificacion-descuento;
			porcentaje=(horas*100/80);
			
			System.out.println("---RESULTADOS---");
			System.out.println("Sueldo bruto: S/"+sueldo);
			System.out.println("Bonificación: S/"+bonificacion);
			System.out.println("Descuento: S/"+descuento);
			System.out.println("Sueldo neto: S/"+sueldo_neto);
			System.out.println("Alcanzado: "+porcentaje + "%");
			
			System.out.println("-----------------------");
			System.out.println("¿Nuevo empleado? <S/N>");
			sc.nextLine();
			continuar=sc.nextLine();
			System.out.println("-----------------------");
			
			if(sueldo_neto>sueldo_mayor) {
				sueldo_mayor=sueldo_neto;
				nombre_mayor=nombre;
			}
			if(sueldo_neto<sueldo_menor) {
				sueldo_menor=sueldo_neto;
				nombre_menor=nombre;
			}
			if(minutos>mayor_tardanza) {
				mayor_tardanza=minutos;
				empleado_t=nombre;
			}
			if(porcentaje>90) {
				empleado_porcentaje=empleado_porcentaje+1;
			}
			
			System.out.println("--- R E S U M E N ---");
			System.out.println("Número de empleados: "+c);
			System.out.println("Sueldo neto mayor: S/"+sueldo_mayor+"pertenece a: "+nombre_mayor);
			System.out.println("Sueldo neto menor: S/"+sueldo_menor+"pertenece a: "+nombre_menor);
			System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+empleado_t+"("+mayor_tardanza+"min)");
			System.out.println("Cantidad de empleados con más del 90% de la meta: "+empleado_porcentaje);
			
		}
				
	}

}
