package selenium.simple;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Jose Benitez
 */
public class LoginTest {

    public void main(String []args){


        String URL = "www.lottoland.ie";
        WebDriver driver = new ChromeDriver();

        driver.get(URL);



    }


}



