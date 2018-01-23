package Automation;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AutoStartServer {
	
	private static final Logger logger = LogManager.getLogger(AutoStartServer.class);
	@BeforeTest
	public static void StartAppiumServer()
	{
		try
		{
			logger.info("Starting Appium Server...");
			
			AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("/Applications/Appium.app/Contents/Resources/node/bin/node.exe"))
					.withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js")));
			         service.start();
			         Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			logger.error("Error starting appium server...", e);
		}

   }
}
