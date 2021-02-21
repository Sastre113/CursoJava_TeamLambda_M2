/**
 * 
 */
package models;

/**
 * @author Miguel A. Sastre
 *
 */
public class Junior extends Empleado {
	
	protected static final double REDUCCION = 0.05;
	
	/**
	 * @param sueldoBase
	 * @param reduccion
	 */
	public Junior(double sueldoBase, double reduccion) {
		super(sueldoBase, REDUCCION);
	}

}
