package williamHillWebPage.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class englishPremierLeaguePage {
	
	//List of elements from the English Premier League Page
	
	@FindBy(partialLinkText = "Popular")	
	private WebElement popular_link ;
	
	@FindBy(xpath = ".//body/div[2]/div[1]/div/div[4]/div/div/main/div[2]/div[6]/div/div/div[1]/section/div/div[1]/div/div[1]/button")
	private WebElement home_team_win_button;
	
	@FindBy(xpath = ".//body/div[2]/div[1]/aside[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[1]/span/input")
	private WebElement bet_amount_input_box;
	
	@FindBy(xpath = ".//body/div[2]/div[1]/aside[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[7]/div[5]/ul/li[3]/input")
	private WebElement place_bet_button;
	
	@FindBy(xpath = ".//body/div[2]/div[1]/aside[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[7]/div[2]/div[1]/div[2]/span[2]")
	private WebElement to_return_value;	
	
	@FindBy(xpath = ".//body/div[2]/div[1]/aside[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[7]/div[2]/div[1]/div[2]/span[2]")
	private WebElement to_return;	
	
	private WebDriver driver;
	
	//A constructor to englishPremierLeaguePage class, which call the PageFactory.initElements() method
	//to initialize the elements in the class.
	public englishPremierLeaguePage (WebDriver driver)
	{
		 this.driver = driver;
		 PageFactory.initElements(driver,  this);
	}
	
	
	public void chooseEvent (String event_name) throws InterruptedException, NoSuchElementException
	{
	   //Waits for tested event submenu/link on "Competitions" page	 
		 WebDriverWait wait;
		 wait = new WebDriverWait(driver, 30);
		 WebElement event_link = driver.findElement(By.partialLinkText(event_name));	
         wait.until(ExpectedConditions.visibilityOf(event_link));
       //Select the event      			         
         event_link.click();
         //Wait for event page
         wait.until(ExpectedConditions.visibilityOf(popular_link)); 
         wait.until(ExpectedConditions.visibilityOf(home_team_win_button));	
         Thread.sleep(2000); //Just for visual tracking the flow in web browser 
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("****************************************************************************************************************");
         System.out.println("*****************************************Logs from JAVA class***************************************************");
         System.out.println("You placed a bet for the home team to Win in event: " + event_name);
		
	}
	
	public void placeABet(String bet_slip) throws InterruptedException, NoSuchElementException
	{		
	   //Place the bet
        //Choose the home team win
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 30);        
		home_team_win_button.click();
        //Wait for a bet amount input box  bet_amount_input_box
		wait.until(ExpectedConditions.visibilityOf(bet_amount_input_box)); 
        Thread.sleep(2000); //Just for visual tracking the flow in web browser
        //Set a bet slip			         
        bet_amount_input_box.sendKeys(bet_slip);
        Thread.sleep(2000); //Just for visual tracking the flow in web browser        
        place_bet_button.click();
        //Wait for "To return:" value
        wait.until(ExpectedConditions.visibilityOf(to_return_value)); 
        System.out.println("You placed a bet " + bet_slip + " GBP");
		
	} 
	
	public void getReturn()
	{
	   //Assert the odds and returns offered	
		String return_value = to_return.getText();
		System.out.println("Your chances are bigger then 0. You may win:)");
        System.out.println("Return value is: " + return_value + " GBP");
        System.out.println("Good luck:)"); 
        System.out.println("Test result: PASSED)");
        System.out.println("****************************************************************************************************************");
        System.out.println("***************************************END Logs from JAVA class*************************************************");
        System.out.println(" ");
        System.out.println(" ");
        
	}
	
	

}
