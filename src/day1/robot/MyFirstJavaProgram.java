package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot Dave = new Robot();
		Dave.penDown();
        for (int i = 0; i < 4; i++) {
        	Dave.move(128);
    		Dave.turn(90);
		}
	}
}
