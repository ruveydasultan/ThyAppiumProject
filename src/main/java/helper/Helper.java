package helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class Helper {
    public static AppiumDriver<MobileElement> driver;


    public void click(By byElement){
        driver.findElement(byElement).click();
    }
    public void sendKeys(By byElement, String text) {
        driver.findElement(byElement).sendKeys(text);
    }
    public List<MobileElement> elementList(By byElement){
        return driver.findElements(byElement);
    }
    public MobileElement getElement(By byElement){
        return driver.findElement(byElement);
    }

    public int randomElement(By element){
        List<MobileElement> elements = driver.findElements(element);
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements.size());
        return randomNumber;
    }
}
