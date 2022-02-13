
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * 1. Launch the URL https://www.ajio.com/ 2. In the search box, type as "bags"
		 * and press enter 3. To the left of the screen under " Gender" click the "Men"
		 * 4. Under "Category" click "Fashion Bags" 5. Print the count of the items
		 * Found. 6. Get the list of brand of the products displayed in the page and
		 * print the list. 7. Get the list of names of the bags and print it
		 */
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Tota No brands count =  " + brands.size());
		System.out.println("---------List of brands--------------");

		for (WebElement sample1 : brands) {
			System.out.println("             " + sample1.getText());

		}

		List<WebElement> names = driver.findElements(By.xpath("//div[@Class='nameCls']"));
		System.out.println("-----------Names of the bags are--------------");
		for (WebElement nmm : names) {
			System.out.println("        " + nmm.getText());

		}

	}
}
