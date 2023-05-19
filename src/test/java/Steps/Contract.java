package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Contract
{
    WebDriver driver;


    public Contract(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }

    @Given("User is on the Dashboard sidebar menu")
    public void userIsOnTheDashboardSidebarMenu() {
    }

    @When("User clicks on the Work dropdown")
    public void userClicksOnTheWorkDropdown() throws InterruptedException
    {
        System.out.println("User clicks on the Work dropdown");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(1000);
    }

    @And("User clicks on Contract Module")
    public void userClicksOnContractModule() throws InterruptedException
    {
        System.out.println("User clicks on Contract Module");
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[1]")).click();
        Thread.sleep(1000);
    }

    @Then("User is navigated to Contract Module page")
    public void userIsNavigatedToContractModulePage() {
    }

    @Given("The user is on the Add Contract window")
    public void theUserIsOnTheAddContractWindow()
    {
        System.out.println("The user is on the Add Contract window");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div/a")).click();
    }

    @When("User can enter all data in given fields")
    public void userCanEnterAllDataInGivenFields() throws InterruptedException {
        System.out.println("User can enter all data in given fields");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")).sendKeys("Test 1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input")).sendKeys("03-02-2023");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input")).sendKeys("03-02-2024");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/button/div/div/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/div/div[2]/ul/li[2]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/input")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div/div[1]/button/div/div/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div/div[1]/div/div[2]/ul/li[2]/a/span")).click();
        Thread.sleep(5000);
    }

    @And("User will click on Save button")
    public void userWillClickOnSaveButton() throws InterruptedException, IOException {
        System.out.println("User click on Save button");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click();

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Contract_Data.png"));
        Thread.sleep(2000);
        System.out.println("Contract Data Page Screenshot is captured");
        Thread.sleep(5000);
    }

    @Then("The contact is successfully saved")
    public void theContactIsSuccessfullySaved()
    {
        System.out.println("The contact is successfully saved");
    }

    @And("User can see the added contract on Contract page")
    public void userCanSeeTheAddedContractOnContractPage()
    {
        System.out.println("User can see the added contract on Contract page");
    }
}
