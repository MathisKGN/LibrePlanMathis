import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageBandeau {
	
public WebDriver driver;
	
	public PageBandeau(WebDriver driver) {
		this.driver=driver;
	}
	
	//onglet principal du Bandeau 
	
	@FindBy (xpath="//button[contains(text(),\"Calendrier\")]")
	WebElement Onglet_Calendrier;
	
	@FindBy (xpath="//button[contains(text(),\"Ressources\")]")
	WebElement Onglet_Ressources;
	
	@FindBy (xpath="//button[contains(text(),\"Coût\")]")
	WebElement Onglet_Coût;
	
	@FindBy (xpath="//button[contains(text(),\"Config\")]")
	WebElement Onglet_Configuration;
	
	@FindBy (xpath="//button[contains(text(),\"Communication\")]")
	WebElement Onglet_Communications;
	
	@FindBy (xpath="//button[contains(text(),\"Rapport\")]")
	WebElement Onglet_Rapports;
	
	@FindBy (xpath="//button[contains(text(),\"Zone\")]")
	WebElement Onglet_ZonePersonnelle;
	
	@FindBy(xpath = "//a[@href=\"/libreplan/j_spring_security_logout\"]")
    public WebElement Bouton_deconnexion;
	
	//item de l'onglet Ressources
	
	@FindBy (xpath="//a[@href=\"/libreplan/calendars/calendars.zul\"]")
	WebElement Item_Calendrier;
	
	@FindBy (xpath="//a[@href=\"/libreplan/resources/worker/worker.zul\"]")
	WebElement Item_Participant;
	
	
	//fonction pour accéder à la page de liste des calendriers
	public PageListeCalendrier clicItemCalendrier(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//button[contains(text(),\"Ressources\")]")))
		.moveToElement(driver.findElement(By.xpath("//a[@href=\"/libreplan/calendars/calendars.zul\"]"))).click().build().perform();
		return PageFactory.initElements(driver, PageListeCalendrier.class);
		}
	
	//fonction pour accéder à la page de liste des participants
		public PageListeParticipants clicItemParticipants(WebDriver driver) {
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//button[contains(text(),\"Ressources\")]")))
			.moveToElement(driver.findElement(By.xpath("//a[@href=\"/libreplan/resources/worker/worker.zul\"]"))).click().build().perform();
			return PageFactory.initElements(driver, PageListeParticipants.class);
			}
	
	
	public boolean verifPage(WebElement nomWebEl) {
        boolean verif;
        if (nomWebEl.isDisplayed()) {
            verif = true;
        } else {
            verif = false;
        }
        return verif;
    }
	
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static String getNameFile() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		String dateNow = formatter.format(date);
		String fileName = dateNow.toString().replace(":", "_").replace(" ", "_") + ".png";

		return fileName;
	}
}