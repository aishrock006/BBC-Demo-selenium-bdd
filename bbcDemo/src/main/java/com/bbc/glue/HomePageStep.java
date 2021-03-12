package com.bbc.glue;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.bbc.pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class HomePageStep {
	
	private WebDriver driver;
	private HomePage homePage;
	
	@Before
	public void beforeHook()
	{
		System.out.println("Before Hook");
		
		 System.setProperty("webdriver.chrome.driver", "/home/ashish.kumar17/softwares/sts-4.8.1.RELEASE/chromedriver_linux64/chromedriver");	
		 driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 
		 homePage = new HomePage();
	}
	
	@Given("^the url for site (.*)$")
	public void open__site(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url); 
	}
	
	@Then("the browser should successfully navigated to homepage")
	public void check_navigation()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = homePage.getHomePageTitle();
		assertEquals(expectedTitle, actualTitle);
		
		driver.close();
	}
	
	
	


	
	

}
