/*Modifique el algoritmo anterior para que al resultado se le multiplique por 2.*/

import javax.swing.JOptionPane;

public class SumaDecimalesDos {

	public static void main(String[] args) {
		double numeroUno, numeroDos, numeroTres, suma;
		String mensaje;
		numeroUno= Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero decimal"));
		numeroDos= Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero decimal"));
		numeroTres= Double.parseDouble(JOptionPane.showInputDialog("Digite el tercer numero decimal"));
		suma= (numeroUno+numeroDos+numeroTres)*2;
		mensaje= "SUMA NUMEROS DECIMALES \n";
		mensaje+="Numero 1: "+numeroUno+"\n";
		mensaje+="Numero 2: "+numeroDos+"\n";
		mensaje+="Numero 3: "+numeroTres+"\n";
		mensaje+="Resultado: "+suma;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);

	}

}
