package amazon;
import java.util.Random;

public class Cupon {

	// Atributos
	
	Random rand = new Random();
	
	
	
	private int identificador;
	private double saldo;
	private static int identificadorAutoIncrement = 10000;
	private int movimientoCuponAniadir;
	private int movimientoCuponGastar;
	private double saldoInicial;
	private double saldoAlAniadir;
	private int identificadorRandom = rand.nextInt(90000) + 10000;
	
	// private static Random random = new Random();
	// Constructor
	public Cupon(double saldo) {

		this.identificador = identificadorAutoIncrement++;
		this.saldo = saldo;
		this.saldoInicial = saldo;

	}
	
	public Cupon() {

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
		if (saldo < 0) {
			throw new IllegalArgumentException("Error: No puedes obtener un cupón de dinero negativo.");

		}
		this.saldo += saldo;
		this.saldoAlAniadir = this.saldo;
		movimientoCuponAniadir++;
		System.out.println("\nSe han añadido " + saldo + "€ al cupón.");
		System.out.println("Nuevo saldo: " + this.saldo + "€");
		
	}

	// Metodos
	public void gastarSaldo(double cantidad) {
		if (cantidad > saldo) {
			throw new IllegalArgumentException("Error: No hay suficiente saldo en el cupón.");
		}
		saldo -= cantidad;
		movimientoCuponGastar++;
		System.out.println("\nSe han gastado " + cantidad + "€ del cupón.");
		System.out.println("Nuevo saldo: " + this.saldo + "€");

	}

	// Método para fusionar dos cupones
	public static Cupon fusionarCupones(Cupon cupon1, Cupon cupon2) {
		if(cupon1.getSaldo() == 0 && cupon2.getSaldo() == 0) {
			throw new IllegalArgumentException("Error: No puedes fusionar cupones con 0 euros.");
		}
		double nuevoSaldo = cupon1.getSaldo() + cupon2.getSaldo();
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
