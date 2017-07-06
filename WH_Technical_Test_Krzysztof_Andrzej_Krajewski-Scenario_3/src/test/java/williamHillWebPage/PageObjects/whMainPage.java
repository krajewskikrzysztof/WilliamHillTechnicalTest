package williamHillWebPage.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class whMainPage {
	
	//List of elements from the William Hill main web page
	private String urlMainPage = "http://sports.williamhill.com/betting/en-gb";
	
	@FindBy(css = "#desktop-sidebar-quick-links > li#nav-757776 a")	
	private WebElement football_menu ;	
	
	//Only a few elements are find by css selector - the rest are find by Xpath (or by partialLinkText) as it was faster to get Xpath from FirePath.
    //The right elements finding strategy should be choose on the basis the knowledge which elements(/page structure) change the least
    //in the particular project. Consultation with front-end developers who develop GUI would be helpful.  
	
	@FindBy(xpath = ".//body/div[2]/div[1]/aside[1]/div/ul[1]/li[5]/a")	
	private WebElement competitionsSubmenu ;
	
	@FindBy(partialLinkText = "English Premier League")	
	private WebElement english_premier_league_menu ;
		
	private WebDriver driver;
	
	
	//A constructor to whMainPage class, which call the PageFactory.initElements() method
	//to initialize the elements in the class.
	public whMainPage (WebDriver driver)
	{
		 this.driver = driver;
		 PageFactory.initElements(driver,  this);
	}

	
	public void openWHMainPage() throws InterruptedException, NoSuchElementException
	{
	   // Open the webpage	 		 		
	     driver.get(urlMainPage); 	             
	     driver.manage().window().maximize();    
	     Thread.sleep(2000); //Just for visual tracking the flow in web browser
	     //Waits for 'Football' menu
	     WebDriverWait wait;
	     wait = new WebDriverWait(driver, 30);     
	     wait.until(ExpectedConditions.visibilityOf(football_menu));		
	}
	
	
	public void navigateToEnglishPremierLeaguePage() throws InterruptedException, NoSuchElementException
	{
	   //Go to "Football" page       			        			        	       
         football_menu.click();
         //Waits for 'Competitions' submenu in "Football" menu	
         WebDriverWait wait;
	     wait = new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.visibilityOf(competitionsSubmenu));
         Thread.sleep(2000); //Just for visual tracking the flow in web browser
        
       //Go to "Competitions" page      			               		         
         competitionsSubmenu.click();
         //Waits for English Premier League submenu/link on "Competitions" page	              			         
         wait.until(ExpectedConditions.visibilityOf(english_premier_league_menu));
         Thread.sleep(2000); //Just for visual tracking the flow in web browser
        
       //Go to "English Premier League" page      			                       
         english_premier_league_menu.click();        		
         Thread.sleep(2000); //Just for visual tracking the flow in web browser		
	}
	
	
}
