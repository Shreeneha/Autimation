package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown {
    @FindBy(xpath = "//button[@id='dropdown-toggle-title'")
    WebElement DropDownBtn;

    public DropDown(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void DropDownClick() {
        DropDownBtn.click();
    }
}

