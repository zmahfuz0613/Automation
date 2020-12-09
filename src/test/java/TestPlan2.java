//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class TestPlan2 {
//    private static final WebDriver driver = new ChromeDriver();
//
//    @BeforeSuite
//    public static void main(String[] args) {
//        // ChromeDriver location set up in Utils class
//        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
//    }
//
//    @Test(testName = "Contact us", priority = 2)
//    public static void contactUs() throws InterruptedException {
//        driver.get(Utils.BASE_URL);
//        ContactUs contactUs = new ContactUs(driver);
//
//        contactUs.clickContactButton();
//
//        contactUs.enterFullName();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        contactUs.enterEmail();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        contactUs.enterMessage();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        contactUs.pressSubmitButton();
//    }
//}