import java.util.Random;

public class Cupon {
	
	// Atributos
	private int identificador; // Identificador del cupon
	private double saldo; // Saldo del cupon
	private static int identificadorAutoIncrement = 10000; // autoincrement que sera el id 
	private int movimientoCuponAñadir; // hace como contador
	private int movimientoCuponGastar; // Hace como contador
	private double saldoInicial; //Saldo inicial que se coge el valor del saldo cuando crea el cupon
	private double saldoAlAñadir; //Saldo al añadir que se coge el valor del saldo cuando añade saldo al cupon
	
	//private static Random random = new Random();
	//Constructor //Solo recibe el saldo
	public Cupon(double saldo) {
		
		
		this.identificador = identificadorAutoIncrement++; // Se le asigna un id que sera auto increment
		this.saldo=saldo; // Se mete el saldo metido por parametro
		this.saldoInicial = saldo; // Se iguala el saldo inicial al saldo añadido por parametros
		
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
	// Set en el que comprobamos que el saldo no puede ser negativo, en ese caso, error
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

	
	// Funcion, no puede ser saldo negativo , se mete en saldo , se añade uno al contador para seguir cuantos movimientos hace en añadir y se va acumulando el saldo en saldo al añadir
	public void añadirSaldo(double saldo) {
		if(saldo<0) {
			 throw new IllegalArgumentException("Error: No puedes obtener un cupón de dinero negativo.");
			
		} 
		this.saldo += saldo;
		movimientoCuponAñadir++;
		this.saldoAlAñadir = this.saldo;
		}
	

	//Comprueba que hay dinero suficiente, si hay lo retira y suma uno al contador a movimientoCuponGastar
	 public void gastarSaldo1(double cantidad) {
	        if (cantidad > saldo) {
	            throw new IllegalArgumentException("Error: No hay suficiente saldo en el cupón.");
	        } 
	            saldo -= cantidad;
	            System.out.println("Se han gastado " + cantidad + "€ del cupón.");
	            movimientoCuponGastar++;
	        }
	    

	    // Método para fusionar dos cupones, coge dos cupones y suma su saldo en un cupon nuevo y posteriormente devolvemos el cupon nuevo con el saldo de los dos antiguos
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
	    	System.out.printf("No has añadido dinero. \n", cupon.getMovimientoCuponAñadir());
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
            throw new IllegalArgumentException("El saldo del cupon es menor a la cantidad a gastar");
        } 
            saldo -= cantidad;
            System.out.println("Se han gastado " + cantidad + "€ del cupón.");
        }
<<<<<<< HEAD
    

=======
    }
*/
	    
	    /*
>>>>>>> e2bd2949a03ab543e38bd9bc8c9fc5b65ed42507
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
