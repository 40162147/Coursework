
public abstract class EnemyShip 
{
	protected String name;
	protected int position;
	protected Movement moveBehaviour;
	
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
