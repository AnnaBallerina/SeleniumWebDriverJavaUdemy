import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

    public static void main(String[] args) {

//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Documents\\udemy_courses\\Drivers\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}
