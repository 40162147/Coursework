import java.util.Random;

import javax.swing.JOptionPane;

public class MasterShip extends EnemyShip implements Observer
{
	protected String name;
	protected int position;
	protected String mode;
	protected Mode mode1;
	protected String updates;
	
	public MasterShip() 
	{
		setName("mastership");
		setMode("Defensive");
		setmodeBehaviour(new DefensiveMode());
		Random type = new Random();
		int type1 = type.nextInt(15)+1;
		setPosition(type1);
	}
	
	public String getMode() 
	{
		return this.mode;
	}

	public void setMode(String mode) 
	{
		this.mode = mode;
	}
	
	public String message()
	{
		return mode1.mode();
	}
	
	public Mode getmodeBehaviour() 
	{
		return this.mode1;
	}
	public void setmodeBehaviour(Mode mode1) {
		this.mode1 = mode1;
	}

	public void update() 
	{
		display();
	}

	public void display() 
	{
		
		JOptionPane.showMessageDialog(null,"GAME OVER","OH NO :c",JOptionPane.WARNING_MESSAGE);
		
	}


}







