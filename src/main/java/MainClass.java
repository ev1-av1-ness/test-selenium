import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin-PC\\IdeaProjects\\test-selenium\\drivers\\geckodriver.exe");
        //инициализация дров
        //путь к exe файлу
        //WebDriver (импортируем класс в интайдиа) - это класс селениума. назовем наш драйвер driver
        //Atr Enter для импорта класса
        WebDriver driver = new FirefoxDriver();

        //выставим неявное ожидание в начале программы
        //каждый раз! при поиске элемента ждет его появление
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //элемент нашелся раньше - мы начнем с ним работу

        driver.manage().window().maximize(); //открыть браузер на весь экран
        //driver.manage().window().setSize(new Dimension(900, 500));

        driver.get("https://en.wikipedia.org");

        WebElement link = driver.findElement(By.linkText("Donate")); //вот его, не лист
        //driver.findElements //не его, это лист элементов
        //используем класс WebElement для хранения вебэлементов. найдет ссылку по данному тексту и положит в переменную link
        //с ним можно делать все. Все эл на веб-странице данного класса
        //метод findElement ищет
        //класс By, который определяет метод поиска элемента
        WebElement link2 = driver.findElement(By.partialLinkText("Printable"));
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement li = driver.findElement(By.id("ca-viewsource")); //уникальный
        WebElement element = driver.findElement(By.cssSelector("#searchButton"));
        WebElement logo = driver.findElement(By.xpath("//a[@class='mw-wiki-logo']"));
        //findElement возвращает тип WebElement, поэтому инициализируем переменную класса WebElement

        //ССЫЛКИ
        //WebElement linkAbout = driver.findElement(By.xpath("//li[@id='n-aboutsite']/a]"));
        //System.out.println(linkAbout.getText());
        //linkAbout.click();

        //КНОПКИ И ТЕКСТОВЫЕ ПОЛЯ

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver"); //ввести текст в текстовое поле
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        //String searchText = driver.findElement(By.xpath("//div[@id='searchText']/input")).getText();
        //System.out.println("Text present in search field : " + searchText );
        String searchText = driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value");
        System.out.println("Text of search is : "+ searchText);
        //String text = driver.findElement(By.tagName("div")).getText();
        //System.out.println("Text present in span : "+ text);

        //считать строку с текстового поля - метод getAttribute()
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();



        driver.get("https://github.com/");



        driver.findElement(By.xpath("//input[@id='user[login]']")).sendKeys("testusername");
        driver.findElement(By.xpath("//input[@id='user[password]']")).sendKeys("testpass");
        WebElement button;
        button = driver.findElement(By.xpath("//div[@class='rounded-1 text-gray bg-gray-light py-4 px-4 px-md-3 px-lg-4']/form/button"));
        if(button.getText().equals("Sign up for GitHub")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }

        driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[1]/div/div/div[1]/p/a[2]")).click();
        //текст с кнопки
        //button.submit();



        //type=submit --> submit()


//        driver.get("https://www.google.com");
//        //Потом запускаем класс и метод в нем
//        //альтернатива driver.get() это driver.navigate().to("URL")
//        driver.navigate().to("https://www.selenium.dev");
//        driver.navigate().back(); //мы должны будем вернуться на предыдущую страницу
//        driver.navigate().forward(); //вернуться на страницу вперед
//        driver.navigate().refresh(); //перезагрузить страницу
//
//        System.out.println(driver.getTitle());//метод для получения текста, который в закладке браузера
//        System.out.println(driver.getCurrentUrl()); //получить ссылку на страницу
//        //получить и вывести в консоль

        //driver.quit(); //закрыть браузер


        /*2. Неявное ожидание
        (Implicit Wait)
        //действие раньше чем элемент появляется на странице -
        и падает с ошибкой
        ожидание, его значение 10 с
        при каждом поиске элемента вебдрайвер будет ждать 10 с
        время истечет - ошибка с кодом 1
        */

        /*
        Чек-боксы и радиобаттоны
        Могут быть checked/unchecked
        Радиобаттон только 1 выделить
        .click() выделить
        .click() снять выделение
        метод, который позволяет узнать, выделен ли наш чекбокс/радиобаттон или нет
        https://www.guru99.com/xpath-selenium.html
         */

    }
}
