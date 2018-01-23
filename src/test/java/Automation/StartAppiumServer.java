package Automation;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
/*public static void startAppium() throws InterruptedException {
	 
	 // starting the Appium server code
	 try{
	 Log.info("Starting Appium Server.");
	 service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
	 .withAppiumJS(new File("C:\\Users\\XXXX\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
	 .withLogFile(new File(System.getProperty("user.dir") + "\\Logs\\Appium.log")));
	 service.start();
	 Thread.sleep(5000);
	 }
	 catch (InterruptedException e)
	 {
	 Log.error("Failed to start Appium.");
	 }
	 
	 }*/


/* Type - 1
	 * String nodePath = "/Applications/Appium.app/Contents/Resources/node/bin/node.exe";
	String appiumJsPath = "/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js";
	String cmd = nodePath + " " + appiumJsPath;
	
	@BeforeSuite
	public void startAppium() throws IOException, InterruptedException
	{
		Process p = Runtime.getRuntime().exec(cmd);
		Thread.sleep(10000);
		
		if(p != null)
		{
			System.out.println("Appium Server Is Starting Now....");
		}
	}
	
	 Type - 2
	 public class StartAppiumServer 
     {
	
		@BeforeSuite
		public void startAppiumServer()
		{
			System.out.println("Trying to start Appium Server...");
			    AppiumServiceBuilder service = new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
						.withAppiumJS(new File(
				"/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"));
				service.build().start();
				System.out.println("Appium Server is at your service!");
	    }
}
	*
	*/
	
	
	
	
	
	

