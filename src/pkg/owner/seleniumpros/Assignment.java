package pkg.owner.seleniumpros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
	
			
		//driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		//driver.close();
		
		driver.get("https://www.statefarm.com/");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		String mainMenu=driver.findElement(By.xpath("//*[@id='panel17-101137-1']/div[2]/div/p[1]")).getText();
		System.out.println(mainMenu);

		/*Actions actions=new Actions(driver);
		actions.moveToElement(mainMenu).click().build().perform();
		Thread.sleep(5000);*/
		/*List <WebElement> links= driver.findElements(By.xpath("//*[@id='finances-drop']/ul//a"));
		int count=links.size();
		for(int i=0;i<count;i++){
			WebElement ele=links.get(i);
			String text=ele.getAttribute("innerHTML");
			boolean status=ele.isEnabled();
			System.out.println("link name is "+text+"and the status is"+status);
			if(text.equalsIgnoreCase("Banking")){
				boolean sta=ele.isDisplayed();
				System.out.println("Banking  display status "+sta);
				ele.click();
				System.out.println("Clicked on banking");
				String parent1=driver.getWindowHandle();
				System.out.println(parent1);
				break;
			}
		}
		Set<String>s1=driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();

		while(I1.hasNext())
		{

		   String child_window=I1.next();

		// Here we will compare if parent window is not equal to child window then we            will close

		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/div/div[1]/div[2]/form/input")).click();
*/
		driver.close();
		}
		
		

	}
