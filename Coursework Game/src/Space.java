
public class Space implements Command
{
	  Theme theme;
	  public Space(Theme theme)
	  {
	    this.theme = theme;
	  }
	  
	  public void execute()
	  {
	    theme.switchSpace();
	  }

}
