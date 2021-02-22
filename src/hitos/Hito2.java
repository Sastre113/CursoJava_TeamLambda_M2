/**
 * 
 */
package hitos;

import auxiliares.AuxMethod;
import excepciones.SueldoExcepcion;
import models_h2.*;

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
		case "Boss":
			if(sueldo < 8000)
				throw new SueldoExcepcion("El sueldo es demasiado bajo para un Boss");
			else {
				Boss_h2 jefe = new Boss_h2(sueldo);
				AuxMethod.mostrarInfo("Boss: " + jefe.toString());
			}
				
			break;
		case "Manager":
			if(sueldo < 3000 || sueldo > 5000)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Manager");
			else {
				Manager_h2 manager = new Manager_h2(sueldo);
				AuxMethod.mostrarInfo("Manager: " + manager.toString());
			}
			break;
		case "Senior":
			if(sueldo < 2700 || sueldo > 4000)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Senior");
			else {
				Senior_h2 senior = new Senior_h2(sueldo, 0.15);
				AuxMethod.mostrarInfo("Senior: " + senior.toString());
			}
			break;
		case "Mid":
			if(sueldo < 1800 || sueldo > 2500)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Mid");
			else {
				Mid_h2 mid = new Mid_h2(sueldo, 0.10);
				AuxMethod.mostrarInfo("Mid: " + mid.toString());
			}
			break;
		case "Junior":
			if(sueldo < 900 || sueldo > 1600)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Junior");
			else {
				Junior_h2 junior = new Junior_h2(sueldo, 0.05);
				AuxMethod.mostrarInfo("Junior: " + junior.toString());
			}
			break;
		case "Voluntario":
			if(sueldo != 0)
				throw new SueldoExcepcion("Los voluntarios no deben cobrar nada");
			else {
				Voluntario_h2 voluntario = new Voluntario_h2();
				AuxMethod.mostrarInfo("Voluntario: " + voluntario.toString());
			}
			break;
		}
	}
}
