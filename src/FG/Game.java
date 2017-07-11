package FG;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.io.*;
import javax.imageio.*;


class Fen1 extends JFrame implements ActionListener
{
 public Fen1()
 {
	// We give the characteristics of the frame
	 
	 
  setTitle(" ----------FIGHTING GAME---------- "); //name
  setSize (1100,1400); // size
  Container contents = getContentPane(); //container 
  contents.setLayout(new FlowLayout()); // we always remove the frame

  
  	// Creation of a menu inside the frame named "option" with several features
  
  Menu = new JMenuBar(); //creation of a menu button
  setJMenuBar(Menu); 
  New = new JMenu("Options"); // name of the button
  Menu.add(New); // Adding the name to the button
  
  	//First feature to begin again the game
  
  newGame = new JMenuItem("Begin again"); //name of the button to begin another game
  New.add(newGame);
  newGame.addActionListener(this); // handling the action event for a new game
  
  	//Second feature to choose level
  
  leveldecided = new JMenuItem("Levels"); // name of the button to choose the IA level 
  New.add(leveldecided);
  leveldecided.addActionListener(this); //handling the action to choose the level
  
  	//Third feature to choose the hero
  
  Hero = new JMenuItem("Characters"); // Button to bring the different characteristics of characters
  New.add(Hero);
  Hero.addActionListener(this); // handling the action to see description's characters

  
  	//Text which explains the game 
  
  Intro1 = new JLabel(); // we create label to insert text on the frame
  Intro2 = new JLabel(); //same

  contents.add(Intro1); //Adding on the frame
  contents.add(Intro2); //same
 
  Intro1.setText("This is a fighting Game. When you no longer have life you are dead.\n"); //Text that users will see on the frame
  Intro2.setText("Choose the game that you want. You have the character's description on the option button.\n"); //same
  
  
  //Creation of 3 games : Damager vs Healer / Healer vs Tank / Tank vs Damager 
  
  //We use addactionListener to take into account the choice of user
  
  //First game (Damager vs Healer) with button creation
  Intro4 = new JLabel();
  contents.add(Intro4);
  Intro4.setText("You : Damager   vs   Computer : Healer \n"); //text
  
  //First button : Sword which allows the enemy and you to attack
  Sword = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Epee.jpeg")); //image inside the button to attack
  contents.add(Sword);
  Sword.addActionListener(this);
  
  //Second button : Shield which allows the enemy and you to block
  Shield = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Bouclier.jpeg"));//image inside the button to block
  contents.add(Shield);
  Shield.addActionListener(this);
 
  //Last button : Wand which allows the enemy and you to use special power
  Wand = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/baguette.jpeg"));//image inside the button to use special power
  contents.add(Wand);
  Wand.addActionListener(this);

  //Second game (Healer vs Tank) with button creation

  Intro5 = new JLabel();
  contents.add(Intro5);
  Intro5.setText("You : Healer   vs   Computer : Tank \n"); //text on the frame
  
  Sword2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Epee.jpeg")); //image
  contents.add(Sword2);
  Sword2.addActionListener(this);
  
  //Second button : Shield which allows the enemy and you to block
  Shield2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Bouclier.jpeg")); //image
  contents.add(Shield2);
  Shield2.addActionListener(this);
 
  //Last button : Wand which allows the enemy and you to use special power
  Wand2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/baguette.jpeg")); //image
  contents.add(Wand2);
  Wand2.addActionListener(this);
  
  
  //Third game (Tank vs Damager) with button creation

  Intro6 = new JLabel();
  contents.add(Intro6);
  Intro6.setText("You : Tank   vs   Computer : Damager \n");
  
  Sword3 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Epee.jpeg"));
  contents.add(Sword3);
  Sword3.addActionListener(this);
  
  //Second button : Shield which allows the enemy and you to block
  Shield3 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Bouclier.jpeg"));
  contents.add(Shield3);
  Shield3.addActionListener(this);
 
  //Last button : Wand which allows the enemy and you to use special power
  Wand3 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/baguette.jpeg"));
  contents.add(Wand3);
  Wand3.addActionListener(this);
  
  //Creation of label to print scores
  
  ComputerChoice = new JLabel("The computer has choosen :          "); //text to show the choice of the IA
  contents.add(ComputerChoice); // recovers to print the message
  result = new JLabel(" *** SCORE *** You : " + " | Computer : " ); // text for the score
  contents.add(result); // recovers the text for the score
  Victory = new JLabel (""); //nothing to print in this label for the moment but important for victory or failure
  contents.add(Victory); //recovers text of victory

 }
 
 
 //Creation of a frame, less important which allows you to choose the level of your enemy
 
