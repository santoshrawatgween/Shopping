package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.GoogleWelcomepage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		GoogleWelcomepage g = new GoogleWelcomepage(driver);
		g.textBox();
		
		
	}

}
