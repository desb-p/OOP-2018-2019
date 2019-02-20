package ie.dit;

public class Main
{	

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
	
	public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}

	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}
	
	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}

	
	public static void main(String[] args)
	{
		Main main = new Main();
<<<<<<< HEAD
		//main.loops();
=======
>>>>>>> 48792a25c10a8893835b958a741732059cb49fe0
		main.arrays();			
	}
}