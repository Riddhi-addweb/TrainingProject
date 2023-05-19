package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Hooks
{
   private WebDriver driver;

    @Before(order = 0)
    public void SetUp() throws InterruptedException, IOException {
        System.out.println("-------------------------");
        System.out.println("Starting Of The Scenario.");
        System.out.println("-------------------------");
        System.setProperty("web-driver.chrome.driver", System.getProperty("user.dir") + "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://ttstage.addwebprojects.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[1]/input[1]")).sendKeys("saurabhdhariwal.com@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/div[1]/input")).sendKeys("addweb123");
        Thread.sleep(1000);

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Login.png"));
        Thread.sleep(2000);
        System.out.println("Login Page Screenshot is captured");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/div/h2")).getText();
        Thread.sleep(3000);
    }

    @After(order = 1)
    public void TearDown() throws InterruptedException
    {
        System.out.println("-----------------------");
        System.out.println("Ending Of The Scenario.");
        System.out.println("-----------------------");
        driver.quit();
        Thread.sleep(2000);
    }



//    @BeforeStep(order = 1)
//    public void BeforeStep()
//    {
//        System.out.println("-----------------------------------------------");
//        System.out.println("----- This will run before every Scenario -----");
//        System.out.println("-----------------------------------------------");
//    }
//    @AfterStep(order = 1)
//    public void AfterStep(){
//        System.out.println("----------------------------------------------");
//        System.out.println("----- This will run after every Scenario -----");
//        System.out.println("----------------------------------------------");
//    }

    public WebDriver getDriver()
    {
        return driver;
    }
}