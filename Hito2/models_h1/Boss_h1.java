/**
 * 
 */
package models_h1;

/**
 * @author Miguel A. Sastre
 *
 */
public class Boss_h1 {
	
	protected double sueldoReal;
	protected double sueldoBase;
	protected final double INCREMENTO = 1.5;
	
	/**
	 * @param sueldoBase
	 */
	public Boss_h1(double sueldoBase) {
		this.sueldoBase = sueldoBase;
		this.sueldoReal = sueldoBase * INCREMENTO; 
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
