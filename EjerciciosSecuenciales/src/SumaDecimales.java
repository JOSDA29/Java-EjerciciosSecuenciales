/*Haga un algoritmo que sume 3 números decimales e imprima el resultado*/

import javax.swing.JOptionPane;

public class SumaDecimales {

	public static void main(String[] args) {
		double numeroUno, numeroDos, numeroTres, suma;
		String mensaje;
		numeroUno= Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero decimal"));
		numeroDos= Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero decimal"));
		numeroTres= Double.parseDouble(JOptionPane.showInputDialog("Digite el tercer numero decimal"));
		suma= numeroUno+numeroDos+numeroTres;
		mensaje= "SUMA NUMEROS DECIMALES \n";
		mensaje+="Numero 1: "+numeroUno+"\n";
		mensaje+="Numero 2: "+numeroDos+"\n";
		mensaje+="Numero 3: "+numeroTres+"\n";
		mensaje+="Resultado: "+suma;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
