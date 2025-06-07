package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleWelcomepage 
{
	@FindBy(name= "q")
	private WebElement textBox;
	
	
	public GoogleWelcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void textBox()
	{
		textBox.sendKeys("Hello Google");
	}

}
