package auxiliares;

import javax.swing.JOptionPane;

/**
 * @author Miguel A. Sastre
 *
 */
public class AuxMethod {
	
	public static Object menuDesplegable(String [] opciones) {
		Object opcion = JOptionPane.showInputDialog(null, "Selecciona un puesto", "Elegir",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		return opcion;
	}
	
	public static boolean esNumero(String strNum) {
		boolean esNum = true;

		if (strNum == null) 
			esNum = false;
		else
			try {
				Double.parseDouble(strNum);
			} catch (NumberFormatException e) {
				esNum = false;
			}

		return esNum;
	}
	
	public static String solicitarDatosString(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
	public static int solicitarDatosInt(String texto) {
		String strNum = "";
		do {
			strNum = JOptionPane.showInputDialog(texto);
		} while (!esNumero(strNum));
		return Integer.parseInt(strNum);
	}
	
	public static double solicitarDatosDouble(String texto) {
		String strNum = "";
		do {
			strNum = JOptionPane.showInputDialog(texto);
		} while (!esNumero(strNum));
		return Double.parseDouble(strNum);
	}
	
	public static void mostrarInfo(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
	
	public static int darOpciones(String [] opciones) {
		int opcion = JOptionPane.showOptionDialog(
				   null,
				   "Eliga una opcion", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null, 
				   opciones,   
				   opciones[0]);
		return opcion;
	}
	
	public static int darOpciones(String [] opciones, String textoOpciones) {
		int opcion = JOptionPane.showOptionDialog(
				   null,
				   textoOpciones, 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null, 
				   opciones,   
				   opciones[0]);
		return opcion;
	}
	


}
