
package amazon;

public class Main {

	public static void main(String[] args) {

		Cupon c1 = new Cupon(200.0);
		Cupon c2 = new Cupon(0.0);
		Cupon c3 = new Cupon(0.0);

		try {
			c1.setSaldo(-10);
			System.out.println("TEST NO PASADO - setSaldo con saldo negativo");

		} catch (Exception e) {
			System.out.println("TEST PASADO - setSaldo con saldo negativo");
		}
		try {
			Cupon.fusionarCupones(c2, c3);
			System.out.println("TEST NO PASADO - fusionarCupones con 0 euros");

		} catch (Exception e) {
			System.out.println("TEST  PASADO - fusionarCupones con 0 euros");
		}

	}

}
