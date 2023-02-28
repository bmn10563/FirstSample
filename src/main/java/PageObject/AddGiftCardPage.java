package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddGiftCardPage {

	WebDriver driver;
	
	public AddGiftCardPage(WebDriver driver) {
		this.driver=driver;
		
	}

	By salesIcon= By.linkText("Sales");
	By gifcardIcon= By.xpath("//p[normalize-space()='Gift cards']");
	By addNewButton= By.linkText("Add new");
	By generateCodeButton= By.id("generateCouponCode");
	By principleEmail= By.name("RecipientEmail");
	By saveBtn= By.name("save");
	By savaAndEdith= By.name("save-continue");
	By msg= By.name("Message");
	By giftCardType=By.name("GiftCardTypeId");
	By price= By.xpath("(//span[@class='k-icon k-i-arrow-60-up'])[1]");
	By Isgiftcardactivated= By.id("IsGiftCardActivated");
	By RecipientsName= By.id("RecipientName");
	By senderName= By.name("SenderName");
	By senderEmail= By.name("SenderEmail");

	
	
	// create methods ---------------------------------
	public void clickSalesBtn() {
	
		driver.findElement(salesIcon).click();

	}
	public void ClickgifcardIcon() {
		driver.findElement(gifcardIcon).click();

	} public void clickaddNewButton() {
		driver.findElement(addNewButton).click();
		
	}
	public void setTypeCard() {
		Select cls=new Select(driver.findElement(giftCardType));
		cls.selectByVisibleText("Virtual");
	}
	public void setIsgiftcardactivated() {
		driver.findElement(Isgiftcardactivated).click();
	}
	public void clickGenerate() {
		driver.findElement(generateCodeButton).click();
	}
	
	
	public void setprice(String totall ){
		driver.findElement(price).click();
	}
	public void setRecipientsName(String name) {
		driver.findElement(RecipientsName).sendKeys(name);
	}
	
	public void enterPrincipleEmail(String email) {
		driver.findElement(principleEmail).sendKeys(email);
		
	}
	public void enterSenderName(String sender) {
		driver.findElement(senderName).sendKeys(sender);
	}
	public void enterSenderEmail(String sendermail) {
		driver.findElement(senderEmail).sendKeys(sendermail);
	}
	
	public void entermsg(String massege) {
		driver.findElement(msg).sendKeys(massege);
	}
	public void saveNewButton() {
		driver.findElement(saveBtn).click();
	}
	public void savaAndEdithBtn() {
		driver.findElement(savaAndEdith).click();
		
	}

	//chromedriver.exe package Page;
}
