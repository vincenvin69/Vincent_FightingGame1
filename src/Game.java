package FG;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;



class Fen1 extends JFrame implements ActionListener
{
 public Fen1()
 {
	// We give the characteristics of the frame
	 
  setTitle(" ----------FIGHTING GAME---------- "); 
  setSize (1800,400); 
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
  
  Hero = new JMenuItem("Hero");
  New.add(Hero);
  Hero.addActionListener(this);
  
  	//The last feature to choose the enemy
  
  IA = new JMenuItem("IA");
  New.add(IA);
  IA.addActionListener(this);
  
  	//Text which explains the game 
  
  Intro1 = new JLabel();
  Intro2 = new JLabel();
  Intro3 = new JLabel();
  Intro7 = new JLabel();
  Intro8 = new JLabel();
  contents.add(Intro1);
  contents.add(Intro2);
  contents.add(Intro3);
  contents.add(Intro7);
  contents.add(Intro8);
  Intro1.setText("This is a fighting Game. When you no longer have life you are dead.\n");
  Intro2.setText("Choose your hero, your enemy and the level of your enemy.\n");
  Intro3.setText("You have 3 possibilities : - Damager : life's points = 3 | Attack = 2 | Recovers one life point.\n");
  Intro7.setText("- Healer : life's points = 4 | Attack = 1 | Power : Recovers two life's points.\n");
  Intro8.setText("- Tank : life's points = 5 | Attack = 1 | Power : Recovers one life point                                                                       ");
  //Creation of 3 buttons Sword, Shield and Wand 
  
  //We use addactionListener to take into account the choice of user
  Intro4 = new JLabel();
  contents.add(Intro4);
  Intro4.setText("You play with Damager against Healer \n");
  
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
  Intro5.setText("You play with Healer against Tank \n");
  
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
  Intro6.setText("You play with Tank against Damager \n");
  
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
  result = new JLabel(" *** SCORE *** You : " + UDamLife + " | Computer : " + CDamLife );
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
   setTitle(" *** Choose your Hero *** ");
   setSize (400,200);
   Container contenu = getContentPane();
   contenu.setLayout(new FlowLayout());
   ButtonGroup groupe = new ButtonGroup();
   //Text written in this frame
   choiceHero = new JLabel();
   contenu.add(choiceHero);
   choiceHero.setText("     You can choose your hero at the beginning                    ");
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

  }
  
  //Method creation to recover choice of the user and to initialize the different possibilities

