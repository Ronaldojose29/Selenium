package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class primera_prueba {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		//inserta tu código aquí Thread.sleep(5000);
		WebElement buscar = driver.findElement(By.id("twotabsearchtextbox"));
		buscar.sendKeys("Call Of Duty Modern Warfer 2");
		buscar.submit();
		Thread.sleep(5000);
		driver.quit();
}
}
