/*Cree un algoritmo que calcule e imprima lo que debe pagar un paciente a un hospital debido a 
 * un tratamiento teniendo como entradas el costo del tratamiento, el número de días de hospitalización
 *  y el costo de los medicamentos. Cada día de hospitalización cuesta $100000.*/

import javax.swing.JOptionPane;

public class Hospital {

	public static void main(String[] args) {
		double costoTratamientos, costoMedicamentos, costoTotal;
		int cantidadDias, valorDias;
		String mensaje;
		costoTratamientos= Double.parseDouble(JOptionPane.showInputDialog("Digite el costo del tratamiento"));
		costoMedicamentos= Double.parseDouble(JOptionPane.showInputDialog("Digite los costos de los medicamentos"));
		cantidadDias= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dias estuvo hospitalizado"));
		valorDias= cantidadDias*100000;
		costoTotal=costoTratamientos+costoMedicamentos+valorDias;
		mensaje= "COSTOS HOSPITAL \n";
		mensaje+="Costo Tratamiento: "+costoTratamientos+"\n";
		mensaje+="Costo Mediacamentos: "+costoMedicamentos+"\n";
		mensaje+="Dias Hospitalizado: "+cantidadDias+"\n";
		mensaje+="Valor Dias Hospitalizado: "+valorDias+"\n";
		mensaje+="Costo Total: "+costoTotal;
		JOptionPane.showMessageDialog(null, mensaje, "RESUKT", JOptionPane.INFORMATION_MESSAGE);
	}

}