  public void actionPerformed(ActionEvent ev){

 	}
 }
 
 
 //Creation of the last frame, which allows you to choose your enemy
 
 class Fen4 extends JFrame implements ActionListener
 {
  public Fen4()
  {
	  //Parameters oh the frame
   setTitle(" *** Choose your enemy *** ");
   setSize (400,200);
   Container contenu = getContentPane();
   contenu.setLayout(new FlowLayout());
   ButtonGroup groupe = new ButtonGroup();
   //Label in the frame
   choiceIA = new JLabel();
   contenu.add(choiceIA);
   choiceIA.setText("     You can choose your enemy at the beginnig     ");
   //Button with pictures of characters
   //First Enemy
   Damager2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/damager.jpeg"));
   groupe.add(Damager2);
   contenu.add(Damager2);
   Damager2.addActionListener(this);
   //Second Enemy
   Healer2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/healer.jpeg"));
   groupe.add(Healer2);
   contenu.add(Healer2);
   Healer2.addActionListener(this);
   //Third Enemy
   Tank2 = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Image_solo/tank.jpeg"));
   groupe.add(Tank2);
   contenu.add(Tank2);
   Tank2.addActionListener(this);

  }
  
  //Method creation to recover choice of the user and to initialize the different possibilities

  public void actionPerformed(ActionEvent ev)
 	{
	
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

	 
	 if (ev.getSource() == IA)	 
	 { 
		 vict = ""; 
		 Fen4 fen4 = new Fen4();
		 fen4.setVisible(true);
		 fen4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 }
	 vict = Victory.getText();

	 
	 //Condition if you begin a new game
	 if (ev.getSource() == newGame)
	 {
		 //Everything is reset
		 Victory.setText("");
		 vict = Victory.getText();
		 ComputerChoice.setText("The computer has choosen :         ");
		 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CDamLife);
		 
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
				 }
	   
				 
				 if ( choice.equals("Block"))
				 {
					 System.out.println("You decided to attack ");
					 System.out.println("The computer decided to block " );	
					 ComputerChoice.setText("You decided to attack | The computer decided to block " );
					 CHealerLife = CHealerLife - Block;
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
				 }


				 if ( choice.equals("Special_Power"))
				 {
					 System.out.println("You decided to attack ");
					 System.out.println("The computer decided to use special power ");
					 ComputerChoice.setText("You decided to attack | The computer decided to use special power ");
					 CHealerLife = CHealerLife - FAdam + SPhealer ;
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
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
				 }
				 
				 
				 if ( choice.equals("Block"))
				 {
					 System.out.println("You decided to block ");
					 System.out.println("The computer decided to block ");	
					 ComputerChoice.setText("You decided to block | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife);
				 }
				 
				 
				 if ( choice.equals("Special_Power"))
				 {
					 System.out.println("You decided to block ");
					 System.out.println("The computer decided to use special power ");	
					 ComputerChoice.setText("You decided to block | The computer decided to use special power ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife );
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
				 }
				 
				 
				 if ( choice.equals("Block"))
				 {
					 System.out.println("You decided to use special power ");
					 System.out.println("The computer decided to block ");	
					 ComputerChoice.setText("You decided to use special power | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
					 System.out.println("You : " + UDamLife + " | Computer : " + CHealerLife);
					 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CHealerLife);
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
					 }
		   
					 
					 if ( choice.equals("Block"))
					 {
						 System.out.println("You decided to attack ");
						 System.out.println("The computer decided to block " );	
						 ComputerChoice.setText("You decided to attack | The computer decided to block " );
						 CTankLife = CTankLife - Block;
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
					 }
					 

					 if ( choice.equals("Special_Power"))
					 {
						 System.out.println("You decided to attack ");
						 System.out.println("The computer decided to use special power ");
						 ComputerChoice.setText("You decided to attack | The computer decided to use special power ");
						 CTankLife = CTankLife - FAhealer + SPtank ;
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
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
					 }
					 
					 
					 if ( choice.equals("Block"))
					 {
						 System.out.println("You decided to block ");
						 System.out.println("The computer decided to block ");	
						 ComputerChoice.setText("You decided to block | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
					 }
					 
					 
					 if ( choice.equals("Special_Power"))
					 {
						 System.out.println("You decided to block ");
						 System.out.println("The computer decided to use special power ");	
						 ComputerChoice.setText("You decided to block | The computer decided to use special power ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
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
					 }
					 
					 
					 if ( choice.equals("Block"))
					 {
						 System.out.println("You decided to use special power ");
						 System.out.println("The computer decided to block ");	
						 ComputerChoice.setText("You decided to use special power | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
						 System.out.println("You : " + UHealerLife + " | Computer : " + CTankLife);
						 result.setText(" *** SCORE *** You : " + UHealerLife + " | Computer : " + CTankLife );
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
						 }
			   
						 
						 if ( choice.equals("Block"))
						 {
							 System.out.println("You decided to attack ");
							 System.out.println("The computer decided to block " );	
							 ComputerChoice.setText("You decided to attack | The computer decided to block " );
							 CDamLife = CDamLife - Block;
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
						 }
						 

						 if ( choice.equals("Special_Power"))
						 {
							 System.out.println("You decided to attack ");
							 System.out.println("The computer decided to use special power ");
							 ComputerChoice.setText("You decided to attack | The computer decided to use special power ");
							 CDamLife = CDamLife - FAtank + SPdam ;
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
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
						 }
						 
						 
						 if ( choice.equals("Block"))
						 {
							 System.out.println("You decided to block ");
							 System.out.println("The computer decided to block ");	
							 ComputerChoice.setText("You decided to block | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
						 }
						 
						 
						 if ( choice.equals("Special_Power"))
						 {
							 System.out.println("You decided to block ");
							 System.out.println("The computer decided to use special power ");	
							 ComputerChoice.setText("You decided to block | The computer decided to use special power ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
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
						 }
						 
						 
						 if ( choice.equals("Block"))
						 {
							 System.out.println("You decided to use special power ");
							 System.out.println("The computer decided to block ");	
							 ComputerChoice.setText("You decided to use special power | The computer decided to block ------>  IMPOSSIBLE, the computer has to attack you. Nothing happened.");
							 System.out.println("You : " + UTankLife + " | Computer : " + CDamLife);
							 result.setText(" *** SCORE *** You : " + UTankLife + " | Computer : " + CDamLife );
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
						 }    
					 }
			 
			 
			 
		 // If the user looses print this message
		 if (UDamLife <= 0 || UHealerLife <= 0 || UTankLife <= 0)
		 {
			 System.out.println("You are dead !");
			 Victory.setText(" Lost . . . Try again !");
			 ComputerChoice.setText("The Computer has choosen :             ");
			 result.setText(" *** SCORE *** You : " + UDamLife + " | Computer : " + CDamLife);
			 
		 }
 
		 // If the user win print this message
		 if (CDamLife <= 0 || CHealerLife <= 0 || CTankLife <= 0)
		 {
			 System.out.println("You killed your enemy !!");
			 Victory.setText(" WELL DONE  ! ! You won ! ");
		
		 } 
	 }
 
 	



 public JMenuBar Menu;
 public JMenu New;
 public JMenuItem newGame, leveldecided, Hero, IA;
 public JRadioButton level1, level2, level3;
 public JButton Damager1, Healer1, Tank1;
 public JButton Damager2, Healer2, Tank2;
 public JButton valide;
 public JButton Sword, Sword2, Sword3, Shield, Shield2, Shield3, Wand, Wand2, Wand3;
 public JLabel Intro1, Intro2, Intro3, Intro4, Intro5, Intro6, Intro7, Intro8, result, Victory, ComputerChoice, levels, choiceHero, choiceIA;
 int UDamLife = 12, UHealerLife = 16, UTankLife = 20, CDamLife = 12, CHealerLife = 16, CTankLife = 20, FAdam = 2, FAhealer = 1 , FAtank = 1, SPdam = 1, SPhealer = 2, SPtank = 1, Block = 1;
 Object choice;
 String PlayerChoice = "" ,CharacterChoosen , WIN;
 String nb[] = {"Attack", "Block", "Special_Power", "Attack", "Block", "Special_Power"};
 ArrayList t = new ArrayList();
 String vict;
}


public class Game 
{
 public static void main(String args[])
 {
  Fen1 fen = new Fen1() ;
  fen.setVisible(true);
  fen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 }
}