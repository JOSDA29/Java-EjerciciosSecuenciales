/*Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas teniendo en cuenta 
 * que cada hora se paga a 2000, adicionalmente se le realiza unos descuentos con respecto a un 
 * impuesto de seguridad del 10% sobre su salario.*/

import javax.swing.JOptionPane;

public class SalarioEmpleado {

	public static void main(String[] args) {
		String mensaje;
		double salarioAnterior, salarioNuevo, salarioTotal; 
		int horasExtraTrabajadas, horasExtra;
		final int VALOR_HORAS= 2000;
		final double IMPUESTO_SEGURIDAD= 0.10;
		
		salarioAnterior= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de su salario"));
		horasExtraTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas trabajadas"));
		horasExtra= horasExtraTrabajadas*VALOR_HORAS;
		salarioNuevo= salarioAnterior+horasExtra;
		salarioTotal= (salarioNuevo*IMPUESTO_SEGURIDAD)+salarioNuevo;
		mensaje= "SALARIO FINAL \n";
		mensaje+="Salario anterior: "+salarioAnterior+"\n";
		mensaje+="Horas extra trabajadas: "+horasExtraTrabajadas+"\n";
		mensaje+="Valor horas extra: "+horasExtra+"\n";
		mensaje+="Salario Total: "+salarioTotal;
		JOptionPane.showMessageDialog(null, mensaje, "RESULT", JOptionPane.INFORMATION_MESSAGE);
	}

}
