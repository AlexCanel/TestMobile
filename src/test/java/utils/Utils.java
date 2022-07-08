package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utils {

	public static AppiumDriver<WebElement> driver;

	public static void acessarBloco() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "notizen.basic.notes.notas.note.notepad");
		desiredCapabilities.setCapability("appActivity", "notizen.basic.notes.notas.note.notepad.main.SplashActivity");
		desiredCapabilities.setCapability("autoGrantPermissions", true);

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AppiumDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void scroll(int inicioX, int inicioY, int fimX, int fimY) {
		TouchAction touch = new TouchAction(driver);

		touch.press(PointOption.point(inicioX, inicioY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(35000)))
				.moveTo(PointOption.point(fimX, fimY)).release() // liberar o mouse nas cordenadas
				.perform(); // executa as a�oes
	}

	public static void swipeBaixo() {
		Dimension size = driver.manage().window().getSize();

		int inicioX = size.width / 2; // Coordenada X
		int inicioY = (int) (size.height * 0.24); // Coordenada Y

		int fimX = size.width / 2; // Coordenada X
		int fimY = (int) (size.height * 0.50);// Coordenada Y

		scroll(inicioX, inicioY, fimX, fimY);
	}

}
