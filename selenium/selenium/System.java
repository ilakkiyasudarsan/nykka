package selenium;

public class hi{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}
	

}
