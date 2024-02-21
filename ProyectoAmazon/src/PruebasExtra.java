package amazon;
import java.util.Scanner;
import java.util.Scanner;

public class PruebasExtra {

	public static void main(String[] args) {

		// HOLA SOY NUEVA

		boolean fin = true;
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Cupon[] cupones = new Cupon[10];
		int numeroCupon = 0;

		do {

			System.out.println("Seleccione una opción:");
			System.out.println("1. Crear cupon");
			System.out.println("2. Ver información del cupón");
			System.out.println("3. Fusionar cupones");
			System.out.println("4. Salir");

			System.out.println("--------------------");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("¿De cuanto dinero quieres el cupón?");
				double dinero = sc.nextDouble();

				for (int i = 0; i < cupones.length; i++) {
					if (cupones[i] == null) {
						cupones[i] = new Cupon(dinero);
						System.out.println("Cupon creado");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Seleccione el número de cupón que desea ver:");
				numeroCupon = sc.nextInt();
				if (numeroCupon >= 0 && numeroCupon < cupones.length && cupones[numeroCupon] != null) {
					System.out.println("Mostrando información del cupón " + numeroCupon + ":");
					Cupon.mostrarInformacion(cupones[numeroCupon]);
				} else {
					System.out.println("Número de cupón inválido o cupón no existente.");
				}
				break;

			case 3:
				System.out.println("¿Qué cupones quieres fusionar?");
				
				int numero1 = sc.nextInt();
				int numero2 = sc.nextInt();
				if(cupones[numero1] == null) {
					throw new IllegalArgumentException("Este cupón no existe");
				}
				if(cupones[numero2] == null) {
					throw new IllegalArgumentException("Este cupón no existe");
				}
					
				
				Cupon cuponFusionado = Cupon.fusionarCupones(cupones[numero1], cupones[numero2]);
				System.out.println("Cupones fusionados");
				System.out.println("Mostrando información del cupón fusionado");
				Cupon.mostrarInformacion(cuponFusionado);
				break;
			case 4: {
				System.out.println("Saliendo...");
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
