//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown – or the rocket won’t launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
String countdown = JOptionPane.showInputDialog("What do you want to start counting from?");
		// 3. Change the countdown to use the new starting point
int countdown1=Integer.parseInt(countdown);
		// 1. Print a countdown from 10 to 0 on the console
	System.out.println(countdown);
			// 4. Use the speak method to hear the countdown.
		for (int i = 0; i < countdown1; i++) {
			speak(""+(countdown1-i));
		}
			// 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
		Thread.sleep(1000);
		// 5. when the counting is done, speak "blastoff!"
		speak("Blastoff!");
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