 class Fen2 extends JFrame implements ActionListener
 {
  public Fen2()
  {
	  
	  //Parameters of the frame
   setTitle(" *** The different levels *** "); //Name of the frame
   setSize (400,200); //Size of the frame
   Container contents = getContentPane(); //container
   contents.setLayout(new FlowLayout()); // always update information inside the frame
   ButtonGroup groupe = new ButtonGroup(); //created to manage several buttons
   //Initialization of buttons
   levels = new JLabel(); 
   contents.add(levels);
   levels.setText("Which level do you want to choose for your enemy ?"); //text
   //First button level 
   level1 = new JRadioButton("Level 1",true); //radiobutton to allow user to choose one button
   groupe.add(level1);
   contents.add(level1);
   level1.addActionListener(this); //get action of user
   //Second button level 
   level2 = new JRadioButton("Level 2");
   groupe.add(level2);
   contents.add(level2);
   level2.addActionListener(this);
   //Third button level
   level3 = new JRadioButton("Level 3");
   groupe.add(level3);
   contents.add(level3);
   level3.addActionListener(this);
 
   
   //Method creation to recover choice of the user and to initialize the different possibilities
  }

@Override
public void actionPerformed(ActionEvent e) {
	
}
 }
 
 
 //Creation of another frame, which allows you to choose your hero

 class Fen3 extends JFrame implements ActionListener
 {
  private AbstractButton label;

public Fen3()
  {
	  
	 //Parameters of this frame
   setTitle(" Character's description ");
   setSize (450,270);
   Container contenu = getContentPane();
   contenu.setLayout(new FlowLayout());
   ButtonGroup groupe = new ButtonGroup();
   //Text written in this frame
   choiceHero = new JLabel();
   contenu.add(choiceHero);
   choiceHero.setText("The description of the three characters                                  ");
   //Different characters with pictures inside a button
   //First choice
   Damager1 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/damager.jpeg")); //pictures inside a button
   groupe.add(Damager1);
   contenu.add(Damager1);
   Damager1.addActionListener(this);
   //Second choice
   Healer1 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/healer.jpeg")); //pictures inside a button
   groupe.add(Healer1);
   contenu.add(Healer1);
   Healer1.addActionListener(this);
   //Third choice
   Tank1 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/tank.jpeg")); //pictures inside a button
   groupe.add(Tank1);
   contenu.add(Tank1);
   Tank1.addActionListener(this);
   
   // Implements text inside this frame which allow users to know character's characteristicss
   Intro3 = new JLabel(); //label which allows to insert text
   Intro7 = new JLabel(); //same
   Intro8 = new JLabel(); //same
   Container contents = getContentPane(); 
   contents.add(Intro3); //get characteristics
   contents.add(Intro7); //same
   contents.add(Intro8); //same
   Intro3.setText("- Damager : life's points = 12 | Attack = 2 | Power : recovers one life point.\n"); //text inside frame
   Intro7.setText("- Healer : life's points = 16 | Attack = 1 | Power : recovers two life's points.\n"); //same
   Intro8.setText("- Tank : life's points = 20 | Attack = 1 | Power : recovers one life point."); //same
  }
  

