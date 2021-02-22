/**
 * 
 */
package models_h3;

import auxiliares.AuxMethod;

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
	protected static final double MESES = 12;

	
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
	

	public void establecerSueldo(double sueldoBruto) {
		if(!this.ayudasConcedidas) {
			this.sueldoBruto = sueldoBruto;
			this.sueldoNeto = this.calcularSueldoNeto();
			this.sueldoBrutoAnual = this.calcularSueldoBrutoAnual();
			this.sueldoNetoAnual = this.calcularSueldoNetoAnual();
		} else
			AuxMethod.mostrarInfo("No se ha podido actualizar la información.\nEl empleado tiene ayudas concedidas");
		
	}
	
	public double calcularSueldoNeto() {
		return this.getSueldoBruto() - (this.getSueldoBruto() * this.IRPF);
	}
	
	public double calcularSueldoBrutoAnual() {
		return this.getSueldoBruto() * this.getMESES();
	}
	
	public double calcularSueldoNetoAnual() {
		return this.getSueldoNeto() * this.getMESES();
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
	public double getMESES() {
		return MESES;
	}

	/**
	 * @return the ayudasConcedidas
	 */
	public boolean isAyudasConcedidas() {
		return ayudasConcedidas;
	}

	@Override
	public String toString() {
		return "Empleado: \nsueldoNeto = " + sueldoNeto + "\nsueldoBruto = " + sueldoBruto + "\nsueldoNetoAnual = "
				+ sueldoNetoAnual + "\nsueldoBrutoAnual = " + sueldoBrutoAnual + "\nIRPF = " + IRPF + "\nayudasConcedidas = "
				+ ayudasConcedidas ;
	}


	

}
