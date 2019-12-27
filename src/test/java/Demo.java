import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\udemy_courses\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com"); // Hit url on the browser
        System.out.println(driver.getTitle()); // validate if your page title is correct

        System.out.println(driver.getCurrentUrl()); // validate if you are landed at the right url
    }

}
