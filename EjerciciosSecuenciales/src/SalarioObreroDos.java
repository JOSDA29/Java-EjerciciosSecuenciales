/*Modifique el algoritmo anterior para calcular el nuevo salario del obrero basado en un incremento 
 * que determina el jefe inmediato.
*/

import javax.swing.JOptionPane;

public class SalarioObreroDos {

	public static void main(String[] args) {
		double salarioActual, salarioNuevo, porcentaje, incremento;
		String mensaje;
		salarioActual= Double.parseDouble(JOptionPane.showInputDialog("Digite su salario actual"));
		porcentaje= Double.parseDouble(JOptionPane.showInputDialog("¿De cuanto sera el incremento?"));
		incremento= porcentaje/100;
		salarioNuevo= (salarioActual*incremento)+salarioActual;
		mensaje= "AUMENTO SALARIO \n";
		mensaje+= "Salario Actual: "+salarioActual+"\n";
		mensaje+= "Incremento: "+porcentaje+"% \n";
		mensaje+= "Salario Nuevo: "+salarioNuevo;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}