/**
 * 
 */
package main;

import javax.swing.JOptionPane;

import excepciones.SueldoExcepcion;
import hitos.Hito1;
import hitos.Hito2;

/**
 * @author Miguel A. Sastre
 *
 */
public class Menu {
	
	static void menu() {

		String todasOpciones[] = autoGenerarOpciones(3);
		boolean exit = false;
		do {
			Object opcion = JOptionPane.showInputDialog(null, "Elige que hito quieres realizar", "Hitos",
					JOptionPane.QUESTION_MESSAGE, null, todasOpciones, todasOpciones[0]);

			if (opcion != null) {
				int opcionElegida = Integer.parseInt(opcion.toString().substring(5, 7));
				System.out.println("Opcion elegida " + opcionElegida);

				switch (opcionElegida) {
				case 1:
					Hito1.calcularPaga();
					break;
				case 2:
					try {
						Hito2.calcularPaga();
					} catch (SueldoExcepcion e) {
						e.getMsg();
					}
					break;
				case 3:
					
					break;
				}
				
			} else
				exit = true;

		} while (!exit);
	}

	private static String[] autoGenerarOpciones(int size) {
		String[] options = new String[size];

		for (int i = 0; i < size; i++) {
			if (i < 9)
				options[i] = "Hito 0" + (i + 1);
			else
				options[i] = "Hito " + (i + 1);
		}

		return options;
	}
}
