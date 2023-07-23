/*Crea un algoritmo que calcule e imprima el promedio de 3 notas parciales*/

import javax.swing.JOptionPane;

public class PromedioNotas {

	public static void main(String[] args) {
		double notaUno, notaDos, notaTres, promedio;
		String mensaje;
		notaUno= Double.parseDouble(JOptionPane.showInputDialog("Digite su primera nota"));
		notaDos= Double.parseDouble(JOptionPane.showInputDialog("Digite su primera nota"));
		notaTres= Double.parseDouble(JOptionPane.showInputDialog("Digite su primera nota"));
		promedio= (notaUno+notaDos+notaTres)/3;
		mensaje= "PROMEDIO NOTAS \n";
		mensaje+="Nota 1: "+notaUno+"\n";
		mensaje+="Nota 2: "+notaDos+"\n";
		mensaje+="Nota 3: "+notaTres+"\n";
		mensaje+="Promedio: "+promedio;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);

	}

}
