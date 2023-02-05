package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utill.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {

    public static WebDriver driver;
    public Properties prop;

   public WebTestBase() {
       try {


           FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.directory", "C:src/main/resources/properties/config.properties"));
           prop = new Properties();
           prop.load(fileInputStream);
       }catch (Exception e){
           e.printStackTrace();
       }
   }
    public void initialization(){
    String BrowserName = prop.getProperty("browser");
    if (BrowserName.equals("chrome")) {
        System.setProperty("webdriver.chrome.driver", (System.getProperty("user.directory", "src/main/resources/drivers/chromedriver_win32/chromedriver.exe")));
        driver = new ChromeDriver();
    } else{
        System.out.println("select correct browser name");
    }
    driver.navigate().to(prop.getProperty("url"));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(utility.PAGE_LOAD_TIMEOUT));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utility.IMPLICITLY_WAIT));
    driver.manage().deleteAllCookies();
    }
}
