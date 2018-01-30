import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {

	public static Logger LOG;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOG = Logger.getLogger(Main.class);
		BasicConfigurator.configure();
		LOG.debug("Testy debug");
		LOG.info("Testy info");

	}

}
