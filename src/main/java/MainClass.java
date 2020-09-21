import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin-PC\\IdeaProjects\\test-selenium\\drivers\\geckodriver.exe");
        //WebDriver (импортируем класс в интайдиа) - это класс селениума. назовем наш драйвер driver
        //Atr Enter для импорта класса
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev");
        //Потом запускаем класс и метод в нем
    }
}
