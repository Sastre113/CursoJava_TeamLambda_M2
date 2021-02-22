/**
 * 
 */
package models_h2;

/**
 * @author Miguel A. Sastre
 *
 */
public class Mid_h2 extends Empleado_h2 {
	
	
	protected static final double REDUCCION = 0.10;
	
	/**
	 * @param sueldoBase
	 * @param reduccion
	 */
	public Mid_h2(double sueldoBase, double reduccion) {
		super(sueldoBase, REDUCCION);
	}

}
