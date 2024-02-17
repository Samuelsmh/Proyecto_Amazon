
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cupon  c1 = new Cupon(50.0);
		Cupon  c2 = new Cupon(50.0);
		Cupon  c3 = new Cupon(50.0);
		Cupon  c4 = new Cupon(50.0);
		Cupon  c5 = new Cupon(50.0);
		Cupon  c6 = new Cupon(50.0);
		Cupon  c7 = new Cupon(50.0);
		/*
		System.out.println(c1.getIdentificador());
		System.out.println(c2.getIdentificador());
		System.out.println(c3.getIdentificador());
		System.out.println(c4.getIdentificador());
		System.out.println(c5.getIdentificador());
		System.out.println(c6.getIdentificador());
		System.out.println(c7.getIdentificador());
		*/
		/*
		System.out.println(c1.getSaldo());
		
		System.out.println(c2.getSaldo());
		Cupon nuevo = Cupon.fusionarCupones(c1, c2);
		System.out.println(c1.getSaldo());
		
		System.out.println(c2.getSaldo());
		System.out.println(nuevo.getSaldo());
		*/
		c1.añadirSaldo(10);
		c1.gastarSaldo1(10);
		Cupon.mostrarInformacion(c1);
		
		
	}

}
