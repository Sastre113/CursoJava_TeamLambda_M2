/**
 * 
 */
package hitos;

import auxiliares.AuxMethod;
import excepciones.SueldoExcepcion;

/**
 * @author Miguel A. Sastre
 *
 */
public class Hito2 {

	public static void calcularPaga() throws SueldoExcepcion {
		Object tipoEmpleado = AuxMethod
				.menuDesplegable(new String[] { "Boss", "Manager", "Senior", "Mid", "Junior", "Voluntario" });
		double sueldo = AuxMethod
				.solicitarDatosDouble("¿Que sueldo deseas asignarle al puesto de " + tipoEmpleado.toString() + " ?");
		
		/*
		 * Tengo que buscar una manera de generalizar un Switch con tantas opciones.
		 * 	
		 */
		
		switch (tipoEmpleado.toString()) {
		case "Boss_h1":
			if(sueldo < 8000)
				throw new SueldoExcepcion("El sueldo es demasiado bajo para un Boss");
			else
				// Do something
			break;
		case "Manager_h1":
			if(sueldo < 3000 || sueldo > 5000)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Manager");
			else
				// Do something
			break;
		case "Senior":
			if(sueldo < 2700 || sueldo > 4000)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Senior");
			else
				// Do something
			break;
		case "Mid":
			if(sueldo < 1800 || sueldo > 2500)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Mid");
			else
				// Do something
			break;
		case "Junior":
			if(sueldo < 900 || sueldo > 1600)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Junior");
			else
				// Do something
			break;
		case "Voluntario_h1":
			if(sueldo != 0)
				throw new SueldoExcepcion("Los voluntarios no deben cobrar nada");
			else
				// Do something
			break;
		}
	}
}
