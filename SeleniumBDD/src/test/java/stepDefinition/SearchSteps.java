
/** CHECKING ROUGH
package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	@Given("Google home page is open")
	public void Google_home_page_is_open () {
		System.out.println("User on Search Page");
		
	}
	
	
	@When("Type in  Search bar")
	public void type_in_search () {
		System.out.println("User on Search Page");
		
	}
	@And("Click on Search")
	public void search () {
		System.out.println("Clicked on Search");
		
	}
	
	@Then("Search result page is visible")
	public void  result() {
		System.out.println("User on Search Result Page");
		
	}
}

*/


package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	public static WebDriver driver;
	public static WebElement srchBtn;
	@Given("Google home page is open")
	public void google_home_page_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		System.out.println("On Google home page");
	}

	@When("^Type \"([^\"]*)\" in Search bar$")		// \"([^\"]*)\"
	public void type_in_search_bar(String string) {
		System.out.println("Type " + string + " in search bar");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(string);
	}
	

	@When("Click on Search")
	public void click_on_search() {
		System.out.println("Click on search button");
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
		
	}

	@Then("Search result page is visible")
	public void search_result_page_is_visible() throws InterruptedException {
		System.out.println("On Search result page");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Then("Search result page is not visible")
	public void search_result_page_is_not_visible() throws InterruptedException {
		System.out.println("No Action takes place");
		Thread.sleep(5000);
		driver.quit();
	}
}

