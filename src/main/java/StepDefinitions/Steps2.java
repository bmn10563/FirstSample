package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Steps2 extends Base{

	WebDriver driver;
	//@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/javasource/javaworkspacenew/Ecommerc/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser()  {

		epage= new ecommercPage(driver);

	}

	@When("user open the Url\"https:\\/\\/admin-demo.nopcommerce.com\\/login?ReturnUrl=%2Fadmin%2F\"")
	public void user_open_the_url_https_admin_demo_nopcommerce_com_login_return_url_2fadmin_2f() {


	}

	@When("User enter username {string} and enter password {string}")
	public void user_enter_username_and_enter_password(String user, String pass) {
		epage.setEmail(user);
		epage.setPassword(pass);}
		

	@And("user enter login button")
	public void user_enter_login_button() {
		epage.enterLoginBtn();
	}

	@Then("the title page should be {string}")
	public void the_title_page_should_be(String title)  {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());	
		}
	}

	@When("user enter logout button")
	public void user_enter_logout_button() throws InterruptedException {
		epage.enterLogoutBtn();
		Thread.sleep(2000);

	}

	@Then("close browser")
	public void close_browser() {

	}
	// add new gift ####################################################
	@Then("^User can view Dashboard$")
	public void user_can_view_dashboard() throws Throwable {
		addgift= new AddGiftCardPage(driver);

	}

	@Then("^User navigate to gftcard page$")
	public void user_navigate_to_gftcard_page() throws Throwable {

	}

	@And("^User enter Sales Icon$")
	public void user_enter_sales_icon() throws Throwable {
		addgift.clickSalesBtn();
	}

	@And("^User enter Gift card Icon and Click Add new Button$")
	public void user_enter_gift_card_icon_and_click_add_new_button() throws Throwable {
		addgift.ClickgifcardIcon();
		addgift.clickaddNewButton();
	}

	@And("^user Enter gift card information$")
	public void user_enter_gift_card_information() throws Throwable {
		String principlemail= generateRandomString(6)+"@gmail.com";

		addgift.enterPrincipleEmail(principlemail);
		addgift.clickGenerate();
		addgift.setTypeCard();
		
		addgift.setIsgiftcardactivated();

		
		addgift.setRecipientsName("Stive");
				String sender= generateRandomString(8)+"@yahoo.com";
		addgift.enterSenderEmail(sender);
		addgift.enterSenderName("Kris");
		addgift.entermsg("thats finished");
	}

	@And("^User enter save button for save information$")
	public void user_enter_save_button_for_save_information() throws Throwable {
		addgift.savaAndEdithBtn();
		boolean expect= driver.getPageSource().contains("The new gift card has been added successfully");
		Assert.assertEquals(true, expect);
	}








}