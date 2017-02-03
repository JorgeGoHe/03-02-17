import java.util.Scanner;

public class GitHub {

		public static void main(String[] args) {
			int edad;
			Scanner teclado= new Scanner(System.in);
			System.out.println("Introduzca la edad: ");
			edad = teclado.nextInt();
			if (edad>=18){
				System.out.println("Solicite codigo en jefatura");}
			else {
				System.out.println("Pase por jefatura");
			}
			{
			System.out.println("Selecciona el tipo de acceso: "
					+"\n1.Acceso directo"
					+"\n2.Grado medio"
					+"\n3.Prueba de acceso"
					);
		  int op;
			
			Scanner sc=new Scanner(System.in);
			op = sc.nextInt();
			if (op==1) //opciones para el tipo de grado
				System.out.println("Ha seleccionado acceso por Acceso Directo");
			if (op==2)
				System.out.println("Ha seleccionado acceso por Grado Medio");
			if (op==3)
				System.out.println("Ha seleccionado acceso por prueba de acceso");
			}
			
			
				System.out.println("Las clases son en la R03, gracias");	
				
			}

		



	}


