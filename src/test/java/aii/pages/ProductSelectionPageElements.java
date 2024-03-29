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
	
	@FindBy (xpath= "//a[normalize-space()='Voluntary Dwelling Property 1 (DP1)']")
	public WebElement productSelectionDp1;
	
	@FindBy (xpath= "//a[normalize-space()='Voluntary Dwelling Property 3 (DP3)']")
	public WebElement productSelectionDp3;
	
	@FindBy (xpath= "//a[normalize-space()='Voluntary Mobile Homeowners 3 (MHO3)']")
	public WebElement productSelectionMho3;
	
	@FindBy (xpath= "//a[normalize-space()='Golf Cart (GOC)']")
	public WebElement productSelectionGoc;
	
	@FindBy(xpath= "//a[normalize-space()='Voluntary Boat Owners (AIB)']")
	public WebElement productSelectionAib;
	
	@FindBy(xpath= "//a[normalize-space()='Takeout Homeowners (HO3)']")
	public WebElement productSelectionToho3;
	
	@FindBy(xpath= "//a[normalize-space()='Takeout Dwelling Property 1 (DP1)']")
	public WebElement productSelectionTodp1;
	
	@FindBy(xpath= "//a[normalize-space()='Takeout Dwelling Property 3 (DP3)']")
	public WebElement productSelectionTodp3;
	
	@FindBy(xpath= "//a[normalize-space()='Takeout Mobile Homeowners (MHO)']")
	public WebElement productSelectionTomho;
	
	@FindBy(xpath= "//a[normalize-space()='Takeout Manufactured Physical Damage (MHPD)']")
	public WebElement productSelectionTomhpd;
	
	@FindBy(xpath= "//a[normalize-space()='Voluntary Umbrella (UMB)']")
	public WebElement productSelectionUmb;
	
	
	public ProductSelectionPageElements() {
		PageFactory.initElements(driver, this);
	}

}
