/**
 * 
 */
package view_h3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import models_h3.*;

/**
 * @author Miguel A. Sastre
 *
 */
public class Empresa {
	
	protected HashMap<String,ArrayList<Empleado_h3>> plantilla = new HashMap<>();   

	public Empresa(HashMap<String,ArrayList<Empleado_h3>> plantilla) {
		this.plantilla = plantilla;
	}
	
	
	public int cantEmpleadosRango(String rango) {
		return this.getPlantilla().get(rango).size();
	}
	
	public int cantEmpleados() {
		Set<String> key = this.getPlantilla().keySet();
		int cantidad = 0;
		
		for (String rango : key) {
			cantidad += this.cantEmpleadosRango(rango);
		}
		return cantidad;
	}
	
	public ArrayList<Empleado_h3> obtenerRango(String rango){
		return this.getPlantilla().get(rango);
	}
	
	public Empleado_h3 obtenerEmpleado(String rango, int idxEmpleado) {
		return this.obtenerRango(rango).get(idxEmpleado);
	}
	
	
	public void modificarSueldo(String rango, int idxEmpleado, double sueldo) {
		this.obtenerEmpleado(rango, idxEmpleado).establecerSueldo(sueldo);
	}
	
	public void bonusATodaLaPlantilla() {
		Set<String> key = this.getPlantilla().keySet();
		
		for (String rango : key) {
			for(int i = 0; i < cantEmpleadosRango(rango) ; i++) {
				this.bonusUnEmpleado(rango, i);
			}	
		}
	}
	
	public void bonusUnEmpleado(String rango, int idxEmpleado) {
		this.obtenerEmpleado(rango, idxEmpleado).bonus();
	}
	
	/**
	 * @return the plantilla
	 */
	public HashMap<String, ArrayList<Empleado_h3>> getPlantilla() {
		return plantilla;
	}
}
