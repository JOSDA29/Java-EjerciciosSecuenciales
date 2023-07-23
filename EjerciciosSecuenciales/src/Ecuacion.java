/* Determine el valor de x obtenido para la siguiente ecuación: x=a+b2a*/

import javax.swing.JOptionPane;

public class Ecuacion {

	public static void main(String[] args) {
		double valorA, valorB, valorX;
		String mensaje;
		valorA= Double.parseDouble(JOptionPane.showInputDialog("Digite un valor numero para darle valor a 'a'"));
		valorB= Double.parseDouble(JOptionPane.showInputDialog("Digite un valor numero para darle valor a 'b'"));
		valorX= valorA+valorB*2*valorA;
		mensaje= "SOLUCIÓN ECUACIÓN x=a+b2a \n";
		mensaje+="Valor a: "+valorA+"\n";
		mensaje+="Valor b: "+valorB+"\n";
		mensaje+="Valor x: "+valorX;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
