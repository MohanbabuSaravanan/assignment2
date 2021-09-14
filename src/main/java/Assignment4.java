import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/dp/B07XJ8C8F5");
		 //product title using classname
		 String ProductTitle= driver.findElement(By.cssSelector(".a-size-large .product-title-word-break")).getText();
		 System.out.println("Product Title: "+ProductTitle);
		 //price using id
		 String ProductPrice=driver.findElement(By.cssSelector("[class*='a-size-medium a-color-price']")).getText();
		 if(ProductPrice.contains("$"))
		 {
	         System.out.println("Product Price: "+ProductPrice);
		 }
		 else
		 {	
		   System.out.println("null");
		 }
		 System.out.println("No Of Links Present in the url: "+driver.findElements(By.tagName("a")).size());//NoOfLinks
		 WebElement image = driver.findElement(By.xpath("//img[@id='landingImage']")); //url of image
		 System.out.println("URL Of the image: "+image.getAttribute("src"));

	}

}
