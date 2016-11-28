import java.util.Random;

public class MasterShip extends EnemyShip
{
	protected String name;
	protected int position;
	protected String mode;
	protected Movement moveBehaviour;
	
	public MasterShip() 
	{
		setName("mastership");
		setMoveBehaviour(new OneSpace());
		setMode("Defensive");
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
}
