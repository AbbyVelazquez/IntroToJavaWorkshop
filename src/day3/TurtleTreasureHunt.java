package day3;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.move(tortoiseSpeed);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen

		Tortoise.move(-tortoiseSpeed);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()

		Tortoise.setAngle(-90);
		Tortoise.move(tortoiseSpeed);
		Tortoise.setAngle(0);
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(tortoiseSpeed);
		Tortoise.setAngle(0);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
		System.out.println(tortoiseLocationX + " x ");
		System.out.println(tortoiseLocationY + " y ");
		// 6. If tortoise is at same location as the little girl,
		// make a pop-up tell the Tortoise where to go next
		if (tortoiseLocationX >= 480 && tortoiseLocationX <= 530 && tortoiseLocationY >= 290 && tortoiseLocationY <= 350) {
			JOptionPane.showMessageDialog(null, "Go to the Swamp Next and Collect the Glass Bottle.");
		} else if (tortoiseLocationX >= 250 && tortoiseLocationX <= 325 && tortoiseLocationY >= 355 && tortoiseLocationY <= 390) {
			JOptionPane.showMessageDialog(null, "Move to the Rock and Take the Map. ");
		}
		else if (tortoiseLocationX >= 160 && tortoiseLocationX <= 215 && tortoiseLocationY >= 240 && tortoiseLocationY <= 285) {
			JOptionPane.showMessageDialog(null, "Find the Boat to Escape the Island. ");
		}
		else if (tortoiseLocationX >= 255 && tortoiseLocationX <= 395 && tortoiseLocationY >= 245 && tortoiseLocationY <= 395) {
			JOptionPane.showMessageDialog(null, "Congrats! You've Escaped! ");
		}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)

	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point
		 * to it like: new ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the Little Girl for Help with Your Quest. Press the Space Bar to Ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}
