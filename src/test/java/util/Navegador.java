package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Navegador {
    public static WebDriver retornarNavegador() throws IOException, InterruptedException {

        String folderUser = System.getProperty("user.name");
        System.setProperty("webdriver.chrome.driver", "/home/"+folderUser+"/drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        System.out.println("iniciar o abrir");

        driver.get("https://orcamento.justos.com.br/?utm_source=null&utm_medium=null&utm_campaign=null&utm_campaign_id=null&utm_adset=null&utm_adset_id=null&utm_content=null&utm_content_id=null&utm_term=null&utm_term_id=null&utm_match_type=null&gclidnull&fbclidnull&referrer=https://www.google.com/&c=null&pid=null&af_adset=null&af_ad=null&is_from_website=true&_ga=2.72659603.1476102919.1674568687-6803957.1674568686#/step/cpf");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;


    }
}
