package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class pgm61 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Runtime.getRuntime().exec("Notepad");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_J);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_U);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_8);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_8);
		Thread.sleep(2000);
	}

}
