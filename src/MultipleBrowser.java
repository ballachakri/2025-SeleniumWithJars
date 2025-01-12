import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

    public static void main(String[] args)  {

            WebDriver driver=new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            String title=driver.getTitle();
            Assertions.assertThat("Swag Labs").endsWithIgnoringCase(title);
            driver.quit();


            WebDriver driver1=new FirefoxDriver();
            System.out.println(driver1);
            driver1.get("https://www.saucedemo.com/");
            driver1.manage().window().maximize();
            String title1=driver1.getTitle();
            Assertions.assertThat("Swag Labs").endsWithIgnoringCase(title1);
            driver1.quit();

            WebDriver driver2=new EdgeDriver();
            driver2.get("https://www.saucedemo.com/");
            driver2.manage().window().maximize();
            String title2=driver1.getTitle();
            Assertions.assertThat("Swag Labs").endsWithIgnoringCase(title2);
            driver2.quit();

    }
}