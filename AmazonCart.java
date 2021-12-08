package Task;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonCart{
   static void addToCart() throws InterruptedException {



      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
          //driver.manage().window().maximize();
          driver.get("http://www.amazon.in");

          WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
          searchBox.sendKeys("Iphone 13");
          Thread.sleep(8000);

          WebElement button = driver.findElement(By.id("nav-search-submit-button"));
          button.click();

          WebElement Phone = driver.findElement(By.linkText("Apple iPhone 13 (512GB) - Midnight"));
          Phone.click();

       Thread.sleep(3000);

          WebElement cartButton = driver.findElement(By.id("add-to-cart-button"));
          cartButton.click();

          driver.quit();

   }

    public static void main(String[] args) throws InterruptedException {
        addToCart();
    }
}