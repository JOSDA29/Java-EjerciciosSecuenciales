/* Dado un numero natural n, calcular la suma de los primeros n números naturales.*/

import javax.swing.JOptionPane;

public class SumaNaturales {

	public static void main(String[] args) {
		int numeroNatural, suma;
		numeroNatural= Integer.parseInt(JOptionPane.showInputDialog("Digite cualquier numero natural"));
		suma= (numeroNatural*(numeroNatural+1))/2;
		JOptionPane.showMessageDialog(null, "La suma de los primeros numeros hasta "+numeroNatural+". Es "+suma, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
