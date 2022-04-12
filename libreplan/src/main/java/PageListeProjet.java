import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageListeProjet extends PageBandeau{
	

	@FindBy(xpath="//span[.='Projet test 1']")
	private WebElement lien_DernierProjet;
	
	@FindBy(xpath="//span[.='WBS (tâches)']")
	private WebElement onglet_Tache;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/div/span/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/span/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td[5]/input")
	private WebElement input_NouvelleTache;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/div/span/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/span/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td[9]/input")
	private WebElement input_NombreHeureTache;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/div/span/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/span/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td[11]/span")
	private WebElement bouton_Ajouter;
	
	@FindBy(xpath="//span[@title='Remonter la tâche sélectionnée']")
	private WebElement bouton_Monter;
	
	@FindBy(xpath="//span[@title='Descendre la tâche sélectionnée']")
	private WebElement bouton_Descendre;
	
	@FindBy(xpath="//input[@value=\"Tache1-P1\"]")
	private WebElement select_T1;
	
	@FindBy(xpath="//input[@value=\"Tache2-P1\"]")
	private WebElement select_T2;
	
	@FindBy(xpath="//input[@value=\"Tache3-P1\"]")
	private WebElement select_T3;
	
	
	@FindBy(xpath="//input[@value=\"Tache4-P1\"]")
	private WebElement select_T4;
	
	@FindBy(xpath="//span[@title=\"Enregistrer le projet\"]")
	private WebElement bouton_save;
	
	@FindBy(xpath="/html/body/div[5]/div[3]/div/div/div/table[2]/tbody/tr/td/table/tbody/tr/td/span/table/tbody/tr[2]/td[2]")
	private WebElement bouton_saveOk;
	
	@FindBy(xpath="//td[.='Planification de projet']")
	private WebElement bouton_PlanificationProjet;
	
	@FindBy(xpath="//span[.='Détail du projet']")
	private WebElement filAriane;
	public PageListeProjet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void verifTableau() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List<WebElement> elementsTableau = driver.findElements(By.xpath("//div[@class='z-window-embedded-cnt-noborder']/div/div/table/tbody/tr/td"));
        System.out.println(elementsTableau.size());
        for(WebElement e : elementsTableau) {
        	String el = e.getText();
        	System.out.println(el);
	}
        
        

	}
	public void ajouterTache() {
		//Attente pck ca charge
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Pas de test 3
		
		lien_DernierProjet.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assert onglet_Tache.isDisplayed() == true;
		
		//Nouvelle initialisation de la page 
		PageFactory.initElements(driver, PageListeProjet.class);

		//Pas de test 4 - verif fil ariane 
		boolean arianeBol = filAriane.isDisplayed();
		assert arianeBol == true;
		
		//Pas de test 5 
		input_NouvelleTache.clear();
		input_NouvelleTache.sendKeys("Tache1-P1");
		input_NombreHeureTache.clear();
		input_NombreHeureTache.sendKeys("5");
		bouton_Ajouter.click();
		//Pas de test 6
		input_NouvelleTache.clear();
		input_NouvelleTache.sendKeys("Tache2-P1");
		input_NombreHeureTache.clear();
		input_NombreHeureTache.sendKeys("10");
		bouton_Ajouter.click();
		//Pas de test 6
		input_NouvelleTache.clear();
		input_NouvelleTache.sendKeys("Tache3-P1");
		input_NombreHeureTache.clear();
		input_NombreHeureTache.sendKeys("20");
		bouton_Ajouter.click();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Pas de test 6
		input_NouvelleTache.clear();
		input_NouvelleTache.sendKeys("Tache4-P1");
		input_NombreHeureTache.clear();
		input_NombreHeureTache.sendKeys("8");
		bouton_Ajouter.click();
		
		//Pas de test 7 - Test fleche montante descendante
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select_T1.click();
		bouton_Descendre.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select_T3.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bouton_Monter.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Pas de test 9 - Remplissage du doit débuter le
		select_T1.sendKeys(Keys.TAB, Keys.TAB,Keys.TAB + "05/04/22");
		select_T2.sendKeys(Keys.TAB, Keys.TAB,Keys.TAB + "08/04/22");
		
		//Remplissage de échéance
		select_T3.sendKeys(Keys.TAB, Keys.TAB,Keys.TAB, Keys.TAB + "03/04/22");
		select_T4.sendKeys(Keys.TAB, Keys.TAB,Keys.TAB,Keys.TAB + "05/04/22");
		bouton_save.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bouton_saveOk.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Pas de test 10
		bouton_PlanificationProjet.click();
		

		
		
	}
}