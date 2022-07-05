package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath ="//input[@class='text-input search react-search-input-normal js-reload-value']")
private WebElement search;

@FindBy(xpath ="(//a[@class='fg-icon-search'])[1]")
private WebElement searchBar;

@FindBy(xpath ="//span[contains(text(),'M6702BN')]")
private WebElement productTrue;

@FindBy(xpath ="(//p[@class='button js-modal-operating fs-btn'])[4]")
private WebElement addToCart;

@FindBy(xpath ="//span[contains(text(),'Add to Cart')]")
private WebElement productAddToCart;

@FindBy(xpath ="(//a[@class='js-cartitem-count cartitem-count'])[1]")
private WebElement cart;

@FindBy(xpath ="//div[@class='cl-info']")
private WebElement showProduct;

@FindBy(xpath ="(//img[@class='lazyload'])[57]")
private WebElement imgChrome;

@FindBy(xpath ="//div[@class='btn__group']")
private WebElement addToCartMoen;

@FindBy(xpath ="//input[@class='btn__primary js-add-to-cart ']")
private WebElement addToCartMoen2;

@FindBy(xpath ="(//span[@class='count'])[1]")
private WebElement cart2;

@FindBy(xpath ="(//input[@name='updateQuantity'])[1]")
private WebElement quantityBrushNikel;

@FindBy(xpath ="(//div[@class='quantity__up quantity__button jq-qty-up'])[1]")
private WebElement addQuantityBrushNikel;

@FindBy(xpath ="(//span[@class='f-bold'])[1]")
private WebElement totalPrice;

@FindBy(xpath ="(//span[@class='f-bold'])[2]")
private WebElement eachPrice;

@FindBy(xpath ="(//div//a[@class='link-cover'])[1]")
private WebElement bathroomSinkFaucets;

@FindBy(xpath ="(//div[@class='fg-ri-search-box js-fg-searchBox']//input)[1]")
private WebElement brandSearch;

@FindBy(xpath ="//li[@class='js-rc-fg-nav-li fg-show']//label[@class='fcheckbox']")
private WebElement selectBrand;

@FindBy(xpath ="(//div[@class='Color_Finish_Category_rfbox ri-nav-content jq-refinement-items ']//label[@class='fcheckbox'])[1]")
private WebElement selectChoromes;

@FindBy(xpath ="//div[@class='word total-record']")
private WebElement message;


@FindBy(xpath ="(//div[@class='Bathroom_Faucet_Type_rfbox ri-nav-content jq-refinement-items ']//label[@class='fcheckbox'])[1]")
private WebElement selectWidespread;





public void searchForProductLandsOnCorrectProduct() throws InterruptedException {
	search.sendKeys("Moen m6702bn");
	Thread.sleep(2000);
	searchBar.click();
}
public boolean successMessageMoen() {
	if (productTrue.isDisplayed())
		return true;
	else
		return false;
}

public boolean addProductToCartFromCategoryDrop() throws InterruptedException {
	driver.get("https://www.ferguson.com/category/bathroom-plumbing/bathroom-faucets/bathroom-sink-faucets/_/N-zbq4i3");
	Thread.sleep(6000);
	addToCart.click();
	Thread.sleep(2000);
	productAddToCart.click();
	Thread.sleep(1000);
	cart.click();
	if (showProduct.isDisplayed())
		return true;
	else
		return false;
}

public void addMoenBrushedNickel() throws InterruptedException {
	searchBar.click();
	
	addToCartMoen.click();
	Thread.sleep(5000);
	}
public void addMoenChrome() throws InterruptedException {
	imgChrome.click();
	addToCartMoen2.click();
	Thread.sleep(5000);
}
public void addMultipleCartItemsAndChangeQuantity() throws InterruptedException {
	cart2.click();
	Thread.sleep(6000);
	quantityBrushNikel.click();
	Thread.sleep(2000);
	addQuantityBrushNikel.click();
	
		}
public void categoryBathroom() {
	bathroomSinkFaucets.click();
}
public void addFilterBrandAndFinish() throws InterruptedException{
	brandSearch.sendKeys("Brizo");
	selectBrand.click();
	Thread.sleep(2000);
	selectChoromes.click();

}
public boolean numberOfResults() throws InterruptedException{
	Thread.sleep(2000);
	if (message.isDisplayed())
	
		return true;
	else
		return false;
	}
public boolean facetNarrowBysResultInCorrectProductCounts() throws InterruptedException {
	Thread.sleep(2000);
	selectWidespread.click();
	if (message.isDisplayed())
		
		return true;
	else
		return false;
	}
	
}
	
		
	

	
	
	
	





