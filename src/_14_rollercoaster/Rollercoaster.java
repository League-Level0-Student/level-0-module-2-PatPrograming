package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	
String height=JOptionPane.showInputDialog("What's your height in inches?");
int heightint=Integer.parseInt(height);
if(heightint >= 48) {
	JOptionPane.showMessageDialog(null, "You can go on the roller coaster.");
}
else {
	JOptionPane.showMessageDialog(null, "Grow taller midget.");
}











}
}
