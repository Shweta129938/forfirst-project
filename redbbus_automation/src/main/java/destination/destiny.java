package destination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class destiny {
	@FindBy(xpath="//input[@id=\"srcinput\"]")private WebElement from;
	@FindBy(xpath="//div[@aria-label=\"Kalyan, Mumbai\"]")private WebElement kalyanm;
	
	
	@FindBy(xpath="//input[@id=\"destinput\"]")private WebElement DE;
	@FindBy(xpath="//input[@value=\"ISBT Kashmiri Gate, Delhi\"]")private WebElement DElh;
	
	
	@FindBy(xpath="//button[@aria-label=\"Search for Tomorrow\"]")private WebElement Tm ;
	@FindBy(xpath="//button[@aria-label=\"Search buses\"]")private WebElement Bu ;
	
	public destiny(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void From() {
		from.sendKeys("Kalyan");
	}
	public void Mumbai() {
		kalyanm.click();
	}
	public void Dest() {
		DE.sendKeys("Delhi");
	}
	public void Delhi() {
		DElh.click();
	}
	public void Tommorrow() {
		Tm.click();
	}
    public void Searchbusses() {
    	Bu.click();
    }
}
