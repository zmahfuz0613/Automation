import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Search for a Movie Name", priority = 1)
    public static void searchMovie() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        MovieDetails movieDetails = new MovieDetails(driver);

        movieDetails.enterMovieName();
//      driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Thread.sleep(1000);
        movieDetails.clickSearchButton();
    }
    @Test(testName = "Contact us", priority = 2)
    public static void contactUs() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        ContactUs contactUs = new ContactUs(driver);

        contactUs.clickContactButton();

        contactUs.enterFullName();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        contactUs.enterEmail();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        contactUs.enterMessage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        contactUs.pressSubmitButton();
    }

    }




//    @AfterSuite
//    public static void cleanUp() {
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }