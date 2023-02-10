package aii.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aii.utils.CommonMethods;

public class QuoteDwellingChevronPageElements extends CommonMethods {
	
	@FindBy(id= "Building.YearBuilt")
	public WebElement yearConstruction;
	
	@FindBy(id= "Building.SqFt")
	public WebElement squareFeet;
	
	@FindBy(id= "Building.RoofMaterial")
	public WebElement roofMetarial;
	
	@FindBy(id= "Building.MediationArbitrationInd")
	public WebElement mediationArbit;
	
	@FindBy(id= "Save")
	public WebElement saveButton;
	
	@FindBy(id= "Building.QualityGrade")
	public WebElement qualityGrade;
	
	@FindBy(id= "CalculateRCE")
	public WebElement calculateButton;
	
	@FindBy(id= "NextPage")
	public WebElement nextButton;
	
	@FindBy(id= "Building.DwellingType")
	public WebElement dwellingType;
	
	@FindBy(id= "Building.CovCLimit")
	public WebElement coverageC;
	
	@FindBy(id= "Building.NumberOfStories")
	public WebElement numberOfStories;
	
	@FindBy(id= "Building.StoryUnit")
	public WebElement storyOfUnit;
	
	
	public QuoteDwellingChevronPageElements() {
		
		PageFactory.initElements(driver, this);
	}

}
