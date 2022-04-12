import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageCreationCalendrier extends PageBandeau {
	
	public PageCreationCalendrier(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//td[contains(text(),\"Créer Calendrier\")]")
    public WebElement Titre_Creer_Calendrier;
	
	@FindBy(xpath = "//span[contains(text(),\"Données de calendrier\")]")
    public WebElement Données_Calendrier;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/table/tbody/tr/td/table/tbody/tr/td[1]/span/table/tbody/tr[2]/td[2]")
    public WebElement Enregistrer_button;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/table/tbody/tr/td/table/tbody/tr/td[3]/span/table/tbody/tr[2]/td[2]")
    public WebElement Enregistrer_Continuer_button;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/table/tbody/tr/td/table/tbody/tr/td[5]/span/table/tbody/tr[2]/td[2]")
    public WebElement Annuler_button;
	
	@FindBy(xpath = "//input[@class=\"z-textbox\"]")
    public WebElement Nom_Fieldset;
	
	@FindBy(xpath = "//label[contains(text(),\"Générer le code\")]/preceding-sibling::*")
    public WebElement Code_Checkbox;
	
	@FindBy(xpath = "//span[contains(text(),\"Dérivé du calendrier Calendrier - T\")]")
    public WebElement Type_Dérive;
	
	@FindBy(xpath = "//span[contains(text(),\"Calendrier - Test 1 existe déjà\")]")
    public WebElement Message_Non_Conforme;
	
	@FindBy(xpath = "//td[contains(text(),\"Créer Calendrier: Calendrier - Test Calendrier Dérivé\")]")
    public WebElement Titre_Dérive;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/table/tbody/tr/td/table/tbody/tr[5]/td/div/span")
    public WebElement Message_confirmation_dérive;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[3]/table/tbody[2]/tr[2]/td[2]/div/table/tbody/tr/td/table/tbody/tr/td/span")
    public WebElement Type_Field;
	
	@FindBy(xpath = "//span[contains(text(),\"Calendrier - Test 1 existe déjà\")]")
    public WebElement Message_Copie_Non_Conforme;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[3]/table/tbody[2]/tr/td[2]/div/input")
    public WebElement Nom_fieldset_erreur;
	
	
	public boolean checkBoxCodeVerif() {
		boolean selected;
		if(Code_Checkbox.isSelected()) {
			selected=true;
		}
		else {
            selected=false;
        }
        return selected;
	}
	
	//fonction pour créer calendrier
	public void CreerCalendrier(WebDriver driver, String s) throws InterruptedException {
	Nom_Fieldset.clear();
	Nom_fieldset_erreur.click();
	Nom_fieldset_erreur.sendKeys(s);
	Enregistrer_button.click();		
	}
	
	//fonction pour créer et continuer calendrier
	public void Creer_continuer_Calendrier(WebDriver driver, String s) throws InterruptedException {
		Nom_Fieldset.clear();
		Nom_fieldset_erreur.click();
		Nom_fieldset_erreur.sendKeys(s);
		Enregistrer_Continuer_button.click();		
		}
	
	//fonction pour annuler et retourner page liste calendrier
	public void Annuler_Calendrier(WebDriver driver) {
		Annuler_button.click();		
		}
		
}