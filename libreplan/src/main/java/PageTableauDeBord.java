import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTableauDeBord extends PageBandeau {
	public PageTableauDeBord(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div[contains(text(),\"Mon tableau de bord\")]")
	public WebElement Titre_page_tableau_de_bord;
	
}