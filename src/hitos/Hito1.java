/**
 * 
 */
package hitos;

import auxiliares.AuxMethod;
import models_h1.*;

/**
 * @author Miguel A. Sastre
 *
 */
public class Hito1 {
	
	
	public static void calcularPaga() {
		Object tipoEmpleado = AuxMethod
				.menuDesplegable(new String[] { "Boss", "Manager","Empleado", "Voluntario" });
		double sueldo = AuxMethod
				.solicitarDatosDouble("¿Que sueldo deseas asignarle al puesto de " + tipoEmpleado.toString() + " ?");
		
		switch(tipoEmpleado.toString()) {
		case  "Boss":
			Boss_h1 jefe = new Boss_h1(sueldo);
			AuxMethod.mostrarInfo(jefe.toString());
			
			break;
		case  "Manager":
			Manager_h1 manager = new Manager_h1(sueldo);
			AuxMethod.mostrarInfo(manager.toString());
			break;
		case  "Empleado":
			Empleado_h1 empleado = new Empleado_h1(sueldo);
			AuxMethod.mostrarInfo(empleado.toString());
			break;
		case  "Voluntario":
			Voluntario_h1 voluntario = new Voluntario_h1();
			AuxMethod.mostrarInfo(voluntario.toString());
			break;
		}
	}
}
