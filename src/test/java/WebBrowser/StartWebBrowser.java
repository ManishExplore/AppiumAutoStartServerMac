package WebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StartWebBrowser {

	@Test
	public void startup()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://slicepay.in");
	}

}
