package selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogsDemo {

	public static void main(String[] args) {
		 Logger logger=Logger.getLogger("");
		 PropertyConfigurator.configure("log4j.properties");
		 
		 int x=5;
		 int y=10;
		 logger.info("Created varibales");
		 
		 if(x>y)
		 {
			 logger.info("X is greater than y");
			 
		 }
		 else
		 {
			 logger.error("X is not greater than Y");
		 }
	}

}
