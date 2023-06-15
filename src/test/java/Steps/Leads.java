package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Leads
{
    WebDriver driver;
    public Leads(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }
//Create lead:---------------------------------
    @Given("The user on the site")
    public void theUserOnTheSite()
    {
        // driver.findElement(By.xpath("/html/body/header/div[1]/div[2]")).click(); // open menu for tab/phone
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
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/div/a[1]")).click();
        Thread.sleep(3000);
    }
    @Then("The user redirect to Leads page")
    public void theUserRedirectToLeadsPage() {
        System.out.println("The user redirect to Leads page");
    }
    @And("Click on add lead button")
    public void clickOnAddLeadButton() throws InterruptedException {
        System.out.println("Click on add lead button");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div[1]/a")).click();
        Thread.sleep(1000);
    }
    @Then("The add lead information page is open")
    public void theAddLeadInformationPageIsOpen() {
        System.out.println("The add lead information page is open");
    }
    @And("Fill all the fields")
    public void fillAllTheFields() throws InterruptedException
    {
        //Fill all the fields of lead form:
        WebDriverWait Name = new WebDriverWait(driver, Duration.ofSeconds(50));
        Name.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")).sendKeys("Johnny");
        System.out.println("Name: johnny");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input")).sendKeys("johnnyharpertesting000@gmail.com"); //Email field
        Thread.sleep(2000);
        WebDriverWait Source = new WebDriverWait(driver, Duration.ofSeconds(50));
        Source.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div/button"))); //Select Source
        Select dropdown1 = new Select(driver.findElement(By.id("source_id")));
        dropdown1.selectByVisibleText("Friend");
        //driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/select/option[3]")).click();
        Thread.sleep(5000);
    }
    @And("Click on the save button")
    public void clickOnTheSaveButton() throws InterruptedException, IOException {
        System.out.println("Click on the save button");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click(); //Click on save button for save form
        Thread.sleep(3000);
        //Lead page screenshot
        File LeadsPageScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(LeadsPageScreen, new File("./AllScreenshort/Lead.jpg"));
    }
    @Then("The new lead is create")
    public void theNewLeadIsCreate()
    {
        System.out.println("The new lead is create");
    }

    //Edit leads-------------------------------------------
    @Given("The user on the lead page")
    public void theUserOnTheLeadPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); ////Lead page Xpath
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/div/a[1]")).click();
        Thread.sleep(3000);
        System.out.println("User is on the Leads page");
    }
    @And("user is see the dropdown menu link")
    public void userIsSeeTheDropdownMenuLink()
    {
        System.out.println("user is able to see Dropdown Menu Link");
    }
    @When("User click on the dropdown menu link")
    public void userClickOnTheDropdownMenuLink() throws InterruptedException
    {
        WebDriverWait Crudmenu = new WebDriverWait(driver, Duration.ofSeconds(50));
        Crudmenu.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div"))); //open crud operation menu
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div")).click();
        Thread.sleep(2000);
        System.out.println("User clicks on the Dropdown menu link");
    }
    @And("choose on edit option")
    public void chooseOnEditOption() throws InterruptedException
    {
        WebDriverWait Edit = new WebDriverWait(driver, Duration.ofSeconds(50));
        Edit.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[2]"))); //Choose Edit option
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[2]")).click();
        Thread.sleep(2000);
        System.out.println("Choose on edit option");
    }
    @And("Change the lead name")
    public void changeTheLeadName() throws InterruptedException
    {
        WebDriverWait EditName = new WebDriverWait(driver, Duration.ofSeconds(50));
        EditName.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input"))); //Edit lead name
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")).sendKeys("Johnny11");
        System.out.println("Name: johnny11");
        Thread.sleep(2000);
        WebDriverWait EditAgent = new WebDriverWait(driver, Duration.ofSeconds(50));
        EditAgent.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div/button"))); // Edit Agent
        Select dropdown = new Select(driver.findElement(By.id("agent_id")));
        dropdown.selectByVisibleText("Saurabh Dhariwal");
        //driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div[1]/select/option[2]")).click();
        System.out.println("Agent: Saurabh Dhariwal");
        Thread.sleep(2000);
    }
    @And("click on save button")
    public void clickOnSaveButton() throws InterruptedException
    {
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click(); // Save button Xpath
        Thread.sleep(2000);
        System.out.println("Click on the save button");
    }
    @Then("The lead changes is done")
    public void theLeadChangesIsDone()
    {
        System.out.println("The data is Edit successfully");
    }
    //Delete:--------------------------------------------------
    @Given("User is on the Leads page")
    public void userIsOnTheLeadsPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); ////Lead page Xpath
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/div/a[1]")).click();
        Thread.sleep(3000);
        System.out.println("User is on the Leads page");
    }
    @And("user is able to see Dropdown Menu Link")
    public void userIsAbleToSeeDropdownMenuLink()
    {
        System.out.println("user is able to see Dropdown Menu Link");
    }
    @When("User clicks on the Dropdown menu link")
    public void userClicksOnTheDropdownMenuLink() throws InterruptedException
    {
        WebDriverWait Crudoption = new WebDriverWait(driver, Duration.ofSeconds(50));
        Crudoption.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div"))); // Crud operation Xpath
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div")).click();
        Thread.sleep(2000);
        System.out.println("User clicks on the Dropdown menu link");
    }
    @And("Choose on delete option")
    public void chooseOnDeleteOption() throws InterruptedException
    {
        System.out.println("Choose on delete option");
        WebDriverWait Delete = new WebDriverWait(driver, Duration.ofSeconds(50));
        Delete.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]"))); // Delete Xpath
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")).click();
        Thread.sleep(2000);
    }
    @And("Click on yes,delete it option from the pop-up box")
    public void clickOnYesDeleteItOptionFromThePopUpBox() throws InterruptedException {
        System.out.println("Click on yes,delete it option from the pop-up box");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div[3]/button[1]"))); // Confirm to delete Pop-up open
        driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]")).click();
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
        int Size = rows.size();
        System.out.println("Total Rows are : "+Size);
        for (int i = 1; i <= Size; i++)
        {
            WebElement rows1;
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/div/div/h5/a"));
            String actual_name = rows1.getText();

            System.out.println(actual_name);
            String expected_name = "Demo";
            if (expected_name.equals(actual_name)==true)
            {
                System.out.println("The Text is Updated!!!");
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/div/div/h5/a"));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a"));
                break;
            }
            else
            {
                System.out.println("The Text is not Updated!!!");
            }
        }
    }
    @Then("The data is delete successfully")
    public void theDataIsDeleteSuccessfully()
    {
        System.out.println("The data is delete successfully");
    }
}
