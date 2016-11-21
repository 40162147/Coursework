
public class MasterShip 
{
	protected String name;
	protected int position;
	protected String mode;
	protected Movement moveBehaviour;
	
	public MasterShip() 
	{
		setName("MasterShip");
		setMoveBehaviour(new OneSpace());
		setMode("Defensive");
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
	
	public String getMode() 
	{
		return this.mode;
	}

	public void setMode(String mode) 
	{
		this.mode = mode;
	}
	
	public void performMove() {
		this.moveBehaviour.move();
	}
	
	public Movement getMoveBehaviour() {
		return this.moveBehaviour;
	}
	
	public void setMoveBehaviour(Movement moveBehaviour) {
		this.moveBehaviour = moveBehaviour;
	}
	
	
	
	
}
