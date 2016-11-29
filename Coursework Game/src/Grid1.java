import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;


import javax.swing.ImageIcon;



public class Grid1 extends JFrame implements Observable
{
	int NOShips = 0;
	int time =500;
	private MasterShip mastership;
	private EnemyShipFactory Factory;
	private ArrayList <EnemyShip>  EnemyShips = new ArrayList <EnemyShip> ();
	Control control = new Control();
	Theme theme = new Theme();
	
	
	final java.net.URL imageURL = Grid1.class.getResource("background.png");
	final java.net.URL MasterShip = Grid1.class.getResource("ship.png");
	final java.net.URL BattleCruiser = Grid1.class.getResource("battlecruiser.png");
	final java.net.URL BattleShooter = Grid1.class.getResource("battleshooter.png");
	final java.net.URL BattleStar = Grid1.class.getResource("battlestar.png");
	final java.net.URL Ocean = Grid1.class.getResource("ocean.png");
	final java.net.URL Space = Grid1.class.getResource("space.png");
	
	JLabel background = new JLabel(new ImageIcon(Space));
	
	final JLabel zero = new JLabel("");
	final JLabel one = new JLabel("");
	final JLabel two = new JLabel("");
	final JLabel three = new JLabel("");
	final JLabel four = new JLabel("");
	final JLabel five = new JLabel("");
	final JLabel six = new JLabel("");
	final JLabel seven = new JLabel("");
	final JLabel eight = new JLabel("");
	final JLabel nine = new JLabel("");
	final JLabel ten = new JLabel("");
	final JLabel eleven = new JLabel("");
	final JLabel twelve = new JLabel("");
	final JLabel thirteen = new JLabel("");
	final JLabel fourteen = new JLabel("");
	final JLabel fifthteen = new JLabel("");
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Grid1 frame = new Grid1();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grid1() 
	{
		mastership = new MasterShip();
		Factory = new EnemyShipFactory();
		final ArrayList<EnemyShip> ships = new ArrayList<EnemyShip>();
		final ArrayList<EnemyShip> Deadships = new ArrayList<EnemyShip>();
		
		
		ships.add(mastership);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 417);
		getContentPane().setLayout(null);
		
			background = new JLabel(new ImageIcon(Space));
			setContentPane(background);

		
		zero.setIcon(new ImageIcon(imageURL));
		zero.setBackground(Color.WHITE);
		zero.setBounds(62, 23, 89, 64);
		getContentPane().add(zero);
		
		
		one.setIcon(new ImageIcon(imageURL));
		one.setBackground(Color.WHITE);
		one.setBounds(150, 23, 89, 64);
		getContentPane().add(one);
		
		
		two.setIcon(new ImageIcon(imageURL));
		two.setBackground(Color.WHITE);
		two.setBounds(238, 23, 89, 64);
		getContentPane().add(two);
		
		
		three.setIcon(new ImageIcon(imageURL));
		three.setBackground(Color.WHITE);
		three.setBounds(327, 23, 89, 64);
		getContentPane().add(three);
		
		final JLabel lblCurrentState = new JLabel("Current State: " + mastership.getMode());
		lblCurrentState.setForeground(Color.WHITE);
		lblCurrentState.setBounds(50, 329, 156, 23);
		getContentPane().add(lblCurrentState);
		
		
		