  public void actionPerformed(ActionEvent ev){

 	}
 }
 
 
   //Method creation to recover choice of the user and to initialize the different possibilities

 
 public void actionPerformed(ActionEvent ev)	 
 {
	 if (ev.getSource() == leveldecided) //for the frame where you can choose the IA level	 
	 { 
		 vict = ""; //nothing to print
		 Fen2 fen2 = new Fen2(); //constructor to open a frame with characteristics of the frame Fen2
		 fen2.setVisible(true); //to see the frame
		 fen2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //you can close her
	 }
	 vict = Victory.getText(); //recovers text victory and print

	 
	 if (ev.getSource() == Hero)	 //for the frame where you can choose the IA level
	 { 
		 vict = ""; 
		 Fen3 fen3 = new Fen3(); //constructor 
		 fen3.setVisible(true); //see the frame
		 fen3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //can close the frame
	 }
	 vict = Victory.getText(); //recovers text victory and print

	 

	 if (ev.getSource() == newGame)    //Condition if you begin a new game
	 {
		 //Everything is reset
		 Victory.setText("");
		 vict = Victory.getText(); //recovers text victory and print
		 ComputerChoice.setText("The computer has choosen :         "); //Print this text on the main frame to know what decided computer
		 result.setText(" *** SCORE *** You : " + " | Computer : "); //Print this text on the main frame to see a new score
		 
	 }

// Always in actionperformed, giving condition for the battle with all possibilities

	 //Creating three different battle before and know initializing them
	 
//First Game : you are Damager and the computer is Healer
	
		 if (ev.getSource() == Sword) //if the user choose to attack with Damager
		 {
				 // Computer method to do his choice
			 
			 for (int i = 0 ; i < nb.length ; i++) //creating a for loop because we created a table 
					 t.add( new String (nb[i])); // Browsing the table 
				 {
					 Collections.shuffle(t); // shuffle all different choices in the table
					 choice = t.get(1); //doing his choice
					 System.out.println(choice); //print in the console the choice
				 }
				 
		   
				 // Result
	   
				 if ( choice.equals("Attack")) //if the computer decided to attack the user
				 {
					 System.out.println("You decided to attack "); //text print on the console
					 System.out.println("The computer decided to attack ");	//same
					 ComputerChoice.setText("You decided to attack | The computer decided to attack " ); //text print on the frame
					 UDamLife = UDamLife - FAhealer ; //battle points after these decisions
					 CHealerLife = CHealerLife - FAdam; //computer life less attack of the damager
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife); //print the score on the console
					 ComputerChoice.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife ); //print this text with live score in the console
					 
					 Icon icon1 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_attack.png"); //put this picture
					 JLabel i1 = new JLabel(icon1); //create label to put the picture inside the frame 
					 getContentPane().add(i1); //get elements
					 
					 Icon icon2 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_attack.png"); //same
					 JLabel i2 = new JLabel(icon2); //same
					 getContentPane().add(i2); //same
				 }
	   
				 
				 if ( choice.equals("Block")) //the computer decided to block
				 {
					 System.out.println("You decided to attack ");
					 System.out.println("The computer decided to block " );	
					 ComputerChoice.setText("You decided to attack | The computer decided to block " );
					 CHealerLife = CHealerLife - Block; //Computer life less the action block 
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife); //print the score on the console
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife ); //print the score on the frame
					 
					 Icon icon3 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_attack.png"); //picture
					 JLabel i3 = new JLabel(icon3);
					 getContentPane().add(i3);
					 
					 Icon icon4 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_block.png"); //pictue
					 JLabel i4 = new JLabel(icon4);
					 getContentPane().add(i4);
				 }


				 if ( choice.equals("Special_Power")) //if the computer decided to use special power
				 {
					 System.out.println("You decided to attack ");
					 System.out.println("The computer decided to use special power ");
					 ComputerChoice.setText("You decided to attack | The computer decided to use special power ");
					 CHealerLife = CHealerLife - FAdam + SPhealer ; //Computer's life less force attack of the damager. But he recovers point's life because he used special powers.
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife); //text console
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife ); //text frame
					 
					 Icon icon5 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_attack.png"); //pictures
					 JLabel i5 = new JLabel(icon5);
					 getContentPane().add(i5);
					 
					 Icon icon6 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_SP.png"); //pictures
					 JLabel i6 = new JLabel(icon6);
					 getContentPane().add(i6);
					 
				 }
			 }


	  // You choose to block

			 if (ev.getSource() == Shield) //if the user choose to block
			 {
				 
	  	  // Computer choice
				 for (int i = 0 ; i < nb.length ; i++)//creating a for loop because we created a table
					 t.add( new String(nb[i])); //Adding a new element string on the arraylist named 't'.
				 {
					 Collections.shuffle(t);//shuffle all different choices in the table
					 choice = t.get(1) ;//recovers the choice of the computer
				 }

		   // Result
		   
				 if (choice.equals("Attack")) //if the computer attacks the user
				 {
					 System.out.println("You decided to block "); //text console
					 System.out.println("The computer decided to attack ");	//text console
					 ComputerChoice.setText("You decided to block | The computer decided to attack "); //text frame
					 UDamLife = UDamLife - Block;	  //If the computer attacks and the user block, the user looses 1 life's point
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon7 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_block.png");//picture
					 JLabel i7 = new JLabel(icon7);
					 getContentPane().add(i7);
					 
					 Icon icon8 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_attack.png"); //picture
					 JLabel i8 = new JLabel(icon8);
					 getContentPane().add(i8);
					 
				 }
				 
				 
				 if ( choice.equals("Block")) //if the computer blocks 
				 {
					 System.out.println("You decided to block ");//text console
					 System.out.println("The computer decided to block ");	//same
					 ComputerChoice.setText("You decided to block | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");//frame text
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife); //Nothing happened so we keep the same score
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife);
					 
					 Icon icon9 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_block.png");//picture
					 JLabel i9 = new JLabel(icon9);
					 getContentPane().add(i9);
					 
					 Icon icon10 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_block.png");//picture
					 JLabel i10 = new JLabel(icon10);
					 getContentPane().add(i10);
				 }
				 
				 
				 if ( choice.equals("Special_Power")) //if the computer uses special power
				 {
					 System.out.println("You decided to block ");//console text
					 System.out.println("The computer decided to use special power "); //same
					 ComputerChoice.setText("You decided to block | The computer decided to use special power ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");//frame text
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife); //Nothing happened because the computer must only attacks the user when the user blocks
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife ); //print score on the frame
					 
					 Icon icon11 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_block.png"); //picture
					 JLabel i11 = new JLabel(icon11);
					 getContentPane().add(i11);
					 
					 Icon icon12 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_SP.png"); //picture
					 JLabel i12 = new JLabel(icon12);//create a new placement for the picture
					 getContentPane().add(i12); //get the picture to add on the frame
				 }
			 }
	  
	  // choix joueur Ciseau

			 if (ev.getSource() == Wand) //if the user uses special power
			 {
		  // choix ordinateur
		  
				 for (int i = 0 ; i < nb.length ; i++) //creating a for loop because we created a table
					 t.add( new String (nb[i]));//Adding a new element string on the arraylist named 't'
				 {
					 Collections.shuffle(t);//shuffle all different choices in the table
					 choice = t.get(1) ;//recovers the choice of the computer
				 }
		  
		   // resultat
		 
				 if ( choice.equals("Attack")) //if the computer attacks when the user uses special power
				 {
					 System.out.println("You decided to use special power "); //console text
					 System.out.println("The computer decided to attack you ");	//same
					 ComputerChoice.setText("You decided to use special power | The computer decided to attack you ");
					 UDamLife = UDamLife + SPdam - FAhealer ;	  //The user uses his special power (win point life) but loose point because of the force attack of his ennemy
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon13 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_SP.png");
					 JLabel i13 = new JLabel(icon13);
					 getContentPane().add(i13);
					 
					 Icon icon14 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_attack.png");
					 JLabel i14 = new JLabel(icon14);
					 getContentPane().add(i14);
				 }
				 
				 
				 if ( choice.equals("Block")) //when the computer blocks
				 {
					 System.out.println("You decided to use special power ");
					 System.out.println("The computer decided to block ");	
					 ComputerChoice.setText("You decided to use special power | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife); //the score is the same because he cannot block when the user uses special power
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife);
					 
					 Icon icon15 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_SP.png");
					 JLabel i15 = new JLabel(icon15);
					 getContentPane().add(i15);
					 
					 Icon icon16 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_block.png");
					 JLabel i16 = new JLabel(icon16);
					 getContentPane().add(i16);
					 
				 }
				 
				 
				 if ( choice.equals("Special_Power")) //the computer uses special power
				 {
					 System.out.println("You decided to use special power ");
					 System.out.println("The computer decided to use special power ");	
					 ComputerChoice.setText("You decided to use special power | The computer decided to use special power ");
					 UDamLife = UDamLife + SPdam; //the user earns life's points
					 CHealerLife = CHealerLife + SPhealer; //same for the computer
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon17 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_SP.png"); //picture
					 JLabel i17 = new JLabel(icon17);
					 getContentPane().add(i17);
					 
					 Icon icon18 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_SP.png"); //picture
					 JLabel i18 = new JLabel(icon18);
					 getContentPane().add(i18);
					 
				 }    
			 }
		 
		 
