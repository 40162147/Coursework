
public class Sea implements Command
{
	  Theme theme;
	  public Sea(Theme theme)
	  {
	    this.theme = theme;
	  }
	  
	  public void execute()
	  {
	    theme.switchSea();
	  }
}
