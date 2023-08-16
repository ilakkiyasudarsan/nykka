package selenium;

public class prgm1 {
	public static void main(String[] args) {
		chromeDriver driver=chromeDriver driver();
		driver.get("file:///c:user/lenovo/desktop/");
		driver.findElement(by.cssselector("a[name='n2']")).click();
		
	}

}
