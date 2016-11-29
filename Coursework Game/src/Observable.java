
public interface Observable 
{
	public void registerObserver(EnemyShip E);
	public void removeObserver(EnemyShip E);
	public void notifyObservers(EnemyShip E);
}
