import java.util.Random;

public class Cupon {
	
	// Atributos
	private int identificador;
	private double saldo;
	private static int identificadorAutoIncrement = 10000;
	private int movimientoCuponAñadir;
	private int movimientoCuponGastar;
	private double saldoInicial;
	private double saldoAlAñadir;
	
	//private static Random random = new Random();
	//Constructor
	public Cupon(double saldo) {
		
		
		this.identificador = identificadorAutoIncrement++;
		this.saldo=saldo;
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
	
	public double getSaldoAlAñadir() {
		return this.saldoAlAñadir;
	}

	public void setSaldo(double saldo) {
		if(saldo<0) {
			 throw new IllegalArgumentException("Error: No puedes obtener un cupón de dinero negativo.");
			
		} 
		this.saldo = saldo;
		
		}
	
	
	
	public int getMovimientoCuponAñadir() {
		return movimientoCuponAñadir;
	}

	

	public int getMovimientoCuponGastar() {
		return movimientoCuponGastar;
	}

	

	public void añadirSaldo(double saldo) {
		if(saldo<0) {
			 throw new IllegalArgumentException("Error: No puedes obtener un cupón de dinero negativo.");
			
		} 
		this.saldo += saldo;
		movimientoCuponAñadir++;
		this.saldoAlAñadir = this.saldo;
		}
	

	//Metodos
	 public void gastarSaldo1(double cantidad) {
	        if (cantidad > saldo) {
	            throw new IllegalArgumentException("Error: No hay suficiente saldo en el cupón.");
	        } 
	            saldo -= cantidad;
	            System.out.println("Se han gastado " + cantidad + "€ del cupón.");
	            movimientoCuponGastar++;
	        }
	    

	    // Método para fusionar dos cupones
	    public static Cupon fusionarCupones(Cupon cupon1, Cupon cupon2) {
	        double nuevoSaldo = cupon1.getSaldo() + cupon2.getSaldo();
	        Cupon cuponNuevo = new Cupon(nuevoSaldo);
	        cupon1.setSaldo(0);
	        cupon2.setSaldo(0);
	        
	        return cuponNuevo;
	    }
	    
	    public static void mostrarInformacion(Cupon cupon) {
	    	System.out.println("Esta es la información de tu cupón");
	    	System.out.println("-----------------------------------");
	    	System.out.printf("Saldo inicial: %.2f \n", cupon.getSaldoInicial());
	    	System.out.printf("Identificador: %d \n", cupon.getIdentificador());
	    	System.out.println("-----------------------------------");
	    	System.out.println("Estos son tus movimientos");
	    	System.out.println("-----------------------------------");
	    	if(cupon.getMovimientoCuponAñadir()!= 0) {
	    		System.out.printf("Has añadido dinero %d veces. \n", cupon.getMovimientoCuponAñadir());	
	    		System.out.printf("Dinero resultante %.2f \n", cupon.getSaldoAlAñadir());	
	    	} else {
	    	System.out.printf("No has añadido dinero %d. \n", cupon.getMovimientoCuponAñadir());
	    	}
	    	
	    	if(cupon.getMovimientoCuponGastar()!= 0) {
	    		System.out.printf("Has gastado dinero %d veces. \n", cupon.getMovimientoCuponGastar());	
	    		System.out.printf("Dinero resultante %.2f \n", cupon.getSaldo());	
	    	} else {
	    	System.out.printf("No has gastado dinero \n", cupon.getMovimientoCuponGastar());
	    	}
	    	
	    	
	    }
	    
	    
	    
/*
	// Metodo para gastar saldo
	 public void gastarSaldo(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: No hay suficiente saldo en el cupón.");
        } else {
            saldo -= cantidad;
            System.out.println("Se han gastado " + cantidad + "€ del cupón.");
        }
    }
*/
	    
	    /*
    // Método para fusionar dos cupones
    public static Cupon fusionarCupones1(Cupon cupon1, Cupon cupon2) {
        double nuevoSaldo = cupon1.getSaldo() + cupon2.getSaldo();
        Cupon cuponNuevo = new Cupon(nuevoSaldo);
        cupon1.setSaldo(0);
        cupon2.setSaldo(0);
        return cuponNuevo;
    }
*/
	
	
	
}
