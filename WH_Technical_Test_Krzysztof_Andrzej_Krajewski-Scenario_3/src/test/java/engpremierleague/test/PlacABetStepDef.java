package engpremierleague.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.java.*;
import cucumber.api.java.en.*;
import williamHillWebPage.PageObjects.englishPremierLeaguePage;
import williamHillWebPage.PageObjects.whMainPage;

import static org.junit.Assert.assertEquals;

public class PlacABetStepDef {
		
	protected WebDriver driver;
	
	@Before	
    public void setUp() {
    	
	 if (!System.getProperties().containsKey("webdriver.chrome.driver")){	
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	        } 
	
	 	driver = new ChromeDriver();
	}

	@Given("the user is on English Premier League Page")
	public void theUserIsOnEnglishPremierLeaguePage() throws InterruptedException, NoSuchElementException {
	   //Create whMainPage object to call methods on it in next steps 
		whMainPage whMainPageObj = new whMainPage(driver);
		whMainPageObj.openWHMainPage();
		whMainPageObj.navigateToEnglishPremierLeaguePage();      
	}

	@When("he choose \"([^\"]*)\" from the list")
	public void heChooseEvent(String event) throws InterruptedException, NoSuchElementException {
		//Create englishPremierLeaguePage object to call methods on it in next steps 
	      englishPremierLeaguePage enPremLPageObj = new englishPremierLeaguePage(driver);
	      enPremLPageObj.chooseEvent(event);	
		
	}

	@And("he bet \"([^\"]*)\" for the home team to Win")
	public void hePlaceABet(String slip) throws InterruptedException, NoSuchElementException {
	
		//Create englishPremierLeaguePage object to call methods on it in next steps 
	      englishPremierLeaguePage enPremLPageObj = new englishPremierLeaguePage(driver);
	      enPremLPageObj.placeABet(slip);		
	}
	
	@Then("assert the odds and returns offered")
	public void assertTheOddsAndReturns() throws InterruptedException, NoSuchElementException{
		 		
    //Create englishPremierLeaguePage object to call methods on it in next steps 
      englishPremierLeaguePage enPremLPageObj = new englishPremierLeaguePage(driver);
      enPremLPageObj.getReturn();    
             
      Thread.sleep(4000);//Just for visual tracking the flow in web browser
	}
		
	@After
	public void tearDown() {
		driver.close();
	}
	
	

}
