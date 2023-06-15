package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class TimeLogs
{
    WebDriver driver;

    public TimeLogs(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }

    @Given("User is on dashboard page")
    public void user_is_on_dashboard_page()
    {
        System.out.println("User is on dashboard page");
    }
    @When("User clicks on Work menu")
    public void user_clicks_on_work_menu() throws InterruptedException {
        System.out.println("User clicks on Work menu");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(2000);
    }
    @And("User clicks on Time Logs sub menu")
    public void user_clicks_on_time_logs_sub_menu() throws InterruptedException {
        System.out.println("User clicks on Time Logs sub menu");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[4]")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[4]")).click();
        Thread.sleep(3000);
    }
    @Then("User is redirect on the time Logs page")
    public void user_is_redirect_on_the_time_logs_page() {
        System.out.println("User is redirect on the time Logs page");
    }
    @Given("User is on time log page")
    public void userIsOnTimeLogPage()
    {
        System.out.println("User is on time log page");
    }
    @And("User can see the log time button")
    public void userCanSeeTheLogTimeButton()
    {
        System.out.println("User can see the log time button");
    }
    @When("User clicks on log time button")
    public void userClicksOnLogTimeButton() throws InterruptedException
    {
        System.out.println("User clicks on log time button");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#table-actions >a")));
        driver.findElement(By.cssSelector("#table-actions > a")).click();
        Thread.sleep(2000);
    }
    @Then("User is navigated to log time Page")
    public void userIsNavigatedToLogTimePage()
    {
        System.out.println("User is navigated to log time Page");
    }
    @Given("User is on time log details page")
    public void userIsOnTimeLogDetailsPage()
    {
        System.out.println("User is on time log details page");
    }
    @When("User fills up all the require details")
    public void userFillsUpAllTheRequireDetails() throws InterruptedException {
        System.out.println("User fills up all the require details");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[1]/div/div/button")));
        driver.findElement(By.xpath(" /html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[1]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[1]/div/div/select/option[3]")).click(); //project
        Thread.sleep(2000);

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#save-timelog-data-form > div > div.row.p-20 > div.col-md-12 > div:nth-child(1) > div:nth-child(2) > div > div > button")));
        driver.findElement(By.cssSelector("#save-timelog-data-form > div > div.row.p-20 > div.col-md-12 > div:nth-child(1) > div:nth-child(2) > div > div > button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[2]/div/div/select/option[2]")).click(); //Task
        Thread.sleep(2000);

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/button")).click();
        WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/select/option[2]")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[1]/div[3]/div/div/select/option[2]")).click(); //employee
        Thread.sleep(2000);

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[2]/div[5]/div/div/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[2]/div[5]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div[2]/div[5]/div/div/div/div[2]/ul/li[3]")).click(); //hour
        Thread.sleep(2000);

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")).sendKeys("Test");
        Thread.sleep(2000);
    }
    @And("User clicks on save button")
    public void userClicksOnSaveButton() throws InterruptedException, IOException {
        System.out.println("User clicks on save button");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/button[1]")).click();
        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Timelog_Data.png"));
        Thread.sleep(2000);
        System.out.println("TimeLogs Data Page Screenshot is captured");
        Thread.sleep(5000);
        Thread.sleep(1000);
    }
    @Then("User is redirect on Time Logs page")
    public void userIsRedirectOnTimeLogsPage() throws InterruptedException
    {
        System.out.println("User is redirect on Time Logs page");
        //driver.get("https://ttstage.addwebprojects.com/account/timelog");
        Thread.sleep(700);
    }


    //Delete
    @Given("User is on time logs page")
    public void userIsOnTimeLogsPage() throws InterruptedException
    {
        System.out.println("User is on time log page");
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click(); //work
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[4]")).click(); //time log
//        Thread.sleep(3000);
    }

    @When("User clicks on the drop-down menu link")
    public void userClicksOnTheDropDownMenuLink() throws InterruptedException
    {
        System.out.println("User clicks on the drop-down menu link");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/div/a/i")).click();
        Thread.sleep(1000);
        //System.out.println("drop-down icon");
    }
    @And("User clicks on the Edit menu")
    public void userClicksOnTheEditMenu() throws InterruptedException
    {
        System.out.println("User clicks on the Edit menu");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/div/div/a[2]")).click();
        Thread.sleep(2000);
    }
    @And("User updates a data")
    public void userUpdatesAData() throws InterruptedException
    {
        System.out.println("User updates a data");
        Thread.sleep(2000);
        WebDriverWait ClockoutButton = new WebDriverWait(driver, ofSeconds(100));
        ClockoutButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[2]/div/textarea")).sendKeys(" Updated");
        Thread.sleep(1000);
    }
    @And("Clicks on save button")
    public void ClicksOnSaveButton() throws InterruptedException, IOException {
        System.out.println("Clicks on save button");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/button[1]")).click();
        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Timelog_Edit_Data.png"));
        Thread.sleep(2000);
        System.out.println("TimeLog Edit Data Page Screenshot is captured");
        Thread.sleep(5000);
    }

    @Then("Updated data is display")
    public void updatedDataIsDisplay()
    {
        System.out.println("Updated data is display");
        //System.out.println("Data is Updated successfully");
    }
}
