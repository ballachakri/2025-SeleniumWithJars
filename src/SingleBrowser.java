import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleBrowser {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        Assertions.assertThat("Swag Labs").endsWithIgnoringCase(title);
        driver.quit();
    }
}