/**
 * 
 */
package models_h2;

/**
 * @author Miguel A. Sastre
 *
 */
public abstract class  Empleado_h2 {
	
	protected double sueldoReal;
	protected double sueldoBase;
	protected final double VOLUNTARIO = 0;
	
	public Empleado_h2() {
		this.sueldoBase = VOLUNTARIO;
		this.sueldoReal = VOLUNTARIO;
	}
	
	/**
	 * @param sueldoBase
	 */
	public Empleado_h2(double sueldoBase) {
		this.sueldoBase = sueldoBase;
		this.sueldoReal = sueldoBase;
	}

	/**
	 * @param sueldoBase
	 */
	public Empleado_h2(double sueldoBase,double reduccion) {
		this.sueldoBase = sueldoBase;
		this.sueldoReal = sueldoBase - (sueldoBase * reduccion) ;
	}

	/**
	 * @return the sueldoReal
	 */
	public double getSueldoReal() {
		return sueldoReal;
	}

	/**
	 * @return the sueldoBase
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

}
