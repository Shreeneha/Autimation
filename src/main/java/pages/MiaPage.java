package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiaPage {

    @FindBy(xpath = "(//h6[text()='Bangles'])[2]")
    WebElement BanglesBtn;

    public  MiaPage(WebDriver driver) { PageFactory.initElements(driver, this);}
    public void BanglesClick(){
        BanglesBtn.click();
    }
    public void Mia(){
        BanglesBtn.click();
    }
    }

