package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class SignInPage extends PageObject {

	public SignInPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}	
  
  public String email = "kurtkobam" + 31243 + (int) (Math.random() * ((1000000 - 31243) + 1)) + "@gmail.com";
  
	@FindBy(id = "email_create")
	private WebElement emailAddressInput;

	@FindBy(id = "SubmitCreate")
	private WebElement submitBtn;

	@FindBy(xpath = "//*[@id='login_form']//p[@class = 'lost_password form-group']/a")
	private WebElement forgotPassword;
  
	@FindBy(id = "email")
	protected WebElement emailSignInInput;

	@FindBy(id = "passwd")
	protected WebElement passwordInput;
	
	@FindBy(id = "SubmitLogin")
	protected WebElement submitLoginBtn;
  
  public CreateAccountPage CreateAccount() {

		emailAddressInput.sendKeys(email);
		submitBtn.click();

		return new CreateAccountPage(this.driver, this.baseUrl);
	}
  
  public ForgotPasswordPage clickForgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage(this.driver,this.baseUrl);
	}
  
	public SignInPage navigate() {
		this.driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		return this;
	}

	public SignInPage enterEmail(String email) {
		emailSignInInput.sendKeys(email);
		return this;
	}

	public SignInPage enterPassword(String password) {
		passwordInput.sendKeys(password);
		return this;
	}

	public MyAccountPage clickSubmit(){
		String signInPageTitle = this.driver.getTitle();
		submitLoginBtn.click();
		if(this.driver.getTitle().equals(signInPageTitle)) {
			
		}else if(this.driver.getTitle().equals("My account - My Store")){
			return new MyAccountPage(this.driver, this.baseUrl);
		}
		return null;
  }
}
