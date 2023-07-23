/*Crear un algoritmo que imprima el nombre, apellido, documento de identidad, edad y profesión, teléfono de una persona de la siguiente manera: 

Datos Ingresados:
Nombre Completo: Pepito Pérez
Edad: 23
Documento: 109456788
Profesión: Estudiante
Teléfono: 3113841824
*/

import javax.swing.JOptionPane;

public class DatosBasicosDos {

	public static void main(String[] args) {
		String nombre, profesion, mensaje;
		int documento, edad, telefono;
		nombre= JOptionPane.showInputDialog("Digite su nombre completo");
		edad= Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
		documento= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de su documento"));
		profesion= JOptionPane.showInputDialog("Digite su profesion");
		telefono= Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de telefono"));
		mensaje= "DATOS INGRESADOS \n";
		mensaje+="Nombre completo: "+nombre+"\n";
		mensaje+="Edad: "+edad+"\n";
		mensaje+="Documento: "+documento+"\n";
		mensaje+="Profesion: "+profesion+"\n";
		mensaje+="Teléfono: "+telefono+"\n";
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
