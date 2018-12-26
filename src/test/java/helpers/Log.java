package helpers;
import org.apache.log4j.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName()); 
	
	public static void startTestCase(String sTestCaseName){
		Log.info("Started Test cases");
		System.out.println("Log information.o(\"Started cases\");");
		System.out.println("Version contr01");
	}


	public static void endTestCase(String sTestCaseName){
		Log.info("Ended Teseet Case");
	}

	public static void info(String message)
	{
		Log.info(message+"message");
	}

}