/**
 * Created by Faye on 2017/12/28.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.thoughtworks.selenium.*;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginWeb {
    public static void main(String[] args) {
        //firefox的路径
//	        System.setProperty("webdriver.firefox.bin", "/Applications/Firefox2.app/Contents/MacOS/firefox");
//		    WebDriver driver = new FirefoxDriver();
        //chrome的路径
        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://test.haihuilai.com/static-pages/login");
        driver.manage().window().maximize();

        login("zoefengyu@163.com","12345678", driver);

//	        driver.close();


    }

    private static void login(String emailtest, String passwordtest, WebDriver driver) {
        // 练习写法，数组、打印元素，打印大小，打印元素的值
        List<WebElement> allInputs = driver.findElements(By.tagName("input"));
        System.out.println(allInputs);
        System.out.println(allInputs.size());
        for(WebElement e: allInputs){
            System.out.println(e.getAttribute("type"));
        }
        //通过elementid查找
        WebElement email1 = driver.findElement(By.id("user_email"));
        WebElement password1 =driver.findElement(By.id("user_password"));
        //输入用户名密码
        email1.sendKeys(emailtest);
        password1.sendKeys(passwordtest);
        //通过elementname查找
        WebElement btnclick=driver.findElement(By.name("commit"));
        //点击按钮
        btnclick.click();

    }
}
