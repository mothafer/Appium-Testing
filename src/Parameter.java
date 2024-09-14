import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class Parameter {
	
	
	
public void takeScreenShotFunction (AndroidDriver driver ) throws IOException {
	Date date = new Date(); 
String  fileName = date.toString().replace(":", "-");

	TakesScreenshot ts = (TakesScreenshot) driver;

	File file = ts.getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(file, new File("./src/Pictures/"+fileName+".jpg"));
}



}