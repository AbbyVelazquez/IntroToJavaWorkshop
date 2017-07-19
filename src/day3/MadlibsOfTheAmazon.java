package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// 
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String a= JOptionPane.showInputDialog("Enter an Adjective");
		// Get the user to enter a type of liquid
String l= JOptionPane.showInputDialog("Enter a Liquid");
		// Get the user to enter a body part
String b= JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
String v= JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
String p= JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
JOptionPane.showMessageDialog(null, "Piranhas are more " +a + " during the day,\n so cross the river at night. Piranhas are attracted \n to fresh " +a+" " +l + " and will most likely take a bite \n out of your " +b+ " if you " +v+ ". Whatever you do, \n if you have an open wound, try to find another way to get \n back to the " +p + ". Good Luck!");
		//  [adjective] 

		//  [type of liquid] and will most

		// likely take a bite out of your [body part] if you [verb]. Whatever

		// you do, if you have an open wound, try to find another way to get

		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

