import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;

public class Grid 
{
	public Grid()
	{
		super(new GridLayout(5,5));
		JLabel Label1, Label2, Label3, Label4, Label5;
		
		 ImageIcon ship = createImageIcon("ship.jpg");

		
		 Label1 = new JLabel(ship);
		 
		 add(Label1);
		 
	}
	


	protected static ImageIcon createImageIcon(String path) 
	{
		java.net.URL imgURL = Grid.class.getResource(path);
	    if (imgURL != null) 
	    {
	    	return new ImageIcon(imgURL);
	    } 
	    else 
	    {
	    	System.err.println("Couldn't find file: " + path);
	    	return null;
	    }
		
	 }
	static void createAndShowGUI() 
	{
        //Create and set up the window.
        JFrame frame = new JFrame("Grid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add content to the window.
        frame.add(new Grid());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
		
	}
}




