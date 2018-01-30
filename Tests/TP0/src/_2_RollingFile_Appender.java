
//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
//import org.apache.log4j.Level;

public class _2_RollingFile_Appender {
  private static final Logger rootLogger = Logger.getRootLogger();

  public static void main(String args[]) {
	PropertyConfigurator.configure(args[0]);

	rootLogger.info("App début...");

	Operations opObject = new Operations();

	int a=100;
	int b=2;
	
	rootLogger.info("On va appeler Operations.divideAbyB()");
	float result = opObject.divideAbyB(a,b);
	rootLogger.info("On est sorti de Operations.divideAbyB()");
	
	System.out.println("*** CECI EST UN PRINTLN() ! Resultat = " + result + " ***");
	rootLogger.info("App fin.");
  }
}
