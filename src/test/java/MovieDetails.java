import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MovieDetails extends PageObject{


    public final String Movie_Name = "Hard kill";



    @FindBy(id = "search-input")
    public WebElement movie_name;

    @FindBy(xpath = "//ul[@class=\"search-suggest list-group list-group-flush\"]/li[1]//a")
    public WebElement search_button;

       public MovieDetails(WebDriver driver) {
           super(driver); //To invoke the constructor of immediate parent class.
       }

       public void enterMovieName() {
           this.movie_name.sendKeys(Movie_Name);
       }

       public void clickSearchButton() {
           this.search_button.click();
       }


//    String getTtitle = driver.findElement(By.xpath("//div[@class=\"col-md-8 px-0\"]/h1")).getText();
//      System.out.println(getTtitle);
//
//    String trailer = driver.findElement(By.xpath("//header[@class=\"jumbotron p-3 p-md-3 text-white rounded bg-dark\"]//h3[1]")).getText();
//        System.out.println(trailer);
//
//
//    WebElement firstActor = driver.findElement(By.xpath("(//button[@class=\"ButtonLink open-model-link\"])[3]"));
//
//    String jesse = firstActor.getText();
//       firstActor.click();
//        System.out.println(jesse);
}
