package amazon;
import java.util.Random;

public class Cupon {

	// Atributos
	
	Random rand = new Random();
	
	
	
	private int identificador;
	private double saldo;
	private static int identificadorAutoIncrement = 10000;
	// FUNCION DE CONTADOR
	
	
	
	
	private int movimientoCuponAniadir;
	private int movimientoCuponGastar;
	private double saldoInicial;
	private double saldoAlAniadir;
	private int identificadorRandom = rand.nextInt(90000) + 10000;
	
	// private static Random random = new Random();
	// Constructor
	public Cupon(double saldo) {
		//EL ID ES AUTOINCREMENT Y SALDO INICIAL ES IGUAL A SALDO PARA CUANDO SE MUESTRE INFO
		this.identificador = identificadorAutoIncrement++;
		this.saldo = saldo;
		this.saldoInicial = saldo;

	}
	
	public Cupon() {
		//CONSTRUCTOR SIN PARAMETROS
		this.identificador = identificadorAutoIncrement++;
		this.saldo = 0;
		this.saldoInicial = saldo;

	}

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double getSaldoInicial() {
		return this.saldoInicial;
	}

	public double getSaldoAlAniadir() {
		return this.saldoAlAniadir;
	}

	public void setSaldo(double saldo) {
		//SI EL SALDO ES MENOR A 0 , ERROR
		if (saldo < 0) {
			throw new IllegalArgumentException("Error: No puedes obtener un cupón de dinero negativo.");

		}
		this.saldo = saldo;

	}

	public int getMovimientoCuponAniadir() {
		return movimientoCuponAniadir;
	}

	public int getMovimientoCuponGastar() {
		return movimientoCuponGastar;
	}

	public void aniadirSaldo(double saldo) {
		//SI EL SALDO ES MENOR A 0, ERROR
		if (saldo < 0) {
			throw new IllegalArgumentException("Error: No puedes obtener un cupón de dinero negativo.");

		}
		this.saldo += saldo;
		//SE ACUMULA EL SALDO EN SALDO AL AÑADIR
		this.saldoAlAniadir = this.saldo;
		movimientoCuponAniadir++;
		System.out.println("\nSe han añadido " + saldo + "€ al cupón.");
		System.out.println("Nuevo saldo: " + this.saldo + "€");
		
	}

	// Metodos
	public void gastarSaldo(double cantidad) {
		//SI QUIERES RETIRAR MAS DINERO DEL QUE HAY EN EL CUPON,ERROR
		if (cantidad > saldo) {
			throw new IllegalArgumentException("Error: No hay suficiente saldo en el cupón.");
		}
		saldo -= cantidad;
		//SE AÑADE 1 EN EL CONTADOR DE MOVIMIENTO AL GASTAR
		movimientoCuponGastar++;
		System.out.println("\nSe han gastado " + cantidad + "€ del cupón.");
		System.out.println("Nuevo saldo: " + this.saldo + "€");

	}

	// Método para fusionar dos cupones
	public static Cupon fusionarCupones(Cupon cupon1, Cupon cupon2) {
		//SE INTENTA FUSIONAR DOS CUPONES A 0 , ERROR
		if(cupon1.getSaldo() == 0 && cupon2.getSaldo() == 0) {
			throw new IllegalArgumentException("Error: No puedes fusionar cupones con 0 euros.");
		}
		//VARIABLE PARA SUMAR LOS DOS SALDOS DE LOS CUPONES
		double nuevoSaldo = cupon1.getSaldo() + cupon2.getSaldo();
		//CUPON NUEVO CON EL SALDO DE 'NUEVOSALDO'
		Cupon cuponNuevo = new Cupon(nuevoSaldo);
		cupon1.saldo = 0;
		cupon2.saldo = 0;
		
		return cuponNuevo;
	}


	
	public static void mostrarInformacion(Cupon cupon) {
		System.out.println("\nEsta es la información de tu cupón");
		System.out.println("-----------------------------------");
		System.out.printf("Saldo inicial: %.2f€\n", cupon.getSaldoInicial());
		System.out.printf("Identificador: %d \n", cupon.getIdentificador());
		System.out.println("-----------------------------------");
		System.out.println("Estos son tus movimientos");
		System.out.println("-----------------------------------");
		if (cupon.getMovimientoCuponAniadir() != 0) {
			System.out.printf("Has añadido dinero %d veces. \n", cupon.getMovimientoCuponAniadir());
		} else {
			System.out.printf("No has añadido dinero. \n", cupon.getMovimientoCuponAniadir());
		}

		if (cupon.getMovimientoCuponGastar() != 0) {
			System.out.printf("Has gastado dinero %d veces. \n", cupon.getMovimientoCuponGastar());
		} else {
			System.out.printf("No has gastado dinero \n", cupon.getMovimientoCuponGastar());
		}

	}

	

}