//Second game where you are Healer and the computer is Tank
			 
			 if (ev.getSource() == Sword2) //when the user attacks
			 {
					 // Computer choice
				 for (int i = 0 ; i < nb.length ; i++) //creating a for loop because we created a table
						 t.add( new String (nb[i]));//Adding a new element string on the arraylist named 't'
					 {
						 Collections.shuffle(t);//shuffle all different choices in the table
						 choice = t.get(1);//recovers the choice of the computer
						 System.out.println(choice);
					 }
					 
			   
					 // Result
		   
					 if ( choice.equals("Attack")) //if the computer wants to attack
					 {
						 System.out.println("You decided to attack ");
						 System.out.println("The computer decided to attack ");	
						 ComputerChoice.setText("You decided to attack | The computer decided to attack " );
						 UHealerLife = UHealerLife - FAtank ;
						 CTankLife = CTankLife - FAhealer;
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 ComputerChoice.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon1 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_attack.png");
						 JLabel i1 = new JLabel(icon1);
						 getContentPane().add(i1);
						 
						 Icon icon2 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_attack.png");
						 JLabel i2 = new JLabel(icon2);
						 getContentPane().add(i2);
					 }
		   
					 
					 if ( choice.equals("Block")) //if the computer wants to block
					 {
						 System.out.println("You decided to attack ");
						 System.out.println("The computer decided to block " );	
						 ComputerChoice.setText("You decided to attack | The computer decided to block " );
						 CTankLife = CTankLife - Block;
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon3 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_attack.png");
						 JLabel i3 = new JLabel(icon3);
						 getContentPane().add(i3);
						 
						 Icon icon4 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_block.png");
						 JLabel i4 = new JLabel(icon4);
						 getContentPane().add(i4);
					 }
					 

					 if ( choice.equals("Special_Power"))//if the computer wants to use special power
					 {
						 System.out.println("You decided to attack ");
						 System.out.println("The computer decided to use special power ");
						 ComputerChoice.setText("You decided to attack | The computer decided to use special power ");
						 CTankLife = CTankLife - FAhealer + SPtank ;
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon5 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_attack.png");
						 JLabel i5 = new JLabel(icon5);
						 getContentPane().add(i5);
						 
						 Icon icon6 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_SP.png");
						 JLabel i6 = new JLabel(icon6);
						 getContentPane().add(i6);
					 }
				 } 

		  
		  // You choose to block
		  
				 if (ev.getSource() == Shield2) //if the user blocks
				 {
					 
		  	  // Computer choice
					 for (int i = 0 ; i < nb.length ; i++)
						 t.add( new String(nb[i]));
					 {
						 Collections.shuffle(t);
						 choice = t.get(1) ;
					 }

			   // Result
			   
					 if (choice.equals("Attack"))//if the computer wants to attack
					 {
						 System.out.println("You decided to block ");
						 System.out.println("The computer decided to attack ");	
						 ComputerChoice.setText("You decided to block | The computer decided to attack ");
						 UHealerLife = UHealerLife - Block;	  
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon7 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_block.png");
						 JLabel i7 = new JLabel(icon7);
						 getContentPane().add(i7);
						 
						 Icon icon8 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_attack.png");
						 JLabel i8 = new JLabel(icon8);
						 getContentPane().add(i8);
					 }
					 
					 
					 if ( choice.equals("Block"))//if the computer wants to block
					 {
						 System.out.println("You decided to block ");
						 System.out.println("The computer decided to block ");	
						 ComputerChoice.setText("You decided to block | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon9 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_block.png");
						 JLabel i9 = new JLabel(icon9);
						 getContentPane().add(i9);
						 
						 Icon icon10 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_block.png");
						 JLabel i10 = new JLabel(icon10);
						 getContentPane().add(i10);
					 }
					 
					 
					 if ( choice.equals("Special_Power"))//if the computer wants to use special power
					 {
						 System.out.println("You decided to block ");
						 System.out.println("The computer decided to use special power ");	
						 ComputerChoice.setText("You decided to block | The computer decided to use special power ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon11 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_block.png");
						 JLabel i11 = new JLabel(icon11);
						 getContentPane().add(i11);
						 
						 Icon icon12 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_SP.png");
						 JLabel i12 = new JLabel(icon12);
						 getContentPane().add(i12);
					 }
				 }
		  
		
				 //if the user choose to use special power
				 if (ev.getSource() == Wand2) 
				 {
			  // Computer choice
			  
					 for (int i = 0 ; i < nb.length ; i++)
						 t.add( new String (nb[i]));
					 {
						 Collections.shuffle(t);
						 choice = t.get(1) ;
					 }
			  
			   // Result
			 
					 if ( choice.equals("Attack")) //if the computer wants to attack
					 {
						 System.out.println("You decided to use special power ");
						 System.out.println("The computer decided to attack you ");	
						 ComputerChoice.setText("You decided to use special power | The computer decided to attack you ");
						 UHealerLife = UHealerLife + SPhealer - FAtank;  
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon13 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_SP.png");
						 JLabel i13 = new JLabel(icon13);
						 getContentPane().add(i13);
						 
						 Icon icon14 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_attack.png");
						 JLabel i14 = new JLabel(icon14);
						 getContentPane().add(i14);
					 }
					 
					 
					 if ( choice.equals("Block"))//if the computer wants to block
					 {
						 System.out.println("You decided to use special power ");
						 System.out.println("The computer decided to block ");	
						 ComputerChoice.setText("You decided to use special power | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon15 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_SP.png");
						 JLabel i15 = new JLabel(icon15);
						 getContentPane().add(i15);
						 
						 Icon icon16 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_block.png");
						 JLabel i16 = new JLabel(icon16);
						 getContentPane().add(i16);
					 }
					 
					 
					 if ( choice.equals("Special_Power"))//if the computer wants to use special power
					 {
						 System.out.println("You decided to use special power ");
						 System.out.println("The computer decided to use special power ");	
						 ComputerChoice.setText("You decided to use special power | The computer decided to use special power");
						 UHealerLife = UHealerLife + SPhealer;
						 CTankLife = CTankLife + SPtank;
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
						 
						 Icon icon17 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Gauche/healer_SP.png");
						 JLabel i17 = new JLabel(icon17);
						 getContentPane().add(i17);
						 
						 Icon icon18 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Droite/tank_SP.png");
						 JLabel i18 = new JLabel(icon18);
						 getContentPane().add(i18);
					 }    
				 }
				 
				 
