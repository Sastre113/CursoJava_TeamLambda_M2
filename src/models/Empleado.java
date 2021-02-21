/**
 * 
 */
package models;

/**
 * @author Miguel A. Sastre
 *
 */
public abstract class  Empleado {
	
	protected double sueldoReal;
	protected double sueldoBase;
	protected final double VOLUNTARIO = 0;
	
	public Empleado() {
		this.sueldoBase = VOLUNTARIO;
		this.sueldoReal = VOLUNTARIO;
	}
	
	/**
	 * @param sueldoBase
	 */
	public Empleado(double sueldoBase) {
		this.sueldoBase = sueldoBase;
		this.sueldoReal = sueldoBase;
	}

	/**
	 * @param sueldoBase
	 */
	public Empleado(double sueldoBase,double reduccion) {
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
