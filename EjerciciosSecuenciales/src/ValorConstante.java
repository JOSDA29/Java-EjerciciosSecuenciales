/*Calcular el 15% de un valor constante.*/

import javax.swing.JOptionPane;

public class ValorConstante {

	public static void main(String[] args) {
		final int CONSTANTE= 29;
		double porcentaje= 0.15*CONSTANTE+CONSTANTE;
		JOptionPane.showMessageDialog(null, "El 15% del valor contante "+CONSTANTE+" es "+porcentaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