		four.setIcon(new ImageIcon(imageURL));
		four.setBackground(Color.WHITE);
		four.setBounds(62, 89, 89, 64);
		getContentPane().add(four);
		
		
		five.setIcon(new ImageIcon(imageURL));
		five.setBackground(Color.WHITE);
		five.setBounds(150, 89, 89, 64);
		getContentPane().add(five);
		
		
		six.setIcon(new ImageIcon(imageURL));
		six.setBackground(Color.WHITE);
		six.setBounds(238, 89, 89, 64);
		getContentPane().add(six);
		
		
		seven.setIcon(new ImageIcon(imageURL));
		seven.setBackground(Color.WHITE);
		seven.setBounds(327, 89, 89, 64);
		getContentPane().add(seven);
		
		
		eight.setIcon(new ImageIcon(imageURL));
		eight.setBackground(Color.WHITE);
		eight.setBounds(62, 156, 89, 64);
		getContentPane().add(eight);
		
		
		nine.setIcon(new ImageIcon(imageURL));
		nine.setBackground(Color.WHITE);
		nine.setBounds(150, 156, 89, 64);
		getContentPane().add(nine);
		
		
		ten.setIcon(new ImageIcon(imageURL));
		ten.setBackground(Color.WHITE);
		ten.setBounds(238, 156, 89, 64);
		getContentPane().add(ten);
		
		
		eleven.setIcon(new ImageIcon(imageURL));
		eleven.setBackground(Color.WHITE);
		eleven.setBounds(327, 156, 89, 64);
		getContentPane().add(eleven);
		
		
		twelve.setIcon(new ImageIcon(imageURL));
		twelve.setBackground(Color.WHITE);
		twelve.setBounds(62, 222, 89, 64);
		getContentPane().add(twelve);
		
		
		thirteen.setIcon(new ImageIcon(imageURL));
		thirteen.setBackground(Color.WHITE);
		thirteen.setBounds(150, 222, 89, 64);
		getContentPane().add(thirteen);
		
		
		fourteen.setIcon(new ImageIcon(imageURL));
		fourteen.setBackground(Color.WHITE);
		fourteen.setBounds(238, 222, 89, 64);
		getContentPane().add(fourteen);
		
		
		fifthteen.setIcon(new ImageIcon(imageURL));
		fifthteen.setBackground(Color.WHITE);
		fifthteen.setBounds(327, 222, 89, 64);
		getContentPane().add(fifthteen);
		
		
		
		
		JButton btnChangeState = new JButton("Change State");
		btnChangeState.setBounds(216, 329, 117, 23);
		getContentPane().add(btnChangeState);
		btnChangeState.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(mastership.getMode().equals("Defensive"))
				{
					mastership.setMode("Offensive");
					mastership.setmodeBehaviour(new OffensiveMode());
					lblCurrentState.setText("Current State: " + mastership.message());
				}
				else
				{
					mastership.setmodeBehaviour(new DefensiveMode());
					mastership.setMode("Defensive");
					lblCurrentState.setText("Current State: " + mastership.message());
				}
			}
		});
		

		final JLabel lblEnemyShips = new JLabel("Enemy Ships: " + NOShips);
		lblEnemyShips.setForeground(Color.WHITE);
		lblEnemyShips.setBounds(50, 297, 117, 21);
		getContentPane().add(lblEnemyShips);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(345, 296, 89, 23);
		getContentPane().add(btnUndo);
		btnUndo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg2) 
			{
				
				try 
				{
					Thread.sleep(time);
					System.out.println("oh delay");
					
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
				for(EnemyShip ship : ships)
				{
					
					URL image = null;
					if (ship.getName().equals("mastership"))
					{
						image = MasterShip;
					}
					else if(ship.getName().equals("BattleCruiser"))
					{
						image = BattleCruiser;
					}
					else if(ship.getName().equals("BattleShooter"))
					{
						image = BattleShooter;
					}
					else
					{
						image = BattleStar;
					}
					
					
					boolean first = true;
					
					if(ship.getPosition() == 0)
					{
						checkPosImage(ship, ships, first, image);
						ships.remove(ship);
						NOShips--;
						lblEnemyShips.setText("Enemy Ships: " + NOShips);
					}
					else if(ship.getPosition() == 1)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					
					}
					else if(ship.getPosition() == 2)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());				
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 3)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
				
					}
				
					else if(ship.getPosition() == 4)
					{
						
						checkPosImage(ship, ships,first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					
					}
				
					else if(ship.getPosition() == 5)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 6)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 7)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 8)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 9)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 10)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 11)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 12)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 13)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else if(ship.getPosition() == 14)
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				
					else
					{
						
						checkPosImage(ship, ships, first, image);
						ship.setPosition(ship.getPrePosition());
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				}
				
				
			}
				
				
				
		});
	
		
		JButton btnTheme = new JButton("Theme");
		btnTheme.setBounds(426, 11, 89, 23);
		getContentPane().add(btnTheme);
		btnTheme.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg3) 
			{
				
				
				
				if(theme.on == false)
				{
			    	Command Spa = new Space(theme);
			    	control.setCommand(Spa);
			    	control.pressButton();
			    	background.setIcon(new ImageIcon(Space));
					setContentPane(background);
				}
				else
				{
					Command Sea = new Sea(theme);
			    	control.setCommand(Sea);
			    	control.pressButton();
					background.setIcon(new ImageIcon(Ocean));
					setContentPane(background);
				}
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		
		JButton btnMove = new JButton("Move");
		btnMove.setBounds(345, 329, 89, 23);
		getContentPane().add(btnMove);
		btnMove.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg1) 
			{
			
				try 
				{
					Thread.sleep(time);
					System.out.println("oh delay");
					
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}

				for(EnemyShip ship : ships)
				{
					
					URL image = null;
					if (ship.getName().equals("mastership"))
					{
						image = MasterShip;
					}
					else if(ship.getName().equals("BattleCruiser"))
					{
						image = BattleCruiser;
					}
					else if(ship.getName().equals("BattleShooter"))
					{
						image = BattleShooter;
					}
					else
					{
						image = BattleStar;
					}
					
					Random spawn = new Random();
					boolean first = true;
					ship.setPrePosition(ship.getPosition());
					
					if(ship.getPosition() == 0)
					{
						zero.setIcon(new ImageIcon(imageURL));
						MovementThree(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					else if(ship.getPosition() == 1)
					{
						checkPosImage(ship, ships, first, image);
						MovementFour(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
						
					}
					else if(ship.getPosition() == 2)
					{
						checkPosImage(ship, ships, first, image);
						MovementFive(ship, spawn, image);	
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 3)
					{
						checkPosImage(ship, ships, first, image);
						MovementThree(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					
					}
					
					else if(ship.getPosition() == 4)
					{
						checkPosImage(ship, ships,first, image);
						MovementFour(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
						
					}
					
					else if(ship.getPosition() == 5)
					{
						checkPosImage(ship, ships, first, image);
						MovementSeven(ship, spawn, image);	
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 6)
					{
						checkPosImage(ship, ships, first, image);
						MovementEight(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 7)
					{
						checkPosImage(ship, ships, first, image);
						MovementFive(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 8)
					{
						checkPosImage(ship, ships, first, image);
						MovementFive(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 9)
					{
						checkPosImage(ship, ships, first, image);
						MovementEight(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 10)
					{
						checkPosImage(ship, ships, first, image);
						MovementEight(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 11)
					{
						checkPosImage(ship, ships, first, image);
						MovementFive(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 12)
					{
						checkPosImage(ship, ships, first, image);
						MovementThree(ship, spawn, image);	
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 13)
					{
						checkPosImage(ship, ships, first, image);
						MovementFive(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else if(ship.getPosition() == 14)
					{
						checkPosImage(ship, ships, first, image);
						MovementFive(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
					
					else
					{
						checkPosImage(ship, ships, first, image);
						MovementThree(ship, spawn, image);
						first = false;
						checkPosImage(ship, ships, first, image);
					}
				}
			
				System.out.println(mastership.getPosition());
				
				boolean first = true;
				int amount = 0;
				for(EnemyShip ship1 : ships)
				{
					if(first == true)
					{
						first = false;
					}
					else
					{
						if(ship1.getPosition() == mastership.getPosition())
						{
							amount++;
							Deadships.add(ship1);
							System.out.println("dead");
						}
					}
				}
				
				System.out.println(amount);
				if(amount>=3 && mastership.getMode().equals("Offensive"))
				{
					ships.remove(mastership);
					notifyObservers(mastership);
					System.exit(0);
					
				}
				else if(mastership.getMode().equals("Defensive") && amount >1)
				{
					ships.remove(mastership);
					
					notifyObservers(mastership);
					System.exit(0);
				}
				else
				{
					for(EnemyShip ship2 : ships)
					{
						for(EnemyShip ship3 : Deadships)
						{
							if(ship3 == ship2)
							{
								ships.remove(ship2);
								Deadships.remove(ship3);
								notifyObservers(ship2);
								removeObserver(ship2);
								
								NOShips--;
								lblEnemyShips.setText("Enemy Ships: " + NOShips);
								
							}
						}
					}
				}
			
		
				
				
				Random num = new Random();
				int answer = num.nextInt(3);
				if(answer == 0)
				{
					EnemyShip enemy;
					
					Random type = new Random();
					int type1 = type.nextInt(3);
					
					
					enemy = Factory.createEnemyShip(Integer.toString(type1));
					
					
					if(enemy.getName().equals("BattleCruiser"))
					{
						zero.setIcon(new ImageIcon(BattleCruiser));
					}
					else if(enemy.getName().equals("BattleShooter"))
					{
						zero.setIcon(new ImageIcon(BattleShooter));
					}
					else
					{
						zero.setIcon(new ImageIcon(BattleStar));
					}
					
					
					
					ships.add(enemy);
					registerObserver(enemy);
					NOShips ++;
					lblEnemyShips.setText("Enemy Ships: " + NOShips);
					
				}	
			}

			private void MovementEight(EnemyShip ship, Random spawn, URL image) 
			{
				JLabel place1;
				JLabel place2;
				JLabel place3;
				JLabel place4;
				JLabel place5;
				JLabel place6;
				JLabel place7;
				JLabel place8;
				int pos1;
				int pos2;
				int pos3;
				int pos4;
				int pos5;
				int pos6;
				int pos7;
				int pos8;
				
				int random = spawn.nextInt(8);
				
				
				if(ship.getPosition() == 6)
				{
					place1 = one;
					place2 = two;
					place3 = three;
					place4 = five;
					place5 = seven;
					place6 = nine;
					place7 = ten;
					place8 = eleven;
					pos1 = 1;
					pos2 = 2;
					pos3 = 3;
					pos4 = 5;
					pos5 = 7;
					pos6 = 9;
					pos7 = 10;
					pos8 = 11;
				}
				else if(ship.getPosition() == 9)
				{
					place1 = four;
					place2 = five;
					place3 = six;
					place4 = eight;
					place5 = ten;
					place6 = twelve;
					place7 = thirteen;
					place8 = fourteen;
					pos1 = 4;
					pos2 = 5;
					pos3 = 6;
					pos4 = 8;
					pos5 = 10;
					pos6 = 12;
					pos7 = 13;
					pos8 = 14;
				}
				else
				{
					place1 = five;
					place2 = six;
					place3 = seven;
					place4 = nine;
					place5 = eleven;
					place6 = thirteen;
					place7 = fourteen;
					place8 = fifthteen;
					pos1 = 5;
					pos2 = 6;
					pos3 = 7;
					pos4 = 9;
					pos5 = 11;
					pos6 = 13;
					pos7 = 14;
					pos8 = 15;
				}
							
				
				if(random == 0)
				{
					place1.setIcon(new ImageIcon(image));
					ship.setPosition(pos1);
				}
				else if(random == 1)
				{
					place2.setIcon(new ImageIcon(image));
					ship.setPosition(pos2);
				}
				else if(random == 2)
				{
					place3.setIcon(new ImageIcon(image));
					ship.setPosition(pos3);
				}
				else if(random == 3)
				{
					place4.setIcon(new ImageIcon(image));
					ship.setPosition(pos4);
				}
				else if(random == 4)
				{
					place5.setIcon(new ImageIcon(image));
					ship.setPosition(pos5);
				}
				else if(random == 5)
				{
					place6.setIcon(new ImageIcon(image));
					ship.setPosition(pos6);
				}
				else if(random == 6)
				{
					place7.setIcon(new ImageIcon(image));
					ship.setPosition(pos7);
				}
				else
				{
					place8.setIcon(new ImageIcon(image));
					ship.setPosition(pos8);
				}
				
				
				
				
			}

			private void MovementSeven(EnemyShip ship, Random spawn, URL image) 
			{
				
				JLabel place1 = one;
				JLabel place2 = two;
				JLabel place3 = four;
				JLabel place4 = six;
				JLabel place5 = eight;
				JLabel place6 = nine;
				JLabel place7 = ten;
				int pos1 = 1;
				int pos2 = 2;
				int pos3 = 4;
				int pos4 = 6;
				int pos5 = 8;
				int pos6 = 9;
				int pos7 = 10;
				
				int random = spawn.nextInt(7);
				
				
				if(random == 0)
				{
					place1.setIcon(new ImageIcon(image));
					ship.setPosition(pos1);
				}
				else if(random == 1)
				{
					place2.setIcon(new ImageIcon(image));
					ship.setPosition(pos2);
				}
				else if(random == 2)
				{
					place3.setIcon(new ImageIcon(image));
					ship.setPosition(pos3);
				}
				else if(random == 3)
				{
					place4.setIcon(new ImageIcon(image));
					ship.setPosition(pos4);
				}
				else if(random == 4)
				{
					place5.setIcon(new ImageIcon(image));
					ship.setPosition(pos5);
				}
				else if(random == 5)
				{
					place6.setIcon(new ImageIcon(image));
					ship.setPosition(pos6);
				}
				else
				{
					place7.setIcon(new ImageIcon(image));
					ship.setPosition(pos7);
				}
				
			
				
				
			}

			private void MovementFive(EnemyShip ship, Random spawn, URL image)
			{
				JLabel place1;
				JLabel place2;
				JLabel place3;
				JLabel place4;
				JLabel place5;
				int pos1;
				int pos2;
				int pos3;
				int pos4;
				int pos5;
				
				int random = spawn.nextInt(5);
				
				if(ship.getPosition() == 2)
				{
					place1 = one;
					place2 = three;
					place3 = five;
					place4 = six;
					place5 = seven;
					pos1 = 1;
					pos2 = 3;
					pos3 = 5;
					pos4 = 6;
					pos5 = 7;
				}
				else if(ship.getPosition() == 7)
				{
					place1 = two;
					place2 = three;
					place3 = six;
					place4 = ten;
					place5 = eleven;
					pos1 = 2;
					pos2 = 3;
					pos3 = 6;
					pos4 = 10;
					pos5 = 11;
				}
				else if(ship.getPosition() == 8)
				{
					place1 = four;
					place2 = five;
					place3 = nine;
					place4 = twelve;
					place5 = thirteen;
					pos1 = 4;
					pos2 = 5;
					pos3 = 9;
					pos4 = 12;
					pos5 = 13;
				}
				else if(ship.getPosition() == 11)
				{
					place1 = six;
					place2 = seven;
					place3 = ten;
					place4 = fourteen;
					place5 = fifthteen;
					pos1 = 6;
					pos2 = 7;
					pos3 = 10;
					pos4 = 14;
					pos5 = 15;
				}
				else if(ship.getPosition() == 13)
				{
					place1 = eight;
					place2 = nine;
					place3 = ten;
					place4 = twelve;
					place5 = fourteen;
					pos1 = 8;
					pos2 = 9;
					pos3 = 10;
					pos4 = 12;
					pos5 = 14;
				}
				else
				{
					place1 = nine;
					place2 = ten;
					place3 = eleven;
					place4 = thirteen;
					place5 = fifthteen;
					pos1 = 9;
					pos2 = 10;
					pos3 = 11;
					pos4 = 13;
					pos5 = 15;
				}
					
				if(random == 0)
				{
					place1.setIcon(new ImageIcon(image));
					ship.setPosition(pos1);
				}
				else if(random == 1)
				{
					place2.setIcon(new ImageIcon(image));
					ship.setPosition(pos2);
				}
				else if(random == 2)
				{
					place3.setIcon(new ImageIcon(image));
					ship.setPosition(pos3);
				}
				else if(random == 3)
				{
					place4.setIcon(new ImageIcon(image));
					ship.setPosition(pos4);
				}
				else
				{
					place5.setIcon(new ImageIcon(image));
					ship.setPosition(pos5);
				}
				
			}

			private void MovementFour(EnemyShip ship, Random spawn, URL image) 
			{
				
				
				JLabel place1;
				JLabel place2;
				JLabel place3;
				JLabel place4;
				int pos1;
				int pos2;
				int pos3;
				int pos4;
				
				int random = spawn.nextInt(4);
				
				if(ship.getPosition() == 1)
				{
					place1 = two;
					place2 = four;
					place3 = five;
					place4 = six;
					pos1 = 2;
					pos2 = 4;
					pos3 = 5;
					pos4 = 6;
				}
				else
				{
					place1 = one;
					place2 = five;
					place3 = eight;
					place4 = nine;
					pos1 = 1;
					pos2 = 5;
					pos3 = 8;
					pos4 = 9;
				}
				
			
				if(random == 0)
				{
					place1.setIcon(new ImageIcon(image));
					ship.setPosition(pos1);
				}
				else if(random == 1)
				{
					place2.setIcon(new ImageIcon(image));
					ship.setPosition(pos2);
				}
				else if(random == 2)
				{
					place3.setIcon(new ImageIcon(image));
					ship.setPosition(pos3);
				}
				else
				{
					place4.setIcon(new ImageIcon(image));
					ship.setPosition(pos4);
				}
			}
				
			private void MovementThree(EnemyShip ship, Random spawn, URL image) 
			{
				
				JLabel place1;
				JLabel place2;
				JLabel place3;
				int pos1;
				int pos2;
				int pos3;
				
				
				int random = spawn.nextInt(3);
				
				if(ship.getPosition() == 0)
				{
					place1 = one;
					place2 = four;
					place3 = five;
					pos1 = 1;
					pos2 = 4;
					pos3 = 5;
					
				}
				else if(ship.getPosition() == 3)
				{
					place1 = two;
					place2 = six;
					place3 = seven;
					pos1 = 2;
					pos2 = 6;
					pos3 = 7;
				}
				else if(ship.getPosition() == 15)
				{
					place1 = ten;
					place2 = eleven;
					place3 = fourteen;
					pos1 = 10;
					pos2 = 11;
					pos3 = 14;
				}
				else
				{
					place1 = eight;
					place2 = nine;
					place3 = thirteen;
					pos1 = 8;
					pos2 = 9;
					pos3 = 13;
				}
				
				
				if(random == 0)
				{
					place1.setIcon(new ImageIcon(image));
					ship.setPosition(pos1);
				}
				else if(random == 1)
				{
					place2.setIcon(new ImageIcon(image));
					ship.setPosition(pos2);
				}
				else
				{
					place3.setIcon(new ImageIcon(image));
					ship.setPosition(pos3);
				}		
				
			}		
		});
		
		
	}

	protected void checkPosImage(EnemyShip ship, ArrayList<EnemyShip> ships, boolean first, URL image) 
	{
		JLabel place;
		
		
		if(ship.getPosition() == 0)
		{
			place = zero;
		}
		else if(ship.getPosition() == 1)
		{
			place = one;
		}
		else if(ship.getPosition() == 2)
		{
			place = two;
		}
		else if(ship.getPosition() == 3)
		{
			place = three;
		}
		else if(ship.getPosition() == 4)
		{
			place = four;
		}
		else if(ship.getPosition() == 5)
		{
			place = five;
		}
		else if(ship.getPosition() == 6)
		{
			place = six;
		}
		else if(ship.getPosition() == 7)
		{
			place = seven;
		}
		else if(ship.getPosition() == 8)
		{
			place = eight;
		}
		else if(ship.getPosition() == 9)
		{
			place = nine;
		}
		else if(ship.getPosition() == 10)
		{
			place = ten;
		}
		else if(ship.getPosition() == 11)
		{
			place = eleven;
		}
		else if(ship.getPosition() == 12)
		{
			place = twelve;
		}
		else if(ship.getPosition() == 13)
		{
			place = thirteen;
		}
		else if(ship.getPosition() == 14)
		{
			place = fourteen;
		}
		else
		{
			place = fifthteen;
		}
		
		
		for(EnemyShip check : ships)
		{
			if(check.getPosition() == ship.getPosition() && check != ship && check.getName().equals("mastership"))
			{
				place.setIcon(new ImageIcon(MasterShip));
				break;
			}
			else if(check.getPosition() == ship.getPosition() && check != ship && check.getName().equals("BattleShooter"))
			{
				place.setIcon(new ImageIcon(BattleShooter));
				break;
			}
			else if(check.getPosition() ==ship.getPosition() && check != ship && check.getName().equals("BattleStar"))
			{
				place.setIcon(new ImageIcon(BattleStar));
				break;
			}
			else if(check.getPosition() == ship.getPosition()&& check != ship && check.getName().equals("BattleCruiser"))
			{
				place.setIcon(new ImageIcon(BattleCruiser));
				break;
			}
			else if(check == ship && first == false)
			{
				place.setIcon(new ImageIcon(image));
				break;
			}
			else
			{
				place.setIcon(new ImageIcon(imageURL));
			}
		
		}
		
	}

	public void registerObserver(EnemyShip E) 
	{
		this.EnemyShips.add(E);

	}

	public void removeObserver(EnemyShip E) 
	{
		this.EnemyShips.remove(E);

	}

	public void notifyObservers(EnemyShip E) 
	{
			E.update();	
	}


}
