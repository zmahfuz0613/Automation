import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends PageObject {


    private final String FULL_NAME = "Zunayed Mahfuz";
    private final String EMAIL = "zunayed.lm@gmail.com";
    private final String MESSAGE = "This is selenium message and I hope this works blah blah blah";

    @FindBy(xpath = "//div[@class=\"navbar-nav\"]/a[1]")
    private WebElement contact_us;

    @FindBy(id = "validationCustom01")
    private WebElement full_name;

    @FindBy(id = "validationCustom02")
    private WebElement valid_email;

    @FindBy(id = "validationCustom03")
    private WebElement text_message;

    @FindBy(xpath = "//div[@class=\"form-group\"]/button")
    private WebElement submit_button;

    public ContactUs(WebDriver driver) {
        super(driver);
    }

    public void clickContactButton() {
        this.contact_us.click();
    }

    public void enterFullName() {
        this.full_name.sendKeys(FULL_NAME);
    }

    public void enterEmail() {
        this.valid_email.sendKeys(EMAIL);
    }
    public void enterMessage() {
        this.text_message.sendKeys(MESSAGE);
    }

    public void pressSubmitButton() {
        this.submit_button.click();
    }
}