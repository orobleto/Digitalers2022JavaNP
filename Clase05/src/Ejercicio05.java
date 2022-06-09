import javax.swing.JOptionPane;

public class Ejercicio05 {
	public static void main(String[] args) {

		//System.out.println("octavio".equals("octavio"));

		String nombre1 = JOptionPane.showInputDialog("Ingresa el nombre1");

		String nombre2 = JOptionPane.showInputDialog("Ingresa el nombre2");
		/*
		 * int numero1 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero1")); int
		 * numero2 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero2"));
		 */
		if (nombre1.toLowerCase().equals(nombre2.toLowerCase())) {
			JOptionPane.showMessageDialog(null, "Son iguales");
		} else {
			JOptionPane.showMessageDialog(null, "No son iguales");
		}
	}
}
