package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Leads
{
    WebDriver driver;

    public Leads(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }

    @Given("The user on the site")
    public void theUserOnTheSite()
    {
        System.out.println("The user on the site");
    }

    @When("The user click on Leads option")
    public void theUserClickOnLeadsOption() throws InterruptedException
    {
        System.out.println("The user click on Leads option");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(2000);
    }

    @Then("The user redirect to Leads page")
    public void theUserRedirectToLeadsPage()
    {
        System.out.println("The user redirect to Leads page");
    }

    @And("Click on add lead button")
    public void clickOnAddLeadButton() throws InterruptedException
    {
        System.out.println("Click on add lead button");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div[1]/a")).click();
        Thread.sleep(1000);
    }

    @Then("The add lead information page is open")
    public void theAddLeadInformationPageIsOpen()
    {
        System.out.println("The add lead information page is open");
    }

    @And("Fill all the fields")
    public void fillAllTheFields() throws InterruptedException
    {
        System.out.println("Fill all the fields");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div/select/option[3]")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div/select/option[3]")).click();
        System.out.println("Salutation: Mr.");
        Thread.sleep(2000);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("Johnny");
        System.out.println("Name: johnny");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"client_email\"]\n")).sendKeys("johnnyharpertesting000@gmail.com");
        Thread.sleep(1000);

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div[1]/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div[1]/select/option[2]")).click();
        System.out.println("Agent: Rajeev Agrawal");
        Thread.sleep(2000);


        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/select/option[3]")).click();
        System.out.println("Lead Source: Email");
        Thread.sleep(2000);


        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/select/option[2]")).click();
        System.out.println("Lead Category");
        Thread.sleep(2000);
    }

    @And("Click on the save button")
    public void clickOnTheSaveButton() throws InterruptedException, IOException {
        System.out.println("Click on the save button");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click();

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Lead_Data.png"));
        Thread.sleep(2000);
        System.out.println("Lead Data Page Screenshot is captured");
        Thread.sleep(5000);
        Thread.sleep(2000);
    }

    @Then("The new lead is create")
    public void theNewLeadIsCreate()
    {
        System.out.println("The new lead is create");
    }


    //Delete
    @Given("User is on the Leads page")
    public void userIsOnTheLeadsPage()
    {
        System.out.println("User is on the Leads page");
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
    }

    @And("User is able to see Dropdown Menu Link")
    public void UserIsAbleToSeeDropdownMenuLink()
    {
        System.out.println("User is able to see Dropdown Menu Link");
    }

    @When("User clicks on the Dropdown menu link")
    public void userClicksOnTheDropdownMenuLink() throws InterruptedException {
        System.out.println("User clicks on the Dropdown menu link");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
        Thread.sleep(2000);
    }

    @And("Choose on delete option")
    public void chooseOnDeleteOption() throws InterruptedException {
        System.out.println("Choose on delete option");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")).click();
        Thread.sleep(2000);
    }

    @And("Click on yes,delete it option from the pop-up box")
    public void clickOnYesDeleteItOptionFromThePopUpBox() throws InterruptedException {
        System.out.println("Click on yes,delete it option from the pop-up box");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div[3]/button[1]")));
        driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
    }

    @Then("The data is delete successfully")
    public void theDataIsDeleteSuccessfully()
    {
        System.out.println("The data is delete successfully");
    }
}
