import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen1 extends JFrame implements ActionListener
{
 public Fen1()
 {
  setTitle(" *** Fighting Game *** ");
  setSize (450,250);
  Container contenu = getContentPane();
  contenu.setLayout(new FlowLayout());
  Menu = new JMenuBar();
  setJMenuBar(Menu);
  New = new JMenu("Options");
  Menu.add(New);
  newGame = new JMenuItem("Begin again");
  New.add(newGame);
  newGame.addActionListener(this);
  
  leveldecided = new JMenuItem("Levels");
  New.add(leveldecided);
  leveldecided.addActionListener(this);
  
  Hero = new JMenuItem("Hero");
  New.add(Hero);
  Hero.addActionListener(this);
  
  IA = new JMenuItem("IA");
  New.add(IA);
  IA.addActionListener(this);
  
  Intro = new JLabel();
  contenu.add(Intro);
  Intro.setText("This is a fighting Game. When you don't have any points anymore you are dead.Choose your hero, your enemy and the level of your enemy.\n You have 3 possibilities : \n- Damager : life's points = 3 | Attack = 2 | Power : Inflicts damage received\n- Healer : life's points = 4 | Attack = 1 | Power : Recovers two life's points\n- Tank : life's points = 5 | Attack = 1 | Power : Inflicts 1 damage more then 2 damages but loose 1 life's point");
 
  Epee = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Epee.jpeg"));
  contenu.add(Epee);
  Epee.addActionListener(this);
  
  Bouclier = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/Bouclier.jpeg"));
  contenu.add(Bouclier);
  Bouclier.addActionListener(this);
 
  Baguette = new JButton(new ImageIcon("C:/Users/vince/Documents/EXIA/PROJETS/Projet JAVA rattrapages/IMG/baguette.jpeg"));
  contenu.add(Baguette);
  Baguette.addActionListener(this);

 ComputerChoice = new JLabel("The computer has choosen :          ");
  contenu.add(ComputerChoice);
  result = new JLabel(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
  contenu.add(result);
  Victory = new JLabel ("");
  contenu.add(Victory);
 }
 
 
 class Fen2 extends JFrame implements ActionListener
 {
  public Fen2()
  {
   setTitle(" *** The different levels *** ");
   setSize (400,200);
   Container contenu = getContentPane();
   contenu.setLayout(new FlowLayout());
   ButtonGroup groupe = new ButtonGroup();
   levels = new JLabel();
   contenu.add(levels);
   levels.setText("Which level do you want to choose for your enemy ?");
  
   level1 = new JRadioButton("Level 1",true);
   groupe.add(level1);
   contenu.add(level1);
   level1.addActionListener(this);
   
   level2 = new JRadioButton("Level 2");
   groupe.add(level2);
   contenu.add(level2);
   level2.addActionListener(this);
   
   level3 = new JRadioButton("Level 3");
   groupe.add(level3);
   contenu.add(level3);
   level3.addActionListener(this);
   
   valide = new JButton("Validate");
   contenu.add(valide);
   valide.addActionListener(this); 
  }
  public void actionPerformed(ActionEvent ev)
 	{
 	 if (ev.getSource() == valide)
 	   {
 		 NumberofPoints = ("State : "+ level1.isSelected()+" "+level2.isSelected()+" "+
 		  level3.isSelected());	
 	      System.out.print(NumberofPoints);
 	      
 	    	while (NumberofPoints.equals("State : true false false false"))
 	    	{ 
 	    	  POINTS = 3;
	    	  System.out.println("Points number = " + POINTS);
	    	  Victory.setText("");
	    	  vict = Victory.getText();
	    	  ComputerChoice.setText("The computer has choosen :         ");
	    	  WonPoints = 0;
	    	  LostPoints = 0 ;
	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	    	while (NumberofPoints.equals("State : false true false false"))
 	    	{ 
 	    	 POINTS = 5;
	    	 System.out.println("Points number = " + POINTS);
	    	 Victory.setText("");
	    	 vict = Victory.getText();
	    	 Victory.setText("The computer has choosen :         ");
	    	 WonPoints = 0;
	    	 LostPoints = 0 ;
	    	 result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	 this.setVisible(false);
 	    	 break;
 	    	}
 	    	while (NumberofPoints.equals("State : false false true false"))
 	    	{ 
 	    	  POINTS = 10;
	    	  System.out.println("Points number = " + POINTS);
	    	  Victory.setText("");
	    	  vict = Victory.getText();
	    	  ComputerChoice.setText("The computer has choosen :         ");
	    	  WonPoints = 0;
	    	  LostPoints = 0 ;
	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	    	while (NumberofPoints.equals("State : false false false true"))
 	    	{ 
 	    	  POINTS = 15;
 	    	  System.out.println("Points number = " + POINTS);
 	    	 Victory.setText("");
 	    	  vict = Victory.getText();
 	    	  ComputerChoice.setText("The computer has choosen :         ");
 	    	  WonPoints = 0;
 	    	  LostPoints = 0 ;
 	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	   }
 	}
 }
 
 
 
 class Fen3 extends JFrame implements ActionListener
 {
  public Fen3()
  {
   setTitle(" *** Choose your Hero *** ");
   setSize (400,200);
   Container contenu = getContentPane();
   contenu.setLayout(new FlowLayout());
   ButtonGroup groupe = new ButtonGroup();
   choiceHero = new JLabel();
   contenu.add(choiceHero);
   choiceHero.setText("     Which Hero do you want to play with ?     ");
  
   Damager1 = new JRadioButton("Damager",true);
   groupe.add(Damager1);
   contenu.add(Damager1);
   Damager1.addActionListener(this);
   
   Healer1 = new JRadioButton("Healer");
   groupe.add(Healer1);
   contenu.add(Healer1);
   Healer1.addActionListener(this);
   
   Tank1 = new JRadioButton("Tank");
   groupe.add(Tank1);
   contenu.add(Tank1);
   Tank1.addActionListener(this);
   
   valide = new JButton("Validate");
   contenu.add(valide);
   valide.addActionListener(this); 
  }
  public void actionPerformed(ActionEvent ev)
 	{
 	 if (ev.getSource() == valide)
 	   {
 		 NumberofPoints = ("State : "+ Damager1.isSelected()+" "+ Healer1.isSelected()+" "+
 		  Tank1.isSelected());	
 	      System.out.print(NumberofPoints);
 	      
 	    	while (NumberofPoints.equals("State : true false false false"))
 	    	{ 
 	    	  POINTS = 3;
	    	  System.out.println("Points number = " + POINTS);
	    	  Victory.setText("");
	    	  vict = Victory.getText();
	    	  ComputerChoice.setText("The computer has choosen :         ");
	    	  WonPoints = 0;
	    	  LostPoints = 0 ;
	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	    	while (NumberofPoints.equals("State : false true false false"))
 	    	{ 
 	    	 POINTS = 5;
	    	 System.out.println("Points number = " + POINTS);
	    	 Victory.setText("");
	    	 vict = Victory.getText();
	    	 Victory.setText("The computer has choosen :         ");
	    	 WonPoints = 0;
	    	 LostPoints = 0 ;
	    	 result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	 this.setVisible(false);
 	    	 break;
 	    	}
 	    	while (NumberofPoints.equals("State : false false true false"))
 	    	{ 
 	    	  POINTS = 10;
	    	  System.out.println("Points number = " + POINTS);
	    	  Victory.setText("");
	    	  vict = Victory.getText();
	    	  ComputerChoice.setText("The computer has choosen :         ");
	    	  WonPoints = 0;
	    	  LostPoints = 0 ;
	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	    	while (NumberofPoints.equals("State : false false false true"))
 	    	{ 
 	    	  POINTS = 15;
 	    	  System.out.println("Points number = " + POINTS);
 	    	 Victory.setText("");
 	    	  vict = Victory.getText();
 	    	  ComputerChoice.setText("The computer has choosen :         ");
 	    	  WonPoints = 0;
 	    	  LostPoints = 0 ;
 	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	   }
 	}
 }
 
 
 
 class Fen4 extends JFrame implements ActionListener
 {
  public Fen4()
  {
   setTitle(" *** Choose your enemy *** ");
   setSize (400,200);
   Container contenu = getContentPane();
   contenu.setLayout(new FlowLayout());
   ButtonGroup groupe = new ButtonGroup();
   choiceIA = new JLabel();
   contenu.add(choiceIA);
   choiceIA.setText("     Which enemy do you want to play against ?     ");
  
   Damager2 = new JRadioButton("Damager",true);
   groupe.add(Damager2);
   contenu.add(Damager2);
   Damager2.addActionListener(this);
   
   Healer2 = new JRadioButton("Healer");
   groupe.add(Healer2);
   contenu.add(Healer2);
   Healer2.addActionListener(this);
   
   Tank2 = new JRadioButton("Tank");
   groupe.add(Tank2);
   contenu.add(Tank2);
   Tank2.addActionListener(this);
   
   valide = new JButton("Validate");
   contenu.add(valide);
   valide.addActionListener(this); 
  }
  public void actionPerformed(ActionEvent ev)
 	{
 	 if (ev.getSource() == valide)
 	   {
 		 NumberofPoints = ("State : "+ Damager2.isSelected()+" "+ Healer2.isSelected()+" "+
 		  Tank2.isSelected());	
 	      System.out.print(NumberofPoints);
 	      
 	    	while (NumberofPoints.equals("State : true false false false"))
 	    	{ 
 	    	  POINTS = 3;
	    	  System.out.println("Points number = " + POINTS);
	    	  Victory.setText("");
	    	  vict = Victory.getText();
	    	  ComputerChoice.setText("The computer has choosen :         ");
	    	  WonPoints = 0;
	    	  LostPoints = 0 ;
	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	    	while (NumberofPoints.equals("State : false true false false"))
 	    	{ 
 	    	 POINTS = 5;
	    	 System.out.println("Points number = " + POINTS);
	    	 Victory.setText("");
	    	 vict = Victory.getText();
	    	 Victory.setText("The computer has choosen :         ");
	    	 WonPoints = 0;
	    	 LostPoints = 0 ;
	    	 result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	 this.setVisible(false);
 	    	 break;
 	    	}
 	    	while (NumberofPoints.equals("State : false false true false"))
 	    	{ 
 	    	  POINTS = 10;
	    	  System.out.println("Points number = " + POINTS);
	    	  Victory.setText("");
	    	  vict = Victory.getText();
	    	  ComputerChoice.setText("The computer has choosen :         ");
	    	  WonPoints = 0;
	    	  LostPoints = 0 ;
	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	    	while (NumberofPoints.equals("State : false false false true"))
 	    	{ 
 	    	  POINTS = 15;
 	    	  System.out.println("Points number = " + POINTS);
 	    	 Victory.setText("");
 	    	  vict = Victory.getText();
 	    	  ComputerChoice.setText("The computer has choosen :         ");
 	    	  WonPoints = 0;
 	    	  LostPoints = 0 ;
 	    	  result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
 	    	  this.setVisible(false);
 	    	  break;
 	    	}
 	   }
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
  if (ev.getSource() == newGame)
  {
	  Victory.setText("");
   vict = Victory.getText();
   ComputerChoice.setText("The computer has choosen :         ");
   WonPoints = 0 ;
   LostPoints = 0 ;
   result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints);
  }
  if (vict.equals(" Well done !! You are the winner ! ") | vict.equals(" Game Over . . . Try again !!!") && ev.getSource() != leveldecided)
	   JOptionPane.showMessageDialog(null,"Choose a new game");
  else
  {	  
	  // choix joueur Pierre 
	 
  if (ev.getSource() == Epee)
  {

	  // choix ordinateur
	  
  for (int i = 0 ; i < nb.length ; i++)
    	t.add( new String (nb[i]));
   {
    Collections.shuffle(t);
    choice = t.get(1);
    System.out.println(choice);
   }
	   
   // resultat
   
   if ( choice.equals("Attack"))
   {
    System.out.println("You decided to attack ");
    System.out.println("The computer decided to attack ");	
    ComputerChoice.setText("The computer decided to attack " );
    System.out.println("Equality");
    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
    ComputerChoice.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
   }
   if ( choice.equals("Block"))
   {
    System.out.println("You decided to attack ");
    System.out.println("The computer decided to block " );	
    ComputerChoice.setText("The computer decided to block " );
    System.out.println("You loose");
    LostPoints ++;
    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
   }
   if ( choice.equals("Special_Power"))
   {
    System.out.println("You decided to attack ");
    System.out.println("The computer decided to use special power ");
    ComputerChoice.setText("The computer decided to use special power ");
    System.out.println("You win");
    WonPoints ++;
    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
   }
  } 
  
  // choix joueur Feuille
  
  if (ev.getSource() == Bouclier)
  {
  	  // choix ordinateur
	  
	  for (int i = 0 ; i < nb.length ; i++)
	    	t.add( new String(nb[i]));
	   {
	    Collections.shuffle(t);
	    choice = t.get(1) ;
	   }

	   // resultat
	   
	   if (choice.equals("Attack"))
	   {
	    System.out.println("You decided to block ");
	    System.out.println("The computer decided to attack ");	
	    ComputerChoice.setText("The computer decided to attack ");
	    System.out.println("You win");
	    WonPoints ++;	  
	    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
	    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
	   }
	   if ( choice.equals("Block"))
	   {
	    System.out.println("You decided to block ");
	    System.out.println("The computer decided to block ");	
	    ComputerChoice.setText("The computer decided to block ");
	    System.out.println("Equality");
	    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
	    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
	   }
	   if ( choice.equals("Special_Power"))
	   {
	    System.out.println("You decided to block ");
	    System.out.println("The computer decided to use special power ");	
	    ComputerChoice.setText("The computer decided to use special power ");
	    System.out.println("You loose");
	    LostPoints ++;	  
	    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
	    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
	   }
  }
  
  // choix joueur Ciseau

  if (ev.getSource() == Baguette)
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
	    ComputerChoice.setText("The computer decided to attack you ");
	    System.out.println("You loose");
	    LostPoints ++;	  
	    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
	    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
	   }
	   if ( choice.equals("Block"))
	   {
	    System.out.println("You decided to use special power ");
	    System.out.println("The computer decided to block ");	
	    ComputerChoice.setText("The computer decided to block ");
	    System.out.println("You win");
	    WonPoints ++;	
	    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
	    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
	   }
	   if ( choice.equals("Special_Power"))
	   {
	    System.out.println("You decided to use special power ");
	    System.out.println("The computer decided to use special power ");	
	    ComputerChoice.setText("The computer decided to use special power ");
	    System.out.println("Equality");	
	    System.out.println("You : " + WonPoints + " | Computer : " + LostPoints);
	    result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
	   }    
  }
  if (LostPoints == POINTS)
  {
   System.out.println("Lost !");
   Victory.setText(" Lost . . . Try again !");
   ComputerChoice.setText("The computer has choosen :         " );
   result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
  }
 
   // si gagne 
 
  if (WonPoints == POINTS)
  {
   System.out.println("WELL DONE !!");
   Victory.setText(" WELL DONE  ! ! You won ! ");
   ComputerChoice.setText("The computer has choosen :         ") ;
   result.setText(" *** SCORE *** You : " + WonPoints + " | Computer : " + LostPoints );
  } 
  }
 }
 public JMenuBar Menu;
 public JMenu New;
 public JMenuItem newGame, leveldecided, Hero, IA;
 public JRadioButton level1, level2, level3;
 public JRadioButton Damager1, Healer1, Tank1;
 public JRadioButton Damager2, Healer2, Tank2;
 public JButton valide;
 public JButton Epee, Bouclier, Baguette;
 public JLabel Intro, result, ComputerChoice, Victory, levels, choiceHero, choiceIA;
 int WonPoints = 0 , LostPoints = 0 , POINTS = 3;
 Object choice;
 String PlayerChoice = "" ,NumberofPoints , WIN;
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