import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;

public class calendar_selector extends base_page {

    //private static final By today = By.xpath("//span[@aria-label='Thursday, October 10, 2024']");

    public calendar_selector(WebDriver driver) {
        super(driver);
    }
    LocalDate currentTime = LocalDate.now();
    public String  get_Local_Date (){
        System.out.println(currentTime);
        return null;
    }
    public Integer  get_Local_Day (){

        int day_of_month = currentTime.getDayOfMonth();
        return day_of_month;
    }
    public String get_Local_Month (){

        String month = String.valueOf(currentTime.getMonth());
        String formattedMOnth = month.substring(0, 1) + month.substring(1).toLowerCase();
        return formattedMOnth;
    }
    public String get_Local_Week (){

        String get_day_of_week = String.valueOf(currentTime.getDayOfWeek());
        String formatted_day_of_week = get_day_of_week.substring(0, 1) + get_day_of_week.substring(1).toLowerCase();
        return formatted_day_of_week;
    }
    public void  set_Local_Time (){
        currentTime= currentTime.minusDays(1);
    }
    public String get_Months_Days (){
        String month_and_days = currentTime.getMonth()+" "+currentTime.getDayOfMonth();
        return  month_and_days;
    }






}
