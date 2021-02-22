/**
 * 
 */
package hitos;

/**
 * @author Miguel A. Sastre
 *
 */
public class Hito1 {
	
	
	public static void calcularPaga() {
		
	}

	public double pagoManager(double sueldo) {
		return sueldo * 1.1;
	}

	public double pagoJefe(double sueldo ) {
		return sueldo * 1.5;
	}

	public double pagoEmpleado(double sueldo) {
		return sueldo - (sueldo * 0.15);
	}
	
	public double pagoVoluntario(double sueldo) {
		return sueldo;
	}
}
