package ruut.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ruut.utilities.Driver;

public abstract class BasePage {


        @FindBy(xpath = "//a[text()=' Apply ']")
        public WebElement applyBtn;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
