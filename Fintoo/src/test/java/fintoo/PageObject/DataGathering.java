package fintoo.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DataGathering {

	public WebDriver driver;
	By addDataButton= By.xpath("//button[text()='Add data']");
	By aboutYouLink= By.xpath("//td[text()='About you']");
	By incomeTaxLink= By.xpath("//td[text()='Income tax']");
	By incomeAndExpenseLink= By.xpath("//td[text()='Income & Expenses']");
	By goalsLink= By.xpath("//td[text()='Goals']");
	By insuranceLink= By.xpath("//td[text()='Insurance']");
	By assetAndLiabilityLink= By.xpath("//td[text()='Asset & Liability']");
	By retirementLink= By.xpath("//td[text()='Retirement']");
	By documentLink= By.xpath("//td[text()='Document']");
	// Your Info locators
	By firstName= By.xpath("//input[@ng-model='user.first_name']");
	By lastName= By.xpath("//input[@ng-model='user.last_name']");
	By residentialAddress= By.id("addresscombine");
	By pinCode= By.xpath("//input[@name='pin_code']");
	By emailAddress = By.xpath("//input[@ng-model='user.email']");
	By panNo= By.xpath("//input[@name='pan']");
	By mobileNo= By.xpath("//input[@name='mobile']");
	By dOB =By.xpath("//input[@ng-model='user.dob']");
	By age = By.id("age");
	By salaryRange=By.xpath("//label[contains(text(),'10 - 25 ')]");
	By occupation = By.xpath("//span[@id='ui-id-1-button']");
	By gender= By.xpath("(//label[contains(text(),'Male')])[1]");
	By retirementAge = By.id("retirement_age");
	By lifeExpectancy = By.xpath("//input[@name='life_expectancy']");
	By remark = By.xpath("(//input[@name='remark'])[1]");
	By saveAndContinue=By.xpath("//button[text()='Save & Continue']");
	
	//Locators for know your risk
	By currentStageOfLife=By.xpath("//label[contains(text(),'Single with few financial burdens.')]");
	By nextButton = By.xpath("//button[text()='Next']");
	By saveButton= By.xpath("//button[text()='Save']");
	
	//Locators for Your Family
	public DataGathering(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	} 
	
}
