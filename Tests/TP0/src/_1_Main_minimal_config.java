
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class _1_Main_minimal_config {
  private static final Logger basicLogger = Logger.getLogger(_1_Main_minimal_config.class);

  public static void main(String args[]) {

	PropertyConfigurator.configure(args[0]);
	Operations opObject = new Operations();

	int a=100;
	int b=2;
	
	basicLogger.info("On va appeler Operations.divideAbyB()");
	float result = opObject.divideAbyB(a,b);
	basicLogger.error("On est sorti de Operations.divideAbyB()");
	
	System.out.println("*** CECI EST UN PRINTLN() ! Resultat = " + result + " ***");
	basicLogger.info("App fin.");
  }
}
