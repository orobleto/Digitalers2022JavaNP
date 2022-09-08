package com.educaciontit.Prueba_Escritorio;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class HolaMundo {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Dime tu nombre");
		JOptionPane.showMessageDialog(null, "tu nombre es:" + input);
	}
}
