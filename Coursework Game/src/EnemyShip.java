import javax.swing.JOptionPane;

public abstract class EnemyShip implements Observer
{
	protected String name;
	protected int position;
	protected int PrePosition;
	
	public EnemyShip() 
	{
		setPosition(0);
	}
	
	
	public String getName() 
	{
		return this.name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getPosition() 
	{
		return this.position;
	}

	public void setPosition(int position) 
	{
		this.position = position;
	}
	
	public int getPrePosition() 
	{
		return this.PrePosition;
	}

	public void setPrePosition(int PrePosition) 
	{
		this.PrePosition = PrePosition;
	}

	public void update() 
	{
		display();
	}

	public void display() 
	{
		
		JOptionPane.showMessageDialog(null,"Enemy Dead","Woooo :)",JOptionPane.WARNING_MESSAGE);
		
	}
}