//Game where you are Tank and computer is Damager
				 
				 if (ev.getSource() == Sword3) //if the user choose to attack the enemy
				 {
						 // Computer choice
					 for (int i = 0 ; i < nb.length ; i++)
							 t.add( new String (nb[i]));
						 {
							 Collections.shuffle(t);
							 choice = t.get(1);
							 System.out.println(choice);
						 }
						 
				   
						 // Result
			   
						 if ( choice.equals("Attack"))//if the computer wants to attack
						 {
							 System.out.println("You decided to attack ");
							 System.out.println("The computer decided to attack ");	
							 ComputerChoice.setText("You decided to attack | The computer decided to attack " );
							 UTankLife = UTankLife - FAdam ;
							 CDamLife = CDamLife - FAtank;
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 ComputerChoice.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon1 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_attack.png");
							 JLabel i1 = new JLabel(icon1);
							 getContentPane().add(i1);
							 
							 Icon icon2 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_attack.png");
							 JLabel i2 = new JLabel(icon2);
							 getContentPane().add(i2);
						 }
			   
						 
						 if ( choice.equals("Block"))//if the computer wants to block
						 {
							 System.out.println("You decided to attack ");
							 System.out.println("The computer decided to block " );	
							 ComputerChoice.setText("You decided to attack | The computer decided to block " );
							 CDamLife = CDamLife - Block;
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon3 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_attack.png");
							 JLabel i3 = new JLabel(icon3);
							 getContentPane().add(i3);
							 
							 Icon icon4 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_block.png");
							 JLabel i4 = new JLabel(icon4);
							 getContentPane().add(i4);
						 }
						 

						 if ( choice.equals("Special_Power"))//if the computer wants to use special power
						 {
							 System.out.println("You decided to attack ");
							 System.out.println("The computer decided to use special power ");
							 ComputerChoice.setText("You decided to attack | The computer decided to use special power ");
							 CDamLife = CDamLife - FAtank + SPdam ;
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon5 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_attack.png");
							 JLabel i5 = new JLabel(icon5);
							 getContentPane().add(i5);
							 
							 Icon icon6 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_SP.png");
							 JLabel i6 = new JLabel(icon6);
							 getContentPane().add(i6);
						 }
					 } 

			  
			  // You choose to block
			  
					 if (ev.getSource() == Shield3)
					 {
						 
			  	  // Computer choice
						 for (int i = 0 ; i < nb.length ; i++)
							 t.add( new String(nb[i]));
						 {
							 Collections.shuffle(t);
							 choice = t.get(1) ;
						 }

				   // Result
				   
						 if (choice.equals("Attack"))//if the computer wants to attack
						 {
							 System.out.println("You decided to block ");
							 System.out.println("The computer decided to attack ");	
							 ComputerChoice.setText("You decided to block | The computer decided to attack ");
							 UTankLife = UTankLife - Block;	  
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon7 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_block.png");
							 JLabel i7 = new JLabel(icon7);
							 getContentPane().add(i7);
							 
							 Icon icon8 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_attack.png");
							 JLabel i8 = new JLabel(icon8);
							 getContentPane().add(i8);
						 }
						 
						 
						 if ( choice.equals("Block"))//if the computer wants to block
						 {
							 System.out.println("You decided to block ");
							 System.out.println("The computer decided to block ");	
							 ComputerChoice.setText("You decided to block | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon9 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_block.png");
							 JLabel i9 = new JLabel(icon9);
							 getContentPane().add(i9);
							 
							 Icon icon10 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_block.png");
							 JLabel i10 = new JLabel(icon10);
							 getContentPane().add(i10);
						 }
						 
						 
						 if ( choice.equals("Special_Power"))//if the computer wants to use special power
						 {
							 System.out.println("You decided to block ");
							 System.out.println("The computer decided to use special power ");	
							 ComputerChoice.setText("You decided to block | The computer decided to use special power ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon11 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_block.png");
							 JLabel i11 = new JLabel(icon11);
							 getContentPane().add(i11);
							 
							 Icon icon12 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_SP.png");
							 JLabel i12 = new JLabel(icon12);
							 getContentPane().add(i12);
						 }
					 }
			  
			  // if the user wants to use special power

					 if (ev.getSource() == Wand3)
					 {
				  // Computer choice
				  
						 for (int i = 0 ; i < nb.length ; i++)
							 t.add( new String (nb[i]));
						 {
							 Collections.shuffle(t);
							 choice = t.get(1) ;
						 }
				  
				   // Result
				 
						 if ( choice.equals("Attack"))//if the computer wants to attack
						 {
							 System.out.println("You decided to use special power ");
							 System.out.println("The computer decided to attack you ");	
							 ComputerChoice.setText("You decided to use special power | The computer decided to attack you ");
							 UTankLife = UTankLife - FAdam + SPtank;
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon13 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_SP.png");
							 JLabel i13 = new JLabel(icon13);
							 getContentPane().add(i13);
							 
							 Icon icon14 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_attack.png");
							 JLabel i14 = new JLabel(icon14);
							 getContentPane().add(i14);
						 }
						 
						 
						 if ( choice.equals("Block"))//if the computer wants to block
						 {
							 System.out.println("You decided to use special power ");
							 System.out.println("The computer decided to block ");	
							 ComputerChoice.setText("You decided to use special power | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon15 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_SP.png");
							 JLabel i15 = new JLabel(icon15);
							 getContentPane().add(i15);
							 
							 Icon icon16 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_block.png");
							 JLabel i16 = new JLabel(icon16);
							 getContentPane().add(i16);
						 }
						 
						 
						 if ( choice.equals("Special_Power"))//if the computer wants to use special power
						 {
							 System.out.println("You decided to use special power "); //console text
							 System.out.println("The computer decided to use special power ");	//console text
							 ComputerChoice.setText("You decided to use special power | The computer decided to use special power "); //frame text
							 UTankLife = UTankLife + SPtank; //the user earns life's points
							 CDamLife = CDamLife + SPdam; //the computer earns life's points
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife); //result on console
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife ); //score on the frame
							 
							 Icon icon17 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_SP.png"); //picture
							 JLabel i17 = new JLabel(icon17); //new label to insert the picture
							 getContentPane().add(i17); //get the picture to add on the frame
							 
							 Icon icon18 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_SP.png"); //picture
							 JLabel i18 = new JLabel(icon18);
							 getContentPane().add(i18);
						 }    
					 }
			 
			 
			 
		 // If the user looses print this message
		 if (UDamLife <= 0 || UHealerLife <= 0 || UTankLife <= 0) //condition if the user has no more life's point
		 {
			 System.out.println("You are dead !"); //print the message on the console
			 Victory.setText(" You are dead . . . Try again !"); //print the text on the frame
			 ComputerChoice.setText("The Computer has choosen :             ");
			 result.setText(" *** SCORE *** You : " + " | Computer : " );
			 
		 }
 
		 // If the user win print this message
		 if (CDamLife <= 0 || CHealerLife <= 0 || CTankLife <= 0) //condition if the computer has no more life's points
		 {
			 System.out.println("You killed your enemy !!"); //console text
			 Victory.setText(" Good job !! You killed your enemy ! "); //frame text
		 
		 } 
	 }

	
//attributes 

public JMenuBar Menu; //create a bar menu on the frame
 public JMenu New; //create the button menu
 public JMenuItem newGame, leveldecided, Hero; //the different choice inside the menu
 public JRadioButton level1, level2, level3; //different buttons level
 public JButton Damager1, Healer1, Tank1; //different button associate to image in the MenuItem "hero"
 public JButton Sword, Sword2, Sword3, Shield, Shield2, Shield3, Wand, Wand2, Wand3; //different buttons used on the main frame
 public JLabel Intro1, Intro2, Intro3, Intro4, Intro5, Intro6, Intro7, Intro8, result, Victory, ComputerChoice, levels, choiceHero, choiceIA; //label to see text on the frame
 int UDamLife = 12, UHealerLife = 16, UTankLife = 20, CDamLife = 12, CHealerLife = 16, CTankLife = 20, FAdam = 2, FAhealer = 1 , FAtank = 1, SPdam = 1, SPhealer = 2, SPtank = 1, Block = 1; //parameters of the different character's characteristics 
 Object choice; //created the choice of the computer as an object
 String nb[] = {"Attack", "Block", "Special_Power", "Attack", "Block", "Special_Power"}; //create a string inside the arraylist to know what the computer has to choose
 ArrayList t = new ArrayList();//creating the arraylist 't'
 String vict; 
}

//main class named Game

public class Game 
{
 public static void main(String args[]){	 	
	 
	    Fen1 fen = new Fen1() ;	    //constructor to create 'fen' on the modele Fen1
	    fen.setVisible(true); //to see the frame named 'fen'
	    fen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //to close the frame 'fen'
  
 }
}