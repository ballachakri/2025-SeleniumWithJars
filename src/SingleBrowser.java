import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleBrowser {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assertions.assertThat("Swag Labs").endsWithIgnoringCase(title);
        WebElement userNameTextField = driver.findElement(By.cssSelector("input[name=user-name]"));
        WebElement passwordTextField = driver.findElement(By.cssSelector("input[name=password]"));
        WebElement loginButton = driver.findElement(By.cssSelector("input[name=login-button]"));
        userNameTextField.sendKeys("standard_user");
        passwordTextField.sendKeys("secret_sauce");
        loginButton.click();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertThat("https://www.saucedemo.com/inventory.html").isEqualToIgnoringCase(currentUrl);
        driver.quit();
    }
}