package hitos;

import java.util.ArrayList;
import java.util.HashMap;
import auxiliares.AuxMethod;
import excepciones.SueldoExcepcion;
import models_h3.*;
import view_h3.Empresa;

/**
 * @author Miguel A. Sastre
 *
 */
public class Hito3 {

	protected static final String[] RANGOS = { "Boss", "Manager", "Senior", "Mid", "Junior", "Voluntario" };

	public static void gestionEmpresa() {
		Empresa miEmpresa = crearEmpresa();
		Object rango = null;
		boolean exit = false;
		int empleadoElegido = -1;
		int opcion = -1;
		
		// TODO generalizar la pedida de datos al usuario en un solo método
		do {
			opcion = AuxMethod.darOpciones(new String[] { "Mostrar un empleado", "Cambiar sueldo empleado",
					"Bonificar a la plantilla","Bonificar a un empleado" },
					"Tu empresa tiene " + miEmpresa.cantEmpleados() + " empleados contratados\nEliga una opción");
			
			switch (opcion) {
			case 0:
				rango = AuxMethod.menuDesplegable(RANGOS);
				empleadoElegido = AuxMethod.solicitarDatosInt(
						"El rango " + rango.toString() + " tiene " + miEmpresa.cantEmpleadosRango(rango.toString())
								+ "\nIndique el empleado con un número entero [0 - "
								+ (miEmpresa.cantEmpleadosRango(rango.toString()) - 1) + "]");
				AuxMethod.mostrarInfo(miEmpresa.obtenerEmpleado(rango.toString(), empleadoElegido).toString());
				break;
			case 1:
				rango = AuxMethod.menuDesplegable(RANGOS);
				empleadoElegido = AuxMethod.solicitarDatosInt(
						"El rango " + rango.toString() + " tiene " + miEmpresa.cantEmpleadosRango(rango.toString())
								+ "\nIndique el empleado con un número entero [0 - "
								+ (miEmpresa.cantEmpleadosRango(rango.toString()) - 1) + "]");
				try {
					cambiarSueldo(miEmpresa, rango,empleadoElegido);
				} catch (SueldoExcepcion e) {
					e.getMsg();
				}
				break;	
			case 2:
				miEmpresa.bonusATodaLaPlantilla();
				AuxMethod.mostrarInfo("Se ha bonificado a toda la plantilla!");
				break;
			case 3:
				rango = AuxMethod.menuDesplegable(RANGOS);
				empleadoElegido = AuxMethod.solicitarDatosInt(
						"El rango " + rango.toString() + " tiene " + miEmpresa.cantEmpleadosRango(rango.toString())
								+ "\nIndique el empleado con un número entero [0 - "
								+ (miEmpresa.cantEmpleadosRango(rango.toString()) - 1) + "]");
				miEmpresa.bonusUnEmpleado(rango.toString(), empleadoElegido);
				AuxMethod.mostrarInfo("Se ha bonificado al empleado: \n" +
						rango.toString() + " " + empleadoElegido);
				break;
			default:
				exit = true;
				AuxMethod.mostrarInfo("Hasta pronto!");
				break;
			}
		} while (!exit);
	}
	
	public static void cambiarSueldo(Empresa miEmpresa, Object rango, int idxEmpleado) throws SueldoExcepcion {
		double sueldo = AuxMethod
				.solicitarDatosDouble("¿Que sueldo deseas asignarle al puesto de " + rango.toString() + " ?");

		/*
		 * Tengo que buscar una manera de generalizar un Switch con tantas opciones.
		 * 
		 */

		switch (rango.toString()) {
		case "Boss":
			if (sueldo < 8000)
				throw new SueldoExcepcion("El sueldo es demasiado bajo para un Boss");
			else {
				miEmpresa.modificarSueldo(rango.toString(), idxEmpleado, sueldo);
			}
			break;
		case "Manager":
			if (sueldo < 3000 || sueldo > 5000)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Manager");
			else {
				miEmpresa.modificarSueldo(rango.toString(), idxEmpleado, sueldo);
			}
			break;
		case "Senior":
			if (sueldo < 2700 || sueldo > 4000)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Senior");
			else {
				miEmpresa.modificarSueldo(rango.toString(), idxEmpleado, sueldo);
			}
			break;
		case "Mid":
			if (sueldo < 1800 || sueldo > 2500)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Mid");
			else {
				miEmpresa.modificarSueldo(rango.toString(), idxEmpleado, sueldo);
			}
			break;
		case "Junior":
			if (sueldo < 900 || sueldo > 1600)
				throw new SueldoExcepcion("El sueldo no es el adecuado para un Junior");
			else {
				miEmpresa.modificarSueldo(rango.toString(), idxEmpleado, sueldo);
			}
			break;
		case "Voluntario":
			if (sueldo != 0)
				throw new SueldoExcepcion("Los voluntarios no deben cobrar nada");
			else {
				AuxMethod.mostrarInfo(miEmpresa.obtenerEmpleado(rango.toString(), idxEmpleado).toString());
			}
			break;
		}
	}

	public static Empresa crearEmpresa() {
		return new Empresa(new HashMap<String, ArrayList<Empleado_h3>>() {
			{
				put("Boss", new ArrayList<Empleado_h3>() {
					{
						add(new Boss_h3(8500, 0.32));
						add(new Boss_h3(9000, 0.32));
						add(new Boss_h3(1500, 0.32));
					}
				});
				put("Manager", new ArrayList<Empleado_h3>() {
					{
						add(new Manager_h3(3200, 0.26));
						add(new Manager_h3(3500, 0.26));
						add(new Manager_h3(4000, 0.26));
						add(new Manager_h3(4500, 0.26));
					}
				});
				put("Senior", new ArrayList<Empleado_h3>() {
					{
						add(new Senior_h3(2750, 0.24));
						add(new Senior_h3(2850, 0.24));
						add(new Senior_h3(2950, 0.24));
						add(new Senior_h3(3000, 0.24));
						add(new Senior_h3(3000, 0.24));
						add(new Senior_h3(3500, 0.24));
					}
				});
				put("Mid", new ArrayList<Empleado_h3>() {
					{
						add(new Mid_h3(1850, 0.15));
						add(new Mid_h3(1900, 0.15));
						add(new Mid_h3(1900, 0.15));
						add(new Mid_h3(2000, 0.15));
						add(new Mid_h3(2400, 0.15));
						add(new Mid_h3(2400, 0.15));
						add(new Mid_h3(2450, 0.15));
					}
				});
				put("Junior", new ArrayList<Empleado_h3>() {
					{
						add(new Junior_h3(925, 0.02));
						add(new Junior_h3(1000, 0.02));
						add(new Junior_h3(1200, 0.02));
						add(new Junior_h3(1250, 0.02));
						add(new Junior_h3(1400, 0.02));
						add(new Junior_h3(1550, 0.02));

					}
				});
				put("Voluntario", new ArrayList<Empleado_h3>() {
					{
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
						add(new Voluntario_h3());
					}
				});
			}
		});
	}

}
