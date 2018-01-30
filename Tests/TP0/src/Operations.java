
import org.apache.log4j.Logger;

public class Operations {
	Logger OperationsLogger = Logger.getLogger("LogOpsMsg");

	float divideAbyB(int a, int b) {
		OperationsLogger.info("OperationLogger says: Entering Operations class");
		
		float result;
		
		OperationsLogger.debug("arg a = " + a + " / arg b = " + b);
		if (b == 0) { //Fatal crash divide by zero
			OperationsLogger.fatal("Purée ! Une division par zéro !");
			//Faire quelque chose d'intelligent ici
			OperationsLogger.fatal("On stoppe le programme.");
			/*System.out.println("Ouch! On a crashé...");*/
			System.exit(1);
		}		
		result = a / b;
		return result;
	}
}
