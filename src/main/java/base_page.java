import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class base_page {
    protected WebDriver driver;
    public base_page(WebDriver driver){
        this.driver =driver;
    }
    public WebElement find (By locator){
        return driver.findElement(locator);
    }
    public void  click (By locator){
        find(locator).click();
    }



    public void type(By locator, String text){
        find(locator).sendKeys(text);
    }
    public boolean isSelected(By locator){
        return find(locator).isSelected();
    }
    public void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Saniye cinsinden bekleme
        } catch (InterruptedException e) {
            e.printStackTrace(); // Hata durumunda yığın izini yazdır
        }
    }

}
