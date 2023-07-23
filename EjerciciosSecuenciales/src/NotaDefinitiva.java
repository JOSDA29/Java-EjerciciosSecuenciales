/* De un estudiante conocemos la nota 1, la nota 2, la nota de trabajos y el Examen final.
Calcular la nota definitiva (notaDefinitiva) aplicando los porcentajes 20%, 20%, 30% y 30%,
respectivamente. Tenga en cuenta que 20% equivale a 0.2 y 30% es igual a 0.3.*/

import javax.swing.JOptionPane;

public class NotaDefinitiva {

	public static void main(String[] args) {
		double notaUno, notaDos, notaTres, notaExamen, porTotal;
		final double PORCENTAJE_UNO= 0.20;
		final double PORCENTAJE_DOS= 0.30;
		String mensaje;
		notaUno= Double.parseDouble(JOptionPane.showInputDialog("Digite la primera nota"));
		notaDos= Double.parseDouble(JOptionPane.showInputDialog("Digite la segunda nota"));
		notaTres= Double.parseDouble(JOptionPane.showInputDialog("Digite la tercera nota"));
		notaExamen= Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
		porTotal= (notaUno*PORCENTAJE_UNO)+(notaDos*PORCENTAJE_UNO)+(notaTres*PORCENTAJE_DOS)+(notaExamen*PORCENTAJE_DOS);
		mensaje= "NOTA DEFINITIVA \n";
		mensaje+="Nota 1: "+notaUno+"\n";
		mensaje+="Nota 2: "+notaDos+"\n";
		mensaje+="Nota 3: "+notaTres+"\n";
		mensaje+="Nota Examen: "+notaExamen+"\n";
		mensaje+="Definitiva: "+porTotal;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
