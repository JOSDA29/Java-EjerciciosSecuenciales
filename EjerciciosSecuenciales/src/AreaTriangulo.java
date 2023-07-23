/*Halle el área de un triángulo rectángulo si su base y altura son de un valor desconocido 
 * (área=(base*altura)/2).*/

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main(String[] args) {
		double area, base, altura;
		String mensaje;
		base= Double.parseDouble(JOptionPane.showInputDialog("Digite la base de su triangulo"));
		altura= Double.parseDouble(JOptionPane.showInputDialog("Digite la altura de su triangulo"));
		area= (base*altura)/2;
		mensaje= "AREA DEL TRIANGULO RECTANGULO \n";
		mensaje+="Base: "+base+"\n";
		mensaje+="Altura: "+altura+"\n";
		mensaje+="Area: "+area;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
