/**
 * 
 */
package models_h1;

/**
 * @author Miguel A. Sastre
 *
 */
public class Voluntario_h1 {

	protected double sueldoReal;
	
	/**
	 * @param sueldoBase
	 */
	public Voluntario_h1() {
		this.sueldoReal = 0;
	}

	/**
	 * @return the sueldoReal
	 */
	public double getSueldoReal() {
		return sueldoReal;
	}
	
	@Override
	public String toString() {
		return "El sueldo de  "+ this.getClass().getSimpleName() + " es " + sueldoReal + " €";
	}
	
}
