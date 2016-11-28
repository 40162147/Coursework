public class EnemyShipFactory 
{
	public EnemyShip createEnemyShip(String name) 
	{
		EnemyShip enemy = null;
		
		if(name.equalsIgnoreCase("0")) 
		{
			enemy = new BattleCruiser();
		}
		if(name.equalsIgnoreCase("1")) 
		{
			enemy = new BattleStar();
		}
		if(name.equalsIgnoreCase("2")) 
		{
			enemy = new BattleShooter();
		}
		
		return enemy;
	}

}


