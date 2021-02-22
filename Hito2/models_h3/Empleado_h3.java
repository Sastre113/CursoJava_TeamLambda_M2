/**
 * 
 */
package models_h3;

/**
 * @author Miguel A. Sastre
 *
 */
public abstract class Empleado_h3 {

	protected double sueldoNeto;
	protected double sueldoBruto;
	protected double sueldoNetoAnual;
	protected double sueldoBrutoAnual;
	protected double IRPF;
	protected boolean ayudasConcedidas;
	protected static final double AYUDA = 300;
	protected static final double DIAS_LABORABLES = 238;

	
	public Empleado_h3() {
		this(AYUDA,0);
		this.ayudasConcedidas = true;
	}
	
	/**
	 * @param sueldoBruto
	 */
	public Empleado_h3(double sueldoBruto, double IRPF) {
		this.IRPF = IRPF;
		this.ayudasConcedidas = false;
		establecerSueldo(sueldoBruto);	
	}
	

	private void establecerSueldo(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = this.calcularSueldoNeto();
		this.sueldoBrutoAnual = this.calcularSueldoBrutoAnual();
		this.sueldoNetoAnual = this.calcularSueldoNetoAnual();
	}
	
	public double calcularSueldoNeto() {
		return this.getSueldoBruto() - (this.getSueldoBruto() * this.IRPF);
	}
	
	public double calcularSueldoBrutoAnual() {
		return this.getSueldoBruto() * this.getDIAS_LABORABLES();
	}
	
	public double calcularSueldoNetoAnual() {
		return this.getSueldoNeto() * this.getDIAS_LABORABLES();
	}
	
	public void bonus() {
		if(!this.isAyudasConcedidas())
			establecerSueldo(this.getSueldoBruto() * 1.1);
	}
	
	/**
	 * @return the sueldoBruto
	 */
	public double getSueldoBruto() {
		return sueldoBruto;
	}

	/**
	 * @return the sueldoNeto
	 */
	public double getSueldoNeto() {
		return sueldoNeto;
	}

	/**
	 * @return the sueldoNetoAnual
	 */
	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	/**
	 * @return the sueldoBrutoAnual
	 */
	public double getSueldoBrutoAnual() {
		return sueldoBrutoAnual;
	}

	/**
	 * @return the iRPF
	 */
	public double getIRPF() {
		return IRPF;
	}

	/**
	 * @return the DIAS_LABORABLES
	 */
	public double getDIAS_LABORABLES() {
		return DIAS_LABORABLES;
	}

	/**
	 * @return the ayudasConcedidas
	 */
	public boolean isAyudasConcedidas() {
		return ayudasConcedidas;
	}
	
	

}
