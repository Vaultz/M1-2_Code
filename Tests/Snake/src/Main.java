import javax.swing.JFrame;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	private static final Logger rootLogger = Logger.getRootLogger();
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		PropertyConfigurator myProp = new PropertyConfigurator();

		rootLogger.info("Main.main() : The game is launching");

		//Creating the window with all its awesome snaky features
		Window f1= new Window();
		
		//Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(300,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
