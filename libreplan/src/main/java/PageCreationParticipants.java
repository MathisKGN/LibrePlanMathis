import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCreationParticipants extends PageBandeau {
	
	public PageCreationParticipants(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//td[contains(text(),\"Créer Participant\")]")
	public WebElement Titre_Creer_Participants;
	
	@FindBy(xpath = "//span[contains(text(),\"Données de base\")]")
	public WebElement Titre_onglet_données_de_base;
	
	@FindBy(xpath = "//input[@class=\"z-textbox z-textbox-disd z-textbox-text-disd\"]")
	public WebElement Code_field_disable_creation;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[1]/div/div/div[3]/table/tbody[2]/tr[1]/td[2]/div/table/tbody/tr/td/table/tbody/tr/td[3]/span/input")
	public WebElement Case_generer_code;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[1]/div/div/div[3]/table/tbody[2]/tr[2]/td[2]/div/input")
	public WebElement Prenom_field_creation;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[1]/div/div/div[3]/table/tbody[2]/tr[4]/td[2]/div/input")
	public WebElement Nom_field_creation;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[1]/div/div/div[3]/table/tbody[2]/tr[5]/td[2]/div/input")
	public WebElement ID_field_creation;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[1]/div/div/div[3]/table/tbody[2]/tr[6]/td[2]/div/select/option[contains(text(),\"Ressource normale\")]")
	public WebElement Option_liste_deroulante_defaut_creation;
	
	@FindBy(xpath = "//span[contains(text(),\"Utilisateur lié\")]")
	public WebElement Bloc_utilisateur_lie;
	
	@FindBy(xpath = "//span[contains(text(),\"Utilisateur lié\")]/ancestor::fieldset/div/span/span[1]/input")
	public WebElement Bouton_radio_non_lie;
	
	@FindBy(xpath = "//span[contains(text(),\"Utilisateur lié\")]/ancestor::fieldset/div/span/span[2]/input")
	public WebElement Bouton_radio_utilisateur_existant;
	
	@FindBy(xpath = "//span[contains(text(),\"Utilisateur lié\")]/ancestor::fieldset/div/span/span[3]/input")
	public WebElement Bouton_radio_creer_nouvel_utilisateur;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/span[1]/table/tbody/tr[2]/td[2]")
	public WebElement Bouton_Enregistrer;
	
	@FindBy(xpath = "//td[contains(text(),\"Sauver et continuer\")]")
	public WebElement Bouton_Sauver_continuer;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/span[3]/table/tbody/tr[2]/td[2]")
	public WebElement Bouton_Annuler;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[2]/div/div[2]/div[2]/div/div/div[3]/table/tbody[2]/tr[1]/td[2]/div/input")
	public WebElement Nom_Utilisateur_field;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[2]/div/div[2]/div[2]/div/div/div[3]/table/tbody[2]/tr[2]/td[2]/div/input")
	public WebElement Password_field;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[2]/div/div[2]/div[2]/div/div/div[3]/table/tbody[2]/tr[3]/td[2]/div/input")
	public WebElement Password_confirm_field;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/fieldset[2]/div/div[2]/div[2]/div/div/div[3]/table/tbody[2]/tr[4]/td[2]/div/input")
	public WebElement Email_field;
	
	//fonction pour créer nouveau participant
		public void CreerParticipant(WebDriver driver, String prenom, String nom, String ID, String username, String password, String email) throws InterruptedException {
		Prenom_field_creation.click();
		Prenom_field_creation.clear();
		Prenom_field_creation.click();
		Prenom_field_creation.sendKeys(prenom);
		Nom_field_creation.click();
		Nom_field_creation.sendKeys(nom);
		ID_field_creation.click();
		ID_field_creation.sendKeys(ID);
		Bouton_radio_creer_nouvel_utilisateur.click();
		Nom_Utilisateur_field.sendKeys(username);
		Password_field.sendKeys(password);
		Password_confirm_field.sendKeys(password);
		Email_field.sendKeys(email);
		Bouton_Enregistrer.click();
		}
	
}