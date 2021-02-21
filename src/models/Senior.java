/**
 * 
 */
package models;

/**
 * @author Miguel A. Sastre
 *
 */
public class Senior extends Empleado {
	
	
	protected static final double REDUCCION = 0.15;
	
	/**
	 * @param sueldoBase
	 * @param reduccion
	 */
	public Senior(double sueldoBase, double reduccion) {
		super(sueldoBase, REDUCCION);
	}

}
