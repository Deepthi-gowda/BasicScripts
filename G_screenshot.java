package Generic_method;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_screenshot {

	public static void getPhoto(WebDriver a) 
	{
		String photos = "./photos/";
    Date d1 = new Date();
String d = d1.toString();
String date = d.replaceAll(":", "-");
File src = ((TakesScreenshot) a).getScreenshotAs(OutputType.FILE);
 File dst = new File(photos+date+".jpeg");
 	}
	}
