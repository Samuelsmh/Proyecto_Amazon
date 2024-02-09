
public class Cupon {
	
	// Atributos
	private int identificador;
	private double saldo;
	
	//Constructor
	public Cupon(double saldo) {
		// El valor minimo de 5 digitos es 10000
		this.identificador = 10000;
		// Se vaya incrementando solo cuando se crea un cupon
		identificador++;
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
