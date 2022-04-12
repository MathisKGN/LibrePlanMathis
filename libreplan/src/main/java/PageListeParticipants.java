import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageListeParticipants extends PageBandeau {
	
	public PageListeParticipants(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(text(),\"Liste des participants\")]")
	public WebElement Titre_Liste_Participants;
	
	@FindBy(xpath = "//div[contains(text(),\"Surnom\")]")
	public WebElement Surnom_field;
	
	@FindBy(xpath = "//div[contains(text(),\"Prénom\")]")
	public WebElement Prenom_field;
	
	@FindBy(xpath = "//div[contains(text(),\"ID\")]")
	public WebElement ID_field;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[1]/table/tbody[2]/tr/th[4]/div")
	public WebElement Code_field;
	
	@FindBy(xpath = "//div[contains(text(),\"En file\")]")
	public WebElement En_File_field;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[1]/table/tbody[2]/tr/th[6]/div")
	public WebElement Opérations_field;
	
	@FindBy(xpath = "//input[@style=\"width: 262px;\"]")
	public WebElement Filtre_Par_field;
	
	@FindBy(xpath = "//input[@style=\"width: 262px;\"]/following-sibling::i")
	public WebElement Loupe_button;
	
	@FindBy(xpath = "//input[@style=\"width:200px;\"]")
	public WebElement Détails_personnels_field;
	
	@FindBy(xpath = "//td[contains(text(),\"Plus d'options\")]")
	public WebElement Plus_Option_button;
	
	@FindBy(xpath = "//td[contains(text(),\"Filtre\")]")
	public WebElement Filtre_button;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/span/table/tbody/tr[2]/td[2]")
	public WebElement Creer_button;
	
	@FindBy(xpath = "//span[contains(text(),\"Participant enregistré\")]")
    public WebElement Message_participant_enregistré;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[3]/table/tbody[2]/tr[1]/td[1]/div/span")
    public WebElement Verification_Nom_crée;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[3]/table/tbody[2]/tr[1]/td[2]/div/span")
    public WebElement Verification_Prénom_crée;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[3]/table/tbody[2]/tr[1]/td[3]/div/span")
    public WebElement Verification_ID_crée;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[2]/table/tbody/tr/td/table/tbody/tr/td[9]/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[3]/i/input")
    public WebElement Periode_active_depuis;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[2]/table/tbody/tr/td/table/tbody/tr/td[9]/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[7]/i/input")
    public WebElement Periode_active_à;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[2]/table/tbody/tr/td/table/tbody/tr/td[9]/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[11]/select")
    public WebElement Type_liste_deroulante;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[4]/div/table/tbody/tr/td[8]/table/tbody/tr/td[2]/em/button")
    public WebElement Bouton_Next_Page;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[4]/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em/button")
    public WebElement Bouton_Previous_Page;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[4]/div/table/tbody/tr/td[9]/table/tbody/tr/td[2]/em/button")
    public WebElement Bouton_Final_Page;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[4]/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button")
    public WebElement Bouton_First_Page;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[4]/div/table/tbody/tr/td[6]/span")
    public WebElement Numero_page_total_participant;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[4]/div/table/tbody/tr/td[5]/input")
    public WebElement Numero_page_participant;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div[4]/div[3]/table/tbody[2]/tr[1]/td[6]/div/table/tbody/tr/td/table/tbody/tr/td[3]/span/table/tbody/tr[2]/td[2]/img")
    public WebElement Bouton_suppression_utilisateur;
	
	@FindBy(xpath = "//td[contains(text(),\"OK\")]")
    public WebElement Bouton_confirm_suppression_utilisateur;
	
	@FindBy(xpath = "//td[contains(text(),\"Oui\")]")
    public WebElement Bouton_confirm_suppression_utilisateur_lie;
	
	@FindBy(xpath = "//span[contains(text(),\"Travailleur et utilisateur lié supprimés\")]")
    public WebElement Message_confirmation_suppression;
	
	
	//fonction pour accéder à la page de création des participants
			public PageCreationParticipants clicCreerParticipants(WebDriver driver) {
			Creer_button.click();
			return PageFactory.initElements(driver, PageCreationParticipants.class);
			}
			
	//fonction pour filtrer participant
			public void FiltreParticipants(WebDriver driver, String prenom) {	
			Détails_personnels_field.sendKeys(prenom);
			Filtre_button.click();
			}
			
			
	
}