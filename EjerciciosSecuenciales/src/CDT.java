/*Calcular el rendimiento de un CDT en una entidad financiera, conociendo el monto, el plazo en días 
 * y la tasa de interés anual. Observe que por tener el plazo en días, la tasa de interés anual se 
 * divide entre 360.*/

import javax.swing.JOptionPane;

public class CDT {

	public static void main(String[] args) {
		double monto, interes, dias, rendimiento;
		String mensaje;
		monto= Double.parseDouble(JOptionPane.showInputDialog("Digite el monto a ingresar"));
		interes= Double.parseDouble(JOptionPane.showInputDialog("Digite el interes anual"));
		dias= Double.parseDouble(JOptionPane.showInputDialog("Digite el plazo de dias"));
		rendimiento= monto*(interes/100)*(dias/360);
		mensaje= "CDT \n";
		mensaje+="Rendimiento: "+rendimiento;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
