import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class details_and_save extends base_page{

    public details_and_save(WebDriver driver) {
        super(driver);
    }

        private static final By detail_table_button = By.xpath("//button[@class='btn btn-light me-1']");
        private static final By show_more_button = By.xpath("//button[@class='btn btn-primary ms-auto']");
    private static final By close_button = By.xpath("(//button[@class='btn-close' and @data-bs-dismiss='modal'])[2]");



//    public void click_Detail_table() {
//        try_page.detailsAndSave.click(detail_table_button);
//    }
    public void click_close_table() {
        try_page.detailsAndSave.click(close_button);
    }
//    public void click_show_more() {
//        try_page.detailsAndSave.click(show_more_button);
//    }
    public int count = 0 ;
    public void read_the_table() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

// click_Detail_table() yerine
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-light me-1']"));
        js.executeScript("arguments[0].click();", button);



        if ( count<2 ){ wait.until(ExpectedConditions.visibilityOfElementLocated(show_more_button)).click();
            count++;
        }


// Sabit 2 saniye bekleme yerine, elementin görünür olmasını bekleyebiliriz




        WebElement table = driver.findElement(By.xpath("//table[contains(@class, 'table') and contains(@class, 'table-striped') and contains(@class, 'table-bordered') and contains(@class, 'table-hover') and contains(@class, 'align-middle') and contains(@class, 'mb-0')]"));


        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {

            List<WebElement> columns0 = row.findElements(By.tagName("th"));
            for (WebElement columnn : columns0){
                System.out.print(columnn.getText()+"\t");
            }
            List<WebElement> columns = row.findElements(By.tagName("td") );
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }
            System.out.println();
        }


        click_close_table();

    }
}
