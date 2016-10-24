public class EnemyShipFactory 
{
	public EnemyShip createEnemyShip(String name) 
	{
		EnemyShip enemy = null;
		
		if(name.equalsIgnoreCase("battlecruiser")) 
		{
			enemy = new BattleCruiser();
		}
		if(name.equalsIgnoreCase("battlestar")) 
		{
			enemy = new BattleStar();
		}
		if(name.equalsIgnoreCase("battleshooter")) 
		{
			enemy = new BattleShooter();
		}
		
		return enemy;
	}

}


