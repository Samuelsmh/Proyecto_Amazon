import java.util.Random;

public class Cupon {
	
	// Atributos
	private int identificador;
	private double saldo;
	private static int identificadorAutoIncrement = 10000;
	
	private static Random random = new Random();
	//Constructor
	public Cupon(double saldo) {
		
		
		//Generamos un random de esta manera. Así el número del ID sera aleatorio, pero será de 5 digitos
		this.identificador = random.nextInt(90000) + 10000;
		this.saldo=saldo;
		
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
