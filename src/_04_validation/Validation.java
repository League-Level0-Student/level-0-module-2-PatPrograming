//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==0) {
	JOptionPane.showMessageDialog(null, "Are you cake? Cause I want a piece of that...");
}
if (randomNumber==1) {
	JOptionPane.showMessageDialog(null, "If you were a library book, I would check you out...");
}
if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "I'm new in town. Could you give me directions to your apartment...");
}
if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "Are you a beaver? Cause daaaaaaaaam!");
}
if (randomNumber==4) {
	JOptionPane.showMessageDialog(null, "My lips are like skittles. Wanna taste the rainbow?");
}
if (randomNumber==5) {
	JOptionPane.showMessageDialog(null, "Well, here I am. What were your other two wishes?");
}
if (randomNumber==6) {
	JOptionPane.showMessageDialog(null, "You're lookin like a full meal today...");
}
if (randomNumber==7) {
	JOptionPane.showMessageDialog(null, "I would take you to the movies, but they doing let snacks in...");
}
if (randomNumber==8) {
	JOptionPane.showMessageDialog(null, "Have You Ever Been Arrested? It Must Be Illegal To Look That Good.");
}
if (randomNumber==9) {
	JOptionPane.showMessageDialog(null, "If You Were A Chicken, You’d Be Impeccable.");
}
		

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
