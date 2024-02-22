package amazon;

import java.util.Scanner;
import java.util.Scanner;

public class PruebasExtra {

	public static void main(String[] args) {

		//INICIAR VARIABLE A TRUE PARA QUE ENTRE EN EL DO WHILE

		boolean fin = true;
		Scanner sc = new Scanner(System.in);
		//OPCION QUE SELECCIONARA EL USUARIO
		int opcion = 0;
		//ARRAY CON UN TAMAÑO DE 10 CUPONES 
		Cupon[] cupones = new Cupon[10];
		//NUMERO DE CUPON
		int numeroCupon = 0;

		do {//OPCIONES A COGER POR EL USUARIO

			System.out.println("\nSeleccione una opción: \n");
			System.out.println("1. Crear cupon");
			System.out.println("2. Gastar saldo");
			System.out.println("3. Añadir saldo");
			System.out.println("4. Fusionar cupones");
			System.out.println("5. Ver información del cupón");
			System.out.println("6. Salir");
			System.out.println("--------------------");

			System.out.println("Seleccione una opción:");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\n¿De cuanto dinero quieres el cupón?");
				//SE LE PREGUNTA EL PARAMETRO PARA INTRODUCIRLO EN EL CONSTRUCTOR DEL CUPON
				double dinero = sc.nextDouble();

				for (int i = 0; i < cupones.length; i++) {
					if (cupones[i] == null) {
						//RECORRE EL ARRAY A VER SI HAY ALGUN HUECO, SI HAY UN NULL CREA EL CUPON
						cupones[i] = new Cupon(dinero);
						System.out.println("\nCupon creado. Su número de cupón es: " + i);
						System.out.println("El saldo del cupón es de " + dinero + "€");
						break;
					}
				}
				break;

			case 2:// SI EXISTE UN CUPON SE PREGUNTA LA CANTIDAD A GASTAR 
				if (cupones != null) {
					System.out.print("\nIntroduce la cantidad a gastar: ");
					double cantidadGastar = sc.nextDouble();
					//SE PASA POR PARAMETRO LA VARIABLE CON EL DINERO QUE HA PUESTO EL USUARIO
					cupones[numeroCupon].gastarSaldo(cantidadGastar);
				} else {
					//SI NO HAY CUPONES SALTA EL SIGUIENTE MENSAJE
					System.out.println("\nPrimero debes crear un cupón.");
				}

				break;

			case 3://MIRA QUE HAYA CUPONES
				if (cupones != null) {
					System.out.print("\nIntroduce la cantidad a añadir: ");
					double cantidadAniadir = sc.nextDouble();
					//USO DE FUNCION AÑADIR SALDO Y SE METE EN EL PARAMETRO LA VARIABLE QUE RECOGE EL VALOR DEL USUARIO
					cupones[numeroCupon].aniadirSaldo(cantidadAniadir);
				} else {
					//SI NO HAY CUPONES SALTA EL SIGUIENTE MENSAJE
					System.out.println("\nPrimero debes crear un cupón.");
				}

				break;

			case 4:
				System.out.println("\nIntroduce el número del primer cupón que quieres fusionar:");
				int numero1 = sc.nextInt(); //RECOGE EL NUMERO DEL PRIMER CUPON
				if (cupones[numero1] == null) {//COMPRUEBA SI EXISTE ESE CUPON
					throw new IllegalArgumentException("\nEste cupón no existe");
				}

				System.out.println("\nIntroduce el número del segundo cupón que quieres fusionar:");
				int numero2 = sc.nextInt();//RECOGE EL NUMERO DEL SEGUNDO CUPON
				if (cupones[numero2] == null) {//COMPRUEBA SI EXISTE
					throw new IllegalArgumentException("\nEste cupón no existe");
				}
				//USA LA FUNCION, PASANDO POR PARAMETRO LAS VARIABLES QUE RECOGEN LOS NUMEROS DE LOS CUPONES
				Cupon cuponFusionado = Cupon.fusionarCupones(cupones[numero1], cupones[numero2]);
				System.out.println("\nCupones fusionados");
				System.out.println("\nMostrando información del cupón fusionado");
				//MUESTRA INFORMACION DE LOS CUPONES FUSIONADOS
				Cupon.mostrarInformacion(cuponFusionado);
				break;

			case 5:
				System.out.println("\nSeleccione el número del cupón que desea ver:");
				numeroCupon = sc.nextInt();
				if (numeroCupon >= 0 && numeroCupon < cupones.length && cupones[numeroCupon] != null) {
					//COMPRUEBA SI EXISTE EL CUPON
					System.out.println("Mostrando información del cupón " + numeroCupon + ":");
					//USA LA FUNCION MOSTRAR INFORMACION PASANDOLE LA POSICION DEL ARRAY DEL CUPON SELECCIONADO
					Cupon.mostrarInformacion(cupones[numeroCupon]);
				//SI NO EXISTE, ERROR
				} else {
					System.out.println("Número de cupón inválido o cupón no existente.");
				}
				break;

			case 6: {
				System.out.println("\nSaliendo...");
				//SALE DEL BUCLE
				fin = false;
			}
			}

		} while (fin);

		// TODO Auto-generated method stub
		Cupon c1 = new Cupon(50.0);
		Cupon c2 = new Cupon(50.0);
		Cupon c3 = new Cupon(50.0);
		Cupon c4 = new Cupon(50.0);
		Cupon c5 = new Cupon(50.0);
		Cupon c6 = new Cupon(50.0);
		Cupon c7 = new Cupon(50.0);

		System.out.println(c1.getIdentificador());

		System.out.println(c2.getIdentificador());

		System.out.println(c3.getIdentificador());
		System.out.println(c4.getIdentificador());
		System.out.println(c5.getIdentificador());
		System.out.println(c6.getIdentificador());
		System.out.println(c7.getIdentificador());

		/*
		 * c1.gastarSaldo1(20); System.out.println(c1.getSaldo());
		 * System.out.println(c1.getIdentificador()); System.out.println(c2.getSaldo());
		 * System.out.println(c2.getIdentificador()); Cupon nuevoCupon =
		 * Cupon.fusionarCupones(c1, c2); System.out.println(nuevoCupon.getSaldo());
		 * System.out.println(nuevoCupon.getIdentificador());
		 * System.out.println(c1.getSaldo()); System.out.println(c2.getSaldo());
		 * 
		 * /* System.out.println(c1.getSaldo());
		 * 
		 * System.out.println(c2.getSaldo()); Cupon nuevo = Cupon.fusionarCupones(c1,
		 * c2); System.out.println(c1.getSaldo());
		 * 
		 * System.out.println(c2.getSaldo()); System.out.println(nuevo.getSaldo());
		 */

		c1.aniadirSaldo(10);
		c1.gastarSaldo(10);
		Cupon.mostrarInformacion(c1);

	}

}
