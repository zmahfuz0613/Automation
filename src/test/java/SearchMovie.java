//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class SearchMovie {
//    WebDriver driver;
//
//    public final String Movie_Name = "Movie Name";
//    @FindBy(id = "search-input")
//    public WebElement movie_name;
//
//    @FindBy(xpath = "//ul[@class=\"search-suggest list-group list-group-flush\"]/li[1]//a")
//    public WebElement search_button;
//
//    @BeforeClass
//    public void openBrowser() {
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//        driver = new ChromeDriver();
//
//    }
//
//    @Test
//    public void verifyPageUrl() {
//        driver.get("https://momedia.netlify.app/movies");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//    }
//
//
//
//
//
//}
