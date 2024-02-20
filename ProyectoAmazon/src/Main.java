import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//Futura condicion del do while		
		boolean fin = true;
		// Scanner para que el usuario meta datos por parametro
		Scanner sc = new Scanner(System.in);
		// Servira para que elija una opcion u otra
		int opcion = 0;
		//Creacion de un array de 10 cupones
		Cupon[] cupones = new Cupon [10];
		//Cuenta cupones creados
		int numeroCupon= 0;
		
		
		do {
			
			//Para que el usuario marque una opcion
			System.out.println("Seleccione una opción:");
			System.out.println("1. Crear cupon");
			System.out.println("2. Ver información del cupón");
			System.out.println("3. Salir");

			System.out.println("--------------------");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: 
				//En caso de que marque 1 le pregunta la cantidad que se metera en el parametro del contructor del cupon
				System.out.println("¿De cuanto dinero quieres el cupón?");
				double dinero = sc.nextDouble();
				//Comprueba si hay espacio para crear un cupon
				for(int i = 0; i<cupones.length;i++) {
					//Si hay hueco , se crea
					if (cupones[i]==null) {
						//Se le añade el dinero que ha puesto el usuario
				cupones[i] = new Cupon (dinero);
				System.out.println("Cupon creado");
				break;
					}
				}
				break;
		       case 2://Muestra informacion del cupon
                   System.out.println("Seleccione el número de cupón que desea ver:");
                   numeroCupon = sc.nextInt();// Coge el valor del cupon que marque comprobando que no sea nulo y este en el array
                   if (numeroCupon >= 0 && numeroCupon < cupones.length && cupones[numeroCupon] != null) {
                       System.out.println("Mostrando información del cupón " + numeroCupon + ":");
                       Cupon.mostrarInformacion(cupones[numeroCupon]);
                   } else {
                       System.out.println("Número de cupón inválido o cupón no existente.");
                   }
                   break;
                   //Sale
			case 3 : {
				System.out.println("Saliendo...");
				fin = false;
			}
			}
			
		}
		while(fin);
		
	
		/*
		// TODO Auto-generated method stub
		Cupon  c1 = new Cupon(50.0);
		Cupon  c2 = new Cupon(50.0);
		Cupon  c3 = new Cupon(50.0);
		Cupon  c4 = new Cupon(50.0);
		Cupon  c5 = new Cupon(50.0);
		Cupon  c6 = new Cupon(50.0);
		Cupon  c7 = new Cupon(50.0);

*/
		/*
		System.out.println(c1.getIdentificador());
		
		System.out.println(c2.getIdentificador());
		
		System.out.println(c3.getIdentificador());
		System.out.println(c4.getIdentificador());
		System.out.println(c5.getIdentificador());
		System.out.println(c6.getIdentificador());
		System.out.println(c7.getIdentificador());
		
/*
		c1.gastarSaldo1(20);
		System.out.println(c1.getSaldo());
		System.out.println(c1.getIdentificador());
		System.out.println(c2.getSaldo());
		System.out.println(c2.getIdentificador());
		Cupon nuevoCupon = Cupon.fusionarCupones(c1, c2);
		System.out.println(nuevoCupon.getSaldo());
		System.out.println(nuevoCupon.getIdentificador());
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());

		/*
		System.out.println(c1.getSaldo());
		
		System.out.println(c2.getSaldo());
		Cupon nuevo = Cupon.fusionarCupones(c1, c2);
		System.out.println(c1.getSaldo());
		
		System.out.println(c2.getSaldo());
		System.out.println(nuevo.getSaldo());
		*/
		
		/*
		c1.añadirSaldo(10);
		c1.gastarSaldo1(10);
		Cupon.mostrarInformacion(c1);
*/
		
		
	}

}
