/*Modificar el algoritmo anterior para que muestre el 15% de un valor ingresado por el usuario.*/

import javax.swing.JOptionPane;

public class ValorConstante2 {

	public static void main(String[] args) {
		double valor, respuesta;
		final double PORCENTAJE= 0.15;
		valor= Double.parseDouble(JOptionPane.showInputDialog("Digite un valor numerico para ver su 15%"));
		respuesta= valor*PORCENTAJE;
		JOptionPane.showMessageDialog(null,"El 15% de "+valor+" es "+respuesta, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
