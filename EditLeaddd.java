package week2.day1;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class EditLeaddd {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			
	       String title = driver.getTitle();
	       System.out.println(title);
	        WebElement username = driver.findElement(By.id("username"));
	        username.sendKeys("DemoSalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sugathi");
	         driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	       
	         System.out.println("The title is:" +driver.getTitle());
	        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a")).click();
	       
	        
	        driver.findElement(By.xpath("//a[text()='Edit']")).click();
	      
	        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
	        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TestLeaffffff");
	        
	        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	        
	        driver.close();
	 
		 
	 }
		

}
