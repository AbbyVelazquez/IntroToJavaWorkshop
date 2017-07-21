package day5;

import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
		// 1. ask the user for a guess using a pop-up window, and save their response
		String ans = JOptionPane.showInputDialog("Guess a Number from 1-100");
		// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int answer = Integer.parseInt(ans);
		// 5. if the guess is correct
		if (answer == random) {

			JOptionPane.showMessageDialog(null, "You Win!");
		}

		// 7. if the guess is high
		if (answer>random) {

			JOptionPane.showMessageDialog(null, "Too High!");
		}
		// 8. tell them it's too high
		// 9. if the guess is low
		if(answer<random){
			
			JOptionPane.showMessageDialog(null, "Too Low!");
		}
		}

		// 10. tell them it's too low

		// 12. tell them they lose
	}

}
