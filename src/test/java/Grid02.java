import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid02
{
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new SafariOptions());
        // burada biz chrome ile calıstır demis olduk
        // safari ile calıssin isteseydik new SafariOptions() secmeliydin
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}
