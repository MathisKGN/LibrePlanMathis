import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageListeCalendrier extends PageBandeau {
	
	public PageListeCalendrier(WebDriver driver) {
		super(driver);
		
	}
	
	// Web element
	
		@FindBy (xpath="/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/span/table/tbody/tr[2]/td[2]")
		WebElement Créer_button;
		
		
		@FindBy(xpath = "//div[contains(text(),\"Liste de calendriers\")]")
	    public WebElement Titre_Liste_Calendrier;
		
		@FindBy(xpath = "//div[contains(text(),\"Nom\")]")
	    public WebElement Colonne_Nom;
		
		@FindBy(xpath = "//div[contains(text(),\"Hérité de la date\")]")
	    public WebElement Colonne_Hérité_Date;
		
		@FindBy(xpath = "//div[contains(text(),\"Héritages à jour\")]")
	    public WebElement Colonne_Héritages_A_Jour;
		
		@FindBy(xpath = "//div[contains(text(),\"Opérations\")]")
	    public WebElement Colonne_Opérations;
		
		@FindBy(xpath = "//span[@class=\"z-dottree-ico z-dottree-firstspacer\"]/following-sibling::span[contains(text(),\"Calendrier - Test 1\")]")
	    public WebElement Calendrier_Test_1;
		
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div[3]/table/tbody[2]/tr[1]/td[4]/div/span[1]/table/tbody/tr[2]/td[2]/img")
	    public WebElement Créer_dérive_button;
		
		@FindBy(xpath = "//span[@class=\"z-dottree-line z-dottree-last\"]/following-sibling::span[contains(text(),\"Calendrier - Test Calendrier Dérivé\")]")
	    public WebElement Calendrier_dérive_test_1;
		
		@FindBy(xpath = "//span[@class=\"z-dottree-ico z-dottree-root-open\"]")
	    public WebElement Minus_button;
		
		@FindBy(xpath = "//span[@class=\"z-dottree-ico z-dottree-root-close\"]")
	    public WebElement Minus_button_close;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div[3]/table/tbody[2]/tr[1]/td[4]/div/span[2]/table/tbody/tr[2]/td[2]/img")
	    public WebElement Copy_button;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/table/tbody/tr/td/table/tbody/tr[5]/td/div/span")
	    public WebElement Message_test_enregistré;
		
		@FindBy(xpath = "//span[@class=\"z-dottree-ico z-dottree-firstspacer\"]/following-sibling::span[contains(text(),\"Calendrier - Test 2\")]")
	    public WebElement Calendrier_test_2;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div[3]/table/tbody[2]/tr[1]/td[4]/div/span[4]/table/tbody/tr[2]/td[2]/img")
	    public WebElement Supprimer_button_calendrier_1;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div[3]/table/tbody[2]/tr[2]/td[4]/div/span[4]/table/tbody/tr[2]/td[2]/img")
	    public WebElement Supprimer_button_dérive_calendrier_1;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div[3]/table/tbody[2]/tr[3]/td[4]/div/span[4]/table/tbody/tr[2]/td[2]/img")
	    public WebElement Supprimer_button_calendrier_2;
		
		@FindBy(xpath = "//td[contains(text(),\"OK\")]")
	    public WebElement OK_button_supression;
		
		@FindBy(xpath = "//span[contains(text(),'Suppression du calendrier \"Calendrier - Test 2\"')]")
	    public WebElement Message_supression_test_2;
		
		@FindBy(xpath = "//span[contains(text(),'Suppression du calendrier \"Calendrier - Test 1\"')]")
	    public WebElement Message_supression_test_1;
		
		@FindBy(xpath = "//span[contains(text(),'Suppression du calendrier \"Calendrier - Test Calendrier Dérivé\"')]")
	    public WebElement Message_supression_test_dérivé;
		
		
		
		//fonction pour accéder à la page de création des calendriers
		public PageCreationCalendrier clicCreerCalendrier(WebDriver driver) {
		Créer_button.click();
		return PageFactory.initElements(driver, PageCreationCalendrier.class);
		}
		
		//fonction pour créer une dérive
		public void CreerDérive(WebDriver driver) {
		Créer_dérive_button.click();		
		}
		
		//fonction pour cliquer sur le bouton "moins"
		public void Minusbuttonclick(WebDriver driver) {
			Minus_button.click();		
			}
		
	//fonction pour creer une copie d'un calendrier
		public void Copybuttonclick(WebDriver driver) {
			Copy_button.click();		
			}
		
	//fonction pour supprimer calendrier 1 et 2
		public void Supprimerbuttonclick(WebDriver driver) {
			Supprimer_button_calendrier_2.click();
			OK_button_supression.click();
			Supprimer_button_dérive_calendrier_1.click();
			OK_button_supression.click();
			Supprimer_button_calendrier_1.click();
			OK_button_supression.click();
			}

}