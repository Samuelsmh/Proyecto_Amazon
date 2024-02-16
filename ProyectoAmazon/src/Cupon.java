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
	// Metodo para gastar saldo
	 public void gastarSaldo(double cantidad) {
        if (cantidad > saldo) {
            throw new IllegalArgumentException("El saldo del cupon es menor a la cantidad a gastar");
        } 
            saldo -= cantidad;
            System.out.println("Se han gastado " + cantidad + "€ del cupón.");
        }
    

    // Método para fusionar dos cupones
    public static Cupon fusionarCupones(Cupon cupon1, Cupon cupon2) {
        double nuevoSaldo = cupon1.getSaldo() + cupon2.getSaldo();
        Cupon cuponNuevo = new Cupon(nuevoSaldo);
       
        cupon1.setSaldo(0);
        cupon2.setSaldo(0);
        return cuponNuevo;
    }
	
    
}
