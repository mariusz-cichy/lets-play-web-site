package pl.emcea.letsplaywebsite;

import cucumber.api.java.pl.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.web.server.LocalServerPort;


public class LoginSteps extends SpringBootCucumberBase {
    @LocalServerPort
    private int port;

    WebDriver driver = null;

    @Zakładającże("użytkownik ma otwartą przeglądarkę")
    public void użytkownik_ma_otwartą_przeglądarkę() {
        System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @I("wszedł na witrynę internetową")
    public void wszedłNaWitrynęInternetową() {
        driver.navigate().to("http://localhost:"+port);
    }

    @Jeżeli("zaloguje się na przy pomocy poprawnego loginu i hasła")
    public void zalogujeSięNaPrzyPomocyPoprawnegoLoginuIHasła() {
        driver.navigate().to("http://localhost:"+port+"/login");
        driver.findElement(By.id("username")).sendKeys("mariusz.cichy@mcpm.pl");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("password")).sendKeys("ABCabc123");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form[1]/fieldset/div[3]/input")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Wtedy("będzie mógł zrobić zakupy")
    public void będzieMógłZrobićZakupy() {
        driver.close();
    }
}
