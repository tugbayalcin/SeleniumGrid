import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid03
{
    public static void main(String[] args) throws MalformedURLException {
        // neden grid3'ten grid4ê gecildi, farkliliklar ne buna bakalim
        // her seyi hub dagitiyor

        DesiredCapabilities cap = new DesiredCapabilities(); // selenium grid4'te kalkti
        // istekler demek, makine ve browser secimi gibi isteklerimi tanimlayabiliyorum
        cap.setPlatform(Platform.BIG_SUR); //  burada kendi mac versiyonuna bakarak seciyorsun,
        // ANY de secebilirsin kendisi otomatik olarak platyformu algilamaya calisir
        cap.setBrowserName("chrome");
        cap.setVersion("98.0.4758.102");

        ChromeOptions options = new ChromeOptions();
        options.merge(cap);
        // ustteki 2 satir artik selenium grid4'te yok

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"),options);

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}
