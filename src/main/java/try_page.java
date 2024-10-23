import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class try_page extends base_page{
    public static calendar_selector calendarSelector;
    public static details_and_save detailsAndSave;

    public try_page(WebDriver driver) {
        super(driver);
        driver.get("https://meteostat.net/en/place/tr/istanbul?s=17060&t=2024-10-09/2024-10-11");
       calendarSelector = new calendar_selector(driver);
       detailsAndSave = new details_and_save(driver);

    }
    private static final By date_button = By.xpath("//button[@class='btn btn-light px-4 px-md-3']");
    private static final By reject_button = By.xpath("//button[@class='btn btn-light ms-auto']");
    private static final By calendar_point = By.cssSelector("svg.vc-svg-icon:nth-of-type(1)");

    public  static  void  main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\osman\\seleniumdrivers\\chrome-driver\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);

        try_page tryPage = new try_page(driver);
        driver.manage().window().maximize();
        tryPage.click(reject_button);

        int a =53;
        while (a != 1){
            tryPage.click(date_button);
            String day = calendarSelector.get_Local_Week();
            String date = calendarSelector.get_Local_Month()+" "+calendarSelector.get_Local_Day()+", 2024";
            String xpath = String.format("//span[@aria-label='%s, %s']", day, date);
            System.out.println(xpath);
            By dynamicXpath = By.xpath(xpath);
            switch (calendarSelector.get_Months_Days()) {
                case "JANUARY 31":
                    tryPage.click(calendar_point);
                    break;
                case "FEBRUARY 28":
                    tryPage.click(calendar_point);
                    break;
                case "MARCH 31":
                    tryPage.click(calendar_point);
                    break;
                case "APRIL 30":
                    tryPage.click(calendar_point);
                    break;
                case "MAY 31":
                    tryPage.click(calendar_point);
                    break;
                case "JUNE 30":
                    tryPage.click(calendar_point);
                    break;
                case "JULY 31":
                    tryPage.click(calendar_point);
                    break;
                case "AUGUST 31":
                    tryPage.click(calendar_point);
                    break;
                case "SEPTEMBER 30":
                    tryPage.click(calendar_point);
                    break;
                case "OCTOBER 31":
                    tryPage.click(calendar_point);
                    break;
                case "NOVEMBER 30":
                    tryPage.click(calendar_point);
                    break;
                case "DECEMBER 31":
                    tryPage.click(calendar_point);
                    break;
                default:
                    System.out.println("Invalid date.");
                    break;
            }
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(dynamicXpath));
            element.click();
            WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(dynamicXpath));
            element1.click();
            detailsAndSave.read_the_table();
            Thread.sleep(10000);
            calendarSelector.set_Local_Time();
            --a;
        }




    }

}
