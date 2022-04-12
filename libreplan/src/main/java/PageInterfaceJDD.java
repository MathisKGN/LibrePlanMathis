import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public interface PageInterfaceJDD {
	
	
	Properties propertyJDD = SocleTechniqueClass.initScenario();
	
	
	String Username=propertyJDD.getProperty("Username");
	String Password=propertyJDD.getProperty("Password");
	String Prenom=propertyJDD.getProperty("Prénom");
	String Nom=propertyJDD.getProperty("Nom");
	String ID=propertyJDD.getProperty("ID");
	String Nom_utilisateur=propertyJDD.getProperty("Nom_utilisateur");
	String Password_utilisateur=propertyJDD.getProperty("Password_utilisateur");
	String Email=propertyJDD.getProperty("Email");
	String NomProjet=propertyJDD.getProperty("NomProjet");
	String T1=propertyJDD.getProperty("T1");
	String T2=propertyJDD.getProperty("T2");
	String T3=propertyJDD.getProperty("T3");
	String T4=propertyJDD.getProperty("T4");
	String TempsT1=propertyJDD.getProperty("TempsT1");
	String TempsT2=propertyJDD.getProperty("TempsT2");
	String TempsT3=propertyJDD.getProperty("TempsT3");
	String TempsT4=propertyJDD.getProperty("TempsT4");
	
}