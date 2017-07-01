import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
	    String[] hero = {"Damager", "Healer", "Tank"};
	    String[] IA = {"Damager", "Healer", "Tank"};
	    String[] levelIA = {"Level 1", "Level 2", "Level 3"};
	    JOptionPane jop = new JOptionPane(), 
	    jop2 = new JOptionPane();
	    String nom1 = (String)jop.showInputDialog(null, "Choose your hero","MENU",JOptionPane.QUESTION_MESSAGE, null, hero, hero[2]);
	    String nom2 = (String)jop.showInputDialog(null, "Choose your IA","MENU",JOptionPane.QUESTION_MESSAGE, null, IA, IA[2]);
	    String nom3 = (String)jop.showInputDialog(null, "Choose the level of the IA","MENU",JOptionPane.QUESTION_MESSAGE, null, levelIA, levelIA[2]);
	    jop2.showMessageDialog(null, "You will play with " + nom1 + " against " + nom2 + " at the " + nom3, "Game", JOptionPane.INFORMATION_MESSAGE);
	  }
}

