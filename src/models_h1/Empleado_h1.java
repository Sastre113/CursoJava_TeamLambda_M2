/**
 * 
 */
package models_h1;

/**
 * @author Miguel A. Sastre
 *
 */
public class  Empleado_h1 {
	
	protected double sueldoReal;
	protected double sueldoBase;
	protected final double REDUCCION = 0.15;
	
	/**
	 * @param sueldoBase
	 */
	public Empleado_h1(double sueldoBase) {
		this.sueldoBase = sueldoBase;
		this.sueldoReal = sueldoBase - (sueldoBase*this.REDUCCION); 
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
