import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCreationParticipantClass implements PageInterfaceJDD {
	
	WebDriver driver;
	WebDriverWait wait;
	Logger logger = Logger.getLogger(TestCreationParticipantClass.class.getName());

	@Before

	public void setup() throws Exception {

		//Initialisation du driver
		System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		
		//initialiser le fichier.properties
		Properties propertyJDD = new Properties();
	    propertyJDD.load(new FileInputStream("src/main/resources/JDD.properties/JDD.properties"));
	    
	    //aller sur le site du PROJET
	    driver.get(propertyJDD.getProperty("URL"));
	    driver.manage().window().maximize();

	}

	@After

	public void teardown() {
		driver.quit();
	}

	
	@Test
	public void test() throws Exception {
			
		wait = new WebDriverWait(driver, 15); // Explicit wait
		
		// Create an instance of FileHandler that write log to a file called app.log. Each new message will be appended at the at of the log file.
        FileHandler fileHandler = new FileHandler("app.log", true);
        logger.addHandler(fileHandler);
        
        try {
		  //vérifier que la page est correcte
	    assertEquals("LibrePlan: accès utilisateur", driver.getTitle());
	    
	    logger.info("Le titre de la page est correct");
	    //initialiser la PageConnexion
	    PageConnexion page_connexion = PageFactory.initElements(driver, PageConnexion.class);
	    	    
	    //se connecter à la page d'accueil
	    PageAccueil page_accueil = page_connexion.logIn(driver,Username,Password);
	    
	    //vérification page accueil
	    WebElement fil_d_ariane_calendrier = wait.until(ExpectedConditions.visibilityOf(page_accueil.fil_d_ariane_calendrier)); // Explicit wait
	    boolean verifPage = fil_d_ariane_calendrier.isDisplayed();

        assertTrue(verifPage);
	
	    //accéder à la page de la liste des participants
        PageListeParticipants page_liste_participants = page_accueil.clicItemParticipants(driver);
	    
        //vérification de la page liste des participants
       WebElement titre_liste_participants = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Titre_Liste_Participants)); // Explicit wait
 	   WebElement colonne_surnom = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Surnom_field));
 	   WebElement colonne_prenom = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Prenom_field));
 	   WebElement colonne_ID = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.ID_field));
 	   WebElement colonne_code = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Code_field));
 	   WebElement colonne_en_file = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.En_File_field));
 	   WebElement colonne_opérations = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Opérations_field));
 	   WebElement champ_filtre = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Filtre_Par_field));
 	   WebElement bouton_loupe = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Loupe_button));
 	   WebElement champ_détails_personnels = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Détails_personnels_field));
 	   WebElement bouton_plus_option = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Plus_Option_button));
 	   WebElement bouton_filtre = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Filtre_button));
 	   WebElement bouton_creer = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Creer_button));
 	   
 	    boolean verifPage1 = titre_liste_participants.isDisplayed()&& colonne_surnom.isDisplayed()
 	    		&& colonne_prenom.isDisplayed()&& colonne_ID.isDisplayed()
 	    		&&colonne_code.isDisplayed()&&colonne_en_file.isDisplayed()
 	    		&&colonne_opérations.isDisplayed()&&champ_filtre.isDisplayed()
 	    		&&bouton_loupe.isDisplayed()&&champ_détails_personnels.isDisplayed()
 	    		&&bouton_plus_option.isDisplayed()&&bouton_filtre.isDisplayed()
 	    		&&bouton_creer.isDisplayed();
 	    		
        assertTrue(verifPage1);
        logger.severe("La page ne vérifie pas les bonnes informations");
        
      //accéder à la page de création des participants 
 	   PageCreationParticipants page_creation_participants = page_liste_participants.clicCreerParticipants(driver);
 	   page_creation_participants.Code_field_disable_creation.click();
 	   
 	  //vérification de la page creation des participants      
 	  WebElement titre_creation_participants = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Titre_Creer_Participants));
 	  WebElement titre_onglet_données_de_base = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Titre_onglet_données_de_base));
 	  WebElement code_field_disable_creation = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Code_field_disable_creation));
 	  WebElement prenom_field_creation = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Prenom_field_creation));
 	  WebElement nom_field_creation = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Nom_field_creation));
 	  WebElement ID_field_creation = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.ID_field_creation));
 	  WebElement Option_liste_deroulante_defaut = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Option_liste_deroulante_defaut_creation));
 	  WebElement bloc_utilisateur_lie = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Bloc_utilisateur_lie));
 	  WebElement bouton_radio_non_lie = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Bouton_radio_non_lie));
 	  WebElement bouton_radio_utilisateur_existant = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Bouton_radio_utilisateur_existant));
 	  WebElement bouton_radio_creer_nouvel_utilisateur = wait.until(ExpectedConditions.visibilityOf(page_creation_participants.Bouton_radio_creer_nouvel_utilisateur));
 	  
 	  boolean verifPage2 = titre_creation_participants.isDisplayed()&& titre_onglet_données_de_base.isDisplayed()
 			  && code_field_disable_creation.isDisplayed()&& prenom_field_creation.isDisplayed()
 			  && nom_field_creation.isDisplayed()&& ID_field_creation.isDisplayed()
 			  && Option_liste_deroulante_defaut.isDisplayed()&& bloc_utilisateur_lie.isDisplayed()
 			  && bouton_radio_non_lie.isDisplayed()&& bouton_radio_utilisateur_existant.isDisplayed()
 			  && bouton_radio_creer_nouvel_utilisateur.isDisplayed();
 	  
 			 assertTrue(verifPage2);
 			 assertEquals(page_creation_participants.Prenom_field_creation.getAttribute("value"),"");
 			 assertEquals(page_creation_participants.Nom_field_creation.getAttribute("value"),"");
 			 assertEquals(page_creation_participants.ID_field_creation.getAttribute("value"),"");
 			 assertTrue(page_creation_participants.Option_liste_deroulante_defaut_creation.isSelected());
 			 assertTrue(page_creation_participants.Bouton_radio_non_lie.isSelected());
 			 assertTrue(page_creation_participants.Case_generer_code.isSelected());
 			 
 	 //creer un participant
 		page_creation_participants.CreerParticipant(driver, Prenom, Nom, ID, Nom_utilisateur, Password_utilisateur, Email);
 		
 	//verification creation participant
 		WebElement message_participant_enregistré = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Message_participant_enregistré));
 		
 		 boolean verifPage3 = titre_liste_participants.isDisplayed()&& message_participant_enregistré.isDisplayed();
  	    		
         assertTrue(verifPage3);
         assertEquals(page_liste_participants.Verification_Nom_crée.getText(),"DU");
         assertEquals(page_liste_participants.Verification_Prénom_crée.getText(),"Jean");
         assertEquals(page_liste_participants.Verification_ID_crée.getText(),"jdu");
         
         
     //filtrer participant "Jean"
        page_liste_participants.FiltreParticipants(driver, "Jean");
         
     //vérification filtre
        WebElement verification_nom = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Verification_Nom_crée));
        WebElement verification_prenom = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Verification_Prénom_crée));
        WebElement verification_ID = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Verification_ID_crée));
        
        boolean verifPage4 = verification_nom.isDisplayed()&& verification_prenom.isDisplayed()&&verification_ID.isDisplayed();
  		
        assertTrue(verifPage4);
        assertEquals(page_liste_participants.Verification_Nom_crée.getText(),"DU");
        assertEquals(page_liste_participants.Verification_Prénom_crée.getText(),"Jean");
        assertEquals(page_liste_participants.Verification_ID_crée.getText(),"jdu");
        
      //filtre "plus d'options"
        page_liste_participants.Plus_Option_button.click();
        
      //verification filtre "plus d'options"
        WebElement periode_active_depuis = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Periode_active_depuis));
        WebElement periode_active_à = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Periode_active_à));
        WebElement type_liste_deroulante = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Type_liste_deroulante));
        
        boolean verifPage5 =periode_active_depuis.isDisplayed()&& periode_active_à.isDisplayed()&&type_liste_deroulante.isSelected();
        
        assertEquals(page_liste_participants.Periode_active_depuis.getAttribute("value"),"");
        assertEquals(page_liste_participants.Periode_active_à.getAttribute("value"),"");
        
      //retour liste participant sans filtre
        page_liste_participants.Détails_personnels_field.clear();
        page_liste_participants.Filtre_button.click();
        
      //accéder à la page 2 des participants
        page_liste_participants.Bouton_Next_Page.click();
        
      //verification page 2
        assertEquals(page_liste_participants.Numero_page_participant.getAttribute("value"),"2");
        assertEquals(page_liste_participants.Numero_page_total_participant.getText(),"/ 2");
        
      //accéder à la page 1 des participants
        page_liste_participants.Bouton_Previous_Page.click();
        
      //verification page 1
        assertEquals(page_liste_participants.Numero_page_participant.getAttribute("value"),"1");
        assertEquals(page_liste_participants.Numero_page_total_participant.getText(),"/ 2");
        
      //accéder à la dernière page
        page_liste_participants.Bouton_Final_Page.click();
        
      //verification dernière page
        assertEquals(page_liste_participants.Numero_page_participant.getAttribute("value"),"2");
        assertEquals(page_liste_participants.Numero_page_total_participant.getText(),"/ 2");
        
       //accéder à la première page
        page_liste_participants.Bouton_First_Page.click();
        
      //verification première page
        assertEquals(page_liste_participants.Numero_page_participant.getAttribute("value"),"1");
        assertEquals(page_liste_participants.Numero_page_total_participant.getText(),"/ 2");
        
      //se deconnecter de l'application
        page_liste_participants.Bouton_deconnexion.click();
        
      //vérifier que la page est correcte
	    assertEquals("LibrePlan: accès utilisateur", driver.getTitle());
	    
	  //Se connecter avec les données utilisateurs crées
	    PageTableauDeBord page_tableau_de_bord=page_connexion.logIn1(driver,"jdu","$jdumdp1");
	    
	  //affichage de la page "Mon tableau de bord"
	    WebElement titre_page_tableau_de_bord = wait.until(ExpectedConditions.visibilityOf(page_tableau_de_bord.Titre_page_tableau_de_bord)); // Explicit wait
	    boolean verifPage6 = titre_page_tableau_de_bord.isDisplayed();

        assertTrue(verifPage6);
	  
       //suppression utilisateur créer
        page_tableau_de_bord.Bouton_deconnexion.click();
        page_connexion.logIn(driver,"admin","admin");
        wait.until(ExpectedConditions.visibilityOf(page_accueil.fil_d_ariane_calendrier)); // Explicit wait  
        page_accueil.clicItemParticipants(driver);
        wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Titre_Liste_Participants));
        page_liste_participants.Bouton_suppression_utilisateur.click();
        page_liste_participants.Bouton_confirm_suppression_utilisateur.click();
        page_liste_participants.Bouton_confirm_suppression_utilisateur_lie.click();
        
        //vérification suppression utilisateur    
        WebElement message_confirmation_suppression = wait.until(ExpectedConditions.visibilityOf(page_liste_participants.Message_confirmation_suppression)); // Explicit wait
	    boolean verifPage7 = message_confirmation_suppression.isDisplayed();

        assertTrue(verifPage7); 
        } catch (Exception e) {
			PageListeParticipants.takeSnapShot(driver, PageListeParticipants.getNameFile());
			logger.info("Exception while taking screenshot "+e.getMessage());
			throw e;
		}
        
	}
}