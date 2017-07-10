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
	 
	 
  setTitle(" ----------FIGHTING GAME---------- "); 
  setSize (1100,1400); 
  Container contents = getContentPane();
  contents.setLayout(new FlowLayout());

  
  	// Creation of a menu inside the frame named "option" with several features
  
  Menu = new JMenuBar();
  setJMenuBar(Menu);
  New = new JMenu("Options");
  Menu.add(New);
  
  	//First feature to begin again the game
  
  newGame = new JMenuItem("Begin again");
  New.add(newGame);
  newGame.addActionListener(this);
  
  	//Second feature to choose level
  
  leveldecided = new JMenuItem("Levels");
  New.add(leveldecided);
  leveldecided.addActionListener(this);
  
  	//Third feature to choose the hero
  
  Hero = new JMenuItem("Characters");
  New.add(Hero);
  Hero.addActionListener(this);

  
  	//Text which explains the game 
  
  Intro1 = new JLabel();
  Intro2 = new JLabel();

  contents.add(Intro1);
  contents.add(Intro2);
 
  Intro1.setText("This is a fighting Game. When you no longer have life you are dead.\n");
  Intro2.setText("Choose the game that you want. You have the character's description on the option button.\n");
  
  
  //Creation of 3 buttons Sword, Shield and Wand 
  
  //We use addactionListener to take into account the choice of user
  Intro4 = new JLabel();
  contents.add(Intro4);
  Intro4.setText("You : Damager   vs   Computer : Healer \n");
  
  //First button : Sword which allows the enemy and you to attack
  Sword = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Epee.jpeg"));
  contents.add(Sword);
  Sword.addActionListener(this);
  
  //Second button : Shield which allows the enemy and you to block
  Shield = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Bouclier.jpeg"));
  contents.add(Shield);
  Shield.addActionListener(this);
 
  //Last button : Wand which allows the enemy and you to use special power
  Wand = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/baguette.jpeg"));
  contents.add(Wand);
  Wand.addActionListener(this);

  
  Intro5 = new JLabel();
  contents.add(Intro5);
  Intro5.setText("You : Healer   vs   Computer : Tank \n");
  
  Sword2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Epee.jpeg"));
  contents.add(Sword2);
  Sword2.addActionListener(this);
  
  //Second button : Shield which allows the enemy and you to block
  Shield2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/Bouclier.jpeg"));
  contents.add(Shield2);
  Shield2.addActionListener(this);
 
  //Last button : Wand which allows the enemy and you to use special power
  Wand2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Power/baguette.jpeg"));
  contents.add(Wand2);
  Wand2.addActionListener(this);
  
  
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
  
  
  ComputerChoice = new JLabel("The computer has choosen :          ");
  contents.add(ComputerChoice);
  result = new JLabel(" *** SCORE *** You : " + " | Computer : " );
  contents.add(result);
  Victory = new JLabel ("");
  contents.add(Victory);

 }
 
 
 //Creation of a frame, less important which allows you to choose the level of your enemy
 
 class Fen2 extends JFrame implements ActionListener
 {
  public Fen2()
  {
	  
	  //Parameters of the frame
   setTitle(" *** The different levels *** "); //Name of the frame
   setSize (400,200); //Size of the frame
   Container contents = getContentPane(); 
   contents.setLayout(new FlowLayout());
   ButtonGroup groupe = new ButtonGroup();
   //Initialization of buttons
   levels = new JLabel();
   contents.add(levels);
   levels.setText("Which level do you want to choose for your enemy ?");
   //First button level 
   level1 = new JRadioButton("Level 1",true);
   groupe.add(level1);
   contents.add(level1);
   level1.addActionListener(this);
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
   Damager1 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/damager.jpeg"));
   groupe.add(Damager1);
   contenu.add(Damager1);
   Damager1.addActionListener(this);
   //Second choice
   Healer1 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/healer.jpeg"));
   groupe.add(Healer1);
   contenu.add(Healer1);
   Healer1.addActionListener(this);
   //Third choice
   Tank1 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/tank.jpeg"));
   groupe.add(Tank1);
   contenu.add(Tank1);
   Tank1.addActionListener(this);
   Intro3 = new JLabel();
   Intro7 = new JLabel();
   Intro8 = new JLabel();
   Container contents = getContentPane();
   contents.add(Intro3);
   contents.add(Intro7);
   contents.add(Intro8);
   Intro3.setText("- Damager : life's points = 12 | Attack = 2 | Power : recovers one life point.\n");
   Intro7.setText("- Healer : life's points = 16 | Attack = 1 | Power : recovers two life's points.\n");
   Intro8.setText("- Tank : life's points = 20 | Attack = 1 | Power : recovers one life point.");
  }
  
  //Method creation to recover choice of the user and to initialize the different possibilities

  public void actionPerformed(ActionEvent ev){

 	}
 }
 

 
 
 
 
 
 public void actionPerformed(ActionEvent ev)	 
 {
	 if (ev.getSource() == leveldecided)	 
	 { 
		 vict = ""; 
		 Fen2 fen2 = new Fen2();
		 fen2.setVisible(true);
		 fen2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 }
	 vict = Victory.getText();

	 
	 if (ev.getSource() == Hero)	 
	 { 
		 vict = ""; 
		 Fen3 fen3 = new Fen3();
		 fen3.setVisible(true);
		 fen3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 }
	 vict = Victory.getText();

	 

	 
	 //Condition if you begin a new game
	 if (ev.getSource() == newGame)
	 {
		 //Everything is reset
		 Victory.setText("");
		 vict = Victory.getText();
		 ComputerChoice.setText("The computer has choosen :         ");
		 result.setText(" *** SCORE *** You : " + " | Computer : ");
		 
	 }


//Game where you are Damager and the computer is Healer
	
		 if (ev.getSource() == Sword)
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
	   
				 if ( choice.equals("Attack"))
				 {
					 System.out.println("You decided to attack ");
					 System.out.println("The computer decided to attack ");	
					 ComputerChoice.setText("You decided to attack | The computer decided to attack " );
					 UDamLife = UDamLife - FAhealer ;
					 CHealerLife = CHealerLife - FAdam;
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 ComputerChoice.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon1 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_attack.png");
					 JLabel i1 = new JLabel(icon1);
					 getContentPane().add(i1);
					 
					 Icon icon2 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_attack.png");
					 JLabel i2 = new JLabel(icon2);
					 getContentPane().add(i2);
				 }
	   
				 
				 if ( choice.equals("Block"))
				 {
					 System.out.println("You decided to attack ");
					 System.out.println("The computer decided to block " );	
					 ComputerChoice.setText("You decided to attack | The computer decided to block " );
					 CHealerLife = CHealerLife - Block;
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon3 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_attack.png");
					 JLabel i3 = new JLabel(icon3);
					 getContentPane().add(i3);
					 
					 Icon icon4 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_block.png");
					 JLabel i4 = new JLabel(icon4);
					 getContentPane().add(i4);
				 }


				 if ( choice.equals("Special_Power"))
				 {
					 System.out.println("You decided to attack ");
					 System.out.println("The computer decided to use special power ");
					 ComputerChoice.setText("You decided to attack | The computer decided to use special power ");
					 CHealerLife = CHealerLife - FAdam + SPhealer ;
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon5 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_attack.png");
					 JLabel i5 = new JLabel(icon5);
					 getContentPane().add(i5);
					 
					 Icon icon6 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_SP.png");
					 JLabel i6 = new JLabel(icon6);
					 getContentPane().add(i6);
					 
				 }
			 }


	  // You choose to block

			 if (ev.getSource() == Shield)
			 {
				 
	  	  // Computer choice
				 for (int i = 0 ; i < nb.length ; i++)
					 t.add( new String(nb[i]));
				 {
					 Collections.shuffle(t);
					 choice = t.get(1) ;
				 }

		   // Result
		   
				 if (choice.equals("Attack"))
				 {
					 System.out.println("You decided to block ");
					 System.out.println("The computer decided to attack ");	
					 ComputerChoice.setText("You decided to block | The computer decided to attack ");
					 UDamLife = UDamLife - Block;	  
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon7 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_block.png");
					 JLabel i7 = new JLabel(icon7);
					 getContentPane().add(i7);
					 
					 Icon icon8 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_attack.png");
					 JLabel i8 = new JLabel(icon8);
					 getContentPane().add(i8);
					 
				 }
				 
				 
				 if ( choice.equals("Block"))
				 {
					 System.out.println("You decided to block ");
					 System.out.println("The computer decided to block ");	
					 ComputerChoice.setText("You decided to block | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife);
					 
					 Icon icon9 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_block.png");
					 JLabel i9 = new JLabel(icon9);
					 getContentPane().add(i9);
					 
					 Icon icon10 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_block.png");
					 JLabel i10 = new JLabel(icon10);
					 getContentPane().add(i10);
				 }
				 
				 
				 if ( choice.equals("Special_Power"))
				 {
					 System.out.println("You decided to block ");
					 System.out.println("The computer decided to use special power ");
					 ComputerChoice.setText("You decided to block | The computer decided to use special power ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon11 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_block.png");
					 JLabel i11 = new JLabel(icon11);
					 getContentPane().add(i11);
					 
					 Icon icon12 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_SP.png");
					 JLabel i12 = new JLabel(icon12);
					 getContentPane().add(i12);
				 }
			 }
	  
	  // choix joueur Ciseau

			 if (ev.getSource() == Wand)
			 {
		  // choix ordinateur
		  
				 for (int i = 0 ; i < nb.length ; i++)
					 t.add( new String (nb[i]));
				 {
					 Collections.shuffle(t);
					 choice = t.get(1) ;
				 }
		  
		   // resultat
		 
				 if ( choice.equals("Attack"))
				 {
					 System.out.println("You decided to use special power ");
					 System.out.println("The computer decided to attack you ");	
					 ComputerChoice.setText("You decided to use special power | The computer decided to attack you ");
					 UDamLife = UDamLife + SPdam - FAhealer ;	  
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon13 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_SP.png");
					 JLabel i13 = new JLabel(icon13);
					 getContentPane().add(i13);
					 
					 Icon icon14 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_attack.png");
					 JLabel i14 = new JLabel(icon14);
					 getContentPane().add(i14);
				 }
				 
				 
				 if ( choice.equals("Block"))
				 {
					 System.out.println("You decided to use special power ");
					 System.out.println("The computer decided to block ");	
					 ComputerChoice.setText("You decided to use special power | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife);
					 
					 Icon icon15 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_SP.png");
					 JLabel i15 = new JLabel(icon15);
					 getContentPane().add(i15);
					 
					 Icon icon16 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_block.png");
					 JLabel i16 = new JLabel(icon16);
					 getContentPane().add(i16);
					 
				 }
				 
				 
				 if ( choice.equals("Special_Power"))
				 {
					 System.out.println("You decided to use special power ");
					 System.out.println("The computer decided to use special power ");	
					 ComputerChoice.setText("You decided to use special power | The computer decided to use special power ");
					 UDamLife = UDamLife + SPdam;
					 CHealerLife = CHealerLife + SPhealer;
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
					 
					 Icon icon17 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Gauche/damager_SP.png");
					 JLabel i17 = new JLabel(icon17);
					 getContentPane().add(i17);
					 
					 Icon icon18 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Healer/Droite/healer_SP.png");
					 JLabel i18 = new JLabel(icon18);
					 getContentPane().add(i18);
					 
				 }    
			 }
		 
		 
//Game where you are Healer and the computer is Tank
			 
			 if (ev.getSource() == Sword2)
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
		   
					 if ( choice.equals("Attack"))
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
		   
					 
					 if ( choice.equals("Block"))
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
					 

					 if ( choice.equals("Special_Power"))
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
		  
				 if (ev.getSource() == Shield2)
				 {
					 
		  	  // Computer choice
					 for (int i = 0 ; i < nb.length ; i++)
						 t.add( new String(nb[i]));
					 {
						 Collections.shuffle(t);
						 choice = t.get(1) ;
					 }

			   // Result
			   
					 if (choice.equals("Attack"))
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
					 
					 
					 if ( choice.equals("Block"))
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
					 
					 
					 if ( choice.equals("Special_Power"))
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
		  
		  // choix joueur Ciseau

				 if (ev.getSource() == Wand2)
				 {
			  // choix ordinateur
			  
					 for (int i = 0 ; i < nb.length ; i++)
						 t.add( new String (nb[i]));
					 {
						 Collections.shuffle(t);
						 choice = t.get(1) ;
					 }
			  
			   // resultat
			 
					 if ( choice.equals("Attack"))
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
					 
					 
					 if ( choice.equals("Block"))
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
					 
					 
					 if ( choice.equals("Special_Power"))
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
				 
				 if (ev.getSource() == Sword3)
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
			   
						 if ( choice.equals("Attack"))
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
			   
						 
						 if ( choice.equals("Block"))
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
						 

						 if ( choice.equals("Special_Power"))
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
				   
						 if (choice.equals("Attack"))
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
						 
						 
						 if ( choice.equals("Block"))
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
						 
						 
						 if ( choice.equals("Special_Power"))
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
			  
			  // choix joueur Ciseau

					 if (ev.getSource() == Wand3)
					 {
				  // choix ordinateur
				  
						 for (int i = 0 ; i < nb.length ; i++)
							 t.add( new String (nb[i]));
						 {
							 Collections.shuffle(t);
							 choice = t.get(1) ;
						 }
				  
				   // resultat
				 
						 if ( choice.equals("Attack"))
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
						 
						 
						 if ( choice.equals("Block"))
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
						 
						 
						 if ( choice.equals("Special_Power"))
						 {
							 System.out.println("You decided to use special power ");
							 System.out.println("The computer decided to use special power ");	
							 ComputerChoice.setText("You decided to use special power | The computer decided to use special power ");
							 UTankLife = UTankLife + SPtank;
							 CDamLife = CDamLife + SPdam;
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
							 
							 Icon icon17 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Tank/Gauche/tank_SP.png");
							 JLabel i17 = new JLabel(icon17);
							 getContentPane().add(i17);
							 
							 Icon icon18 = new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_player/Damager/Droite/damager_SP.png");
							 JLabel i18 = new JLabel(icon18);
							 getContentPane().add(i18);
						 }    
					 }
			 
			 
			 
		 // If the user looses print this message
		 if (UDamLife <= 0 || UHealerLife <= 0 || UTankLife <= 0)
		 {
			 System.out.println("You are dead !");
			 Victory.setText(" You are dead . . . Try again !");
			 ComputerChoice.setText("The Computer has choosen :             ");
			 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CDamLife);
			 
		 }
 
		 // If the user win print this message
		 if (CDamLife <= 0 || CHealerLife <= 0 || CTankLife <= 0)
		 {
			 System.out.println("You killed your enemy !!");
			 Victory.setText(" Good job !! You killed your enemy ! ");
		
		 } 
	 }

	
	

public JMenuBar Menu;
 public JMenu New;
 public JMenuItem newGame, leveldecided, Hero;
 public JRadioButton level1, level2, level3;
 public JButton Damager1, Healer1, Tank1;
 public JButton Damager2, Healer2, Tank2;
 public JButton valide;
 public JButton Sword, Sword2, Sword3, Shield, Shield2, Shield3, Wand, Wand2, Wand3;
 public JLabel Intro1, Intro2, Intro3, Intro4, Intro5, Intro6, Intro7, Intro8, result, Victory, ComputerChoice, levels, choiceHero, choiceIA;
 int UDamLife = 12, UHealerLife = 16, UTankLife = 20, CDamLife = 12, CHealerLife = 16, CTankLife = 20, FAdam = 2, FAhealer = 1 , FAtank = 1, SPdam = 1, SPhealer = 2, SPtank = 1, Block = 1;
 public ImageIcon I1, I2, I3;
 Object choice;
 String PlayerChoice = "" ,CharacterChoosen , WIN;
 String nb[] = {"Attack", "Block", "Special_Power", "Attack", "Block", "Special_Power"};
 ArrayList t = new ArrayList();
 String vict;
}


public class Game 
{
 public static void main(String args[]){	 	
	 
	    Fen1 fen = new Fen1() ;	    
	    fen.setVisible(true);
	    fen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  
 }
}