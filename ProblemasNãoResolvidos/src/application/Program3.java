package application;

import javax.swing.JOptionPane;

import entities.Triangule;

public class Program3 {

	public static void main(String[] args) {
		
		Triangule x = new Triangule();
		
		x.width=Integer.parseInt(JOptionPane.showInputDialog(" Insert a number this is triangule: "));
		x.height=Integer.parseInt(JOptionPane.showInputDialog(" Insert a number this is triangule: "));
		
		double areaX = x.area();
		double perimeterX =x.perimeter();
		double diagonalX = x.diagonal();
		
		JOptionPane.showMessageDialog(null, "This area is: " + areaX);
		JOptionPane.showMessageDialog(null, "This perimeter is: " + perimeterX);
		JOptionPane.showMessageDialog(null, "This diagonal is: " + diagonalX);
	}

}
