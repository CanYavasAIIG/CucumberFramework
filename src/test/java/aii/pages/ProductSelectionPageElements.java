package aii.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aii.utils.CommonMethods;

public class ProductSelectionPageElements extends CommonMethods{
	
	@FindBy (id= "BasicPolicy.EffectiveDt")
	public WebElement effectiveDate;
	
	@FindBy (id= "BasicPolicy.ControllingStateCd")
	public WebElement stateDropdown;
	
	@FindBy (id= "BasicPolicy.CarrierGroupCd")
	public WebElement carrierDropdown;
	
	@FindBy (id= "Continue")
	public WebElement continueButton; 
	
	@FindBy (xpath= "//a[normalize-space()='Voluntary Homeowners (HO3)']")
	public WebElement productSelectionHo3;
	
	@FindBy (xpath= "//a[normalize-space()='Voluntary Renters (HO4)']")
	public WebElement productSelectionHo4;
	
	@FindBy (xpath= "//a[normalize-space()='Voluntary Condominium Unit Owners (HO6)']")
	public WebElement productSelectionHo6;
	
	
	
	public ProductSelectionPageElements() {
		PageFactory.initElements(driver, this);
	}

}
