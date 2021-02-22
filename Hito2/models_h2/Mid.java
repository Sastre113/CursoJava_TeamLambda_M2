/**
 * 
 */
package models_h2;

/**
 * @author Miguel A. Sastre
 *
 */
public class Mid extends Empleado {
	
	
	protected static final double REDUCCION = 0.10;
	
	/**
	 * @param sueldoBase
	 * @param reduccion
	 */
	public Mid(double sueldoBase, double reduccion) {
		super(sueldoBase, REDUCCION);
	}

}
