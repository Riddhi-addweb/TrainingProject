package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Leaves_Steps
{
    WebDriver driver;

    public Leaves_Steps(Hooks hooks) throws InterruptedException
    {
        this.driver = hooks.getDriver();

        // HR Module
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/a/span")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/a/span")).click();
        Thread.sleep(2000);

        // Leave Module
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/div/a[2]")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/div/a[2]")).click();
        Thread.sleep(3000);
    }

    @Given("User is on sidebar menu")
    public void user_is_on_sidebar_menu() throws InterruptedException {
        System.out.println("User is on the Dashboard sidebar menu");

    }
    @When("User clicks on HR dropdown")
    public void user_clicks_on_hr_dropdown() throws InterruptedException {
        System.out.println("User clicks on HR dropdown");
    }
    @And("User clicks on Leaves Module")
    public void user_clicks_on_leaves_module() throws InterruptedException {
        System.out.println("User clicks on Leaves Module");
    }
    @Then("User is navigated to Leaves Module page")
    public void user_is_navigated_to_leaves_module_page()
    {
        System.out.println("User is navigated to Leaves Module page");
    }

    // Add Leave----------------------------------
    @Given("User is on Leaves Page")
    public void userIsOnLeavesPage()
    {
        System.out.println("User is on Leaves Page");
    }
    @And("User is able to see Add Leave Button")
    public void userIsAbleToSeeAddLeaveButton()
    {
        System.out.println("User is able to see Add Leave Button");
    }
    @When("User clicks on Add Leave Button")
    public void userClicksOnAddLeaveButton() throws InterruptedException {
        System.out.println("User clicks on Add Leave Button");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#table-actions > a")));
        driver.findElement(By.cssSelector("#table-actions > a")).click();
        Thread.sleep(2000);
    }
    @And("Input all the data into it")
    public void inputAllTheDataIntoIt() throws InterruptedException {
        System.out.println("Input all the data into it");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div/button")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div/select/option[88]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div[1]/select/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/div/select/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div/div[1]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/input")).sendKeys("01-08-23");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[8]/div/div/textarea")).sendKeys("Testing Leave");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/button")).click();
        Thread.sleep(3000);
    }
    @Then("User is able to apply the Leave Successfully")
    public void userIsAbleToApplyTheLeaveSuccessfully()
    {
        System.out.println("User is able to apply the Leave Successfully");
    }
    @And("User will be navigated to Leaves Listing Page")
    public void userWillBeNavigatedToLeavesListingPage()
    {
        System.out.println("User will be navigated to Leaves Listing Page");
    }

    // Blank calendar field----------------------------------
    @Given("User is on Add Leave Page")
    public void userIsOnAddLeavePage() throws InterruptedException {
        System.out.println("User is on Add Leave Page");
        // Edit with FOR Loop
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
        int Size = rows.size();
        System.out.println("Total Rows are : " + Size);
        for (int i = 1; i <= Size; i++)
        {
            WebElement rows1;
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/div/div/h5/a"));
            String actual_name = rows1.getText();

            System.out.println(actual_name);
            String expected_name = "Aayushi Darji";
            if (expected_name.equals(actual_name) == true)
            {
                for (int j = 1; j <= Size; j++)
                {
                    WebElement rows2;
                    rows2 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[\"+j+\"]/td[6]"));
                    String Actual_Name = rows2.getText();
                    System.out.println(Actual_Name);
                    String Expected_Name = "Pending";
                    if (Expected_Name.equals(Actual_Name) == true)
                    {
                        System.out.println("Pending Text Found!!!");
                        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
                        break;
                    } else
                    {
                        System.out.println("Pending Text Not Found!!!");
                    }
                }

                System.out.println("Expected Text Found!!!");
                Thread.sleep(100);
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/a")).click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")).click();
                Thread.sleep(2000);
                break;
            } else
            {
                System.out.println("Expected Text Not Found!!!");
            }
        }
    }
    @When("User click on Dropdown Menu Link")
    public void userClickOnDropdownMenuLink()
    {
        System.out.println("User click on Dropdown Menu Link");
    }
    @And("Click on Edit Option from it")
    public void clickOnEditOptionFromIt()
    {
        System.out.println("Click on Edit Option from it");
    }
    @And("User is able to see the Calender Field on Add Leave Page")
    public void userIsAbleToSeeTheCalenderFieldOnAddLeavePage()
    {
        System.out.println("User is able to see the Calender Field on Add Leave Page");
    }
    @And("User leaves the Calendar Field Blank")
    public void userLeavesTheCalendarFieldBlank() throws InterruptedException {
        System.out.println("User leaves the Calendar Field Blank");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input")).clear();
        Thread.sleep(2000);
    }
    @And("To save, User will click on the Save button")
    public void toSaveUserWillClickOnTheSaveButton() throws InterruptedException {
        System.out.println("To save, User will click on the Save button");
        driver.findElement(By.xpath("//*[@id=\"save-leave-form\"]\n")).click();
        Thread.sleep(500);
    }
    @Then("User will able to see the validation message")
    public void userWillAbleToSeeTheValidationMessage()
    {
        System.out.println("User will able to see the validation message");
    }

    // Invalid Format---------------------------------------
    @Given("User is on the Add Leave Page")
    public void userIsOnTheAddLeavePage() throws InterruptedException {
        System.out.println("User is on the Add Leave Page");
        // Edit with FOR Loop
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
        int Size = rows.size();
        System.out.println("Total Rows are : " + Size);
        for (int i = 1; i <= Size; i++) {
            WebElement rows1;
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/div/div/h5/a"));
            String actual_name = rows1.getText();

            System.out.println(actual_name);
            String expected_name = "Aayushi Darji";
            if (expected_name.equals(actual_name) == true) {
                for (int j = 1; j <= Size; j++) {
                    WebElement rows2;
                    rows2 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[\"+j+\"]/td[6]"));
                    String Actual_Name = rows2.getText();
                    System.out.println(Actual_Name);
                    String Expected_Name = "Pending";
                    if (Expected_Name.equals(Actual_Name) == true) {
                        System.out.println("Pending Text Found!!!");
                        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
                        break;
                    } else {
                        System.out.println("Pending Text Not Found!!!");
                    }
                }

                System.out.println("Expected Text Found!!!");
                Thread.sleep(100);
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/a")).click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")).click();
                Thread.sleep(2000);
                break;
            } else {
                System.out.println("Expected Text Not Found!!!");
            }
        }
    }
    @When("User click on the Dropdown Menu Link")
    public void userClickOnTheDropdownMenuLink()
    {
        System.out.println("User click on the Dropdown Menu Link");
    }
    @And("Click on the Edit Option from it")
    public void clickOnTheEditOptionFromIt()
    {
        System.out.println("Click on the Edit Option from it");
    }
    @And("User is able to see Calender Field on Add Leave Page")
    public void userIsAbleToSeeCalenderFieldOnAddLeavePage()
    {
        System.out.println("User is able to see Calender Field on Add Leave Page");
    }
    @And("User adds invalid format of the date")
    public void userAddsInvalidFormatOfTheDate()
    {
        System.out.println("User adds invalid format of the date");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#reason")));
        driver.findElement(By.cssSelector("#reason")).clear();
        driver.findElement(By.cssSelector("#reason")).sendKeys("07/02/2022");
    }
    @And("To save, User will click the Save button")
    public void toSaveUserWillClickTheSaveButton() throws InterruptedException {
        System.out.println("To save, User will click the Save button");
        driver.findElement(By.xpath("//*[@id=\"save-leave-form\"]\n")).click();
        Thread.sleep(500);
    }
    @Then("User will able to see validation message")
    public void userWillAbleToSeeValidationMessage()
    {
        System.out.println("User will able to see validation message");
    }

    // Zeros-----------------------------------------
    @Given("User is on Add Leaves page")
    public void userIsOnAddLeavesPage() throws InterruptedException {
        System.out.println("User is on Add Leaves page");
        // Edit with FOR Loop
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
        int Size = rows.size();
        System.out.println("Total Rows are : " + Size);
        for (int i = 1; i <= Size; i++) {
            WebElement rows1;
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/div/div/h5/a"));
            String actual_name = rows1.getText();

            System.out.println(actual_name);
            String expected_name = "Aayushi Darji";
            if (expected_name.equals(actual_name) == true) {
                for (int j = 1; j <= Size; j++) {
                    WebElement rows2;
                    rows2 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[\"+j+\"]/td[6]"));
                    String Actual_Name = rows2.getText();
                    System.out.println(Actual_Name);
                    String Expected_Name = "Pending";
                    if (Expected_Name.equals(Actual_Name) == true) {
                        System.out.println("Pending Text Found!!!");
                        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
                        break;
                    } else {
                        System.out.println("Pending Text Not Found!!!");
                    }
                }

                System.out.println("Expected Text Found!!!");
                Thread.sleep(100);
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/a")).click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")).click();
                Thread.sleep(2000);
                break;
            } else {
                System.out.println("Expected Text Not Found!!!");
            }
        }
    }
    @When("User clicks on the Dropdown Menu Link")
    public void userClicksOnTheDropdownMenuLink()
    {
        System.out.println("User clicks on the Dropdown Menu Link");
    }
    @And("Click on the Edit Option from dropdown")
    public void clickOnTheEditOptionFromDropdown()
    {
        System.out.println("Click on the Edit Option from dropdown");
    }
    @And("User is able to see Calender on Add Leave Page")
    public void userIsAbleToSeeCalenderOnAddLeavePage()
    {
        System.out.println("User is able to see Calender on Add Leave Page");
    }
    @And("User adds all zeros in calendar field")
    public void userAddsAllZerosInCalendarField()
    {
        System.out.println("User adds all zeros in calendar field");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#single_date")));
        driver.findElement(By.cssSelector("#single_date")).clear();
        driver.findElement(By.cssSelector("#single_date")).sendKeys("00-00-0000");
    }
    @And("To save, User click the Save button")
    public void toSaveUserClickTheSaveButton() throws InterruptedException {
        System.out.println("To save, User click the Save button");
        driver.findElement(By.xpath("//*[@id=\"save-leave-form\"]\n")).click();
        Thread.sleep(500);
    }
    @Then("User will able to see validation message on screen")
    public void userWillAbleToSeeValidationMessageOnScreen()
    {
        System.out.println("User will able to see validation message on screen");
    }

    // Alphabets--------------------------------------------------
    @Given("This user is viewing the Add Leaves page")
    public void thisUserIsViewingTheAddLeavesPage() throws InterruptedException {
        System.out.println("This user is viewing the Add Leaves page");
        // Edit with FOR Loop
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
        int Size = rows.size();
        System.out.println("Total Rows are : " + Size);
        for (int i = 1; i <= Size; i++) {
            WebElement rows1;
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/div/div/h5/a"));
            String actual_name = rows1.getText();

            System.out.println(actual_name);
            String expected_name = "Aayushi Darji";
            if (expected_name.equals(actual_name) == true) {
                for (int j = 1; j <= Size; j++) {
                    WebElement rows2;
                    rows2 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[\"+j+\"]/td[6]"));
                    String Actual_Name = rows2.getText();
                    System.out.println(Actual_Name);
                    String Expected_Name = "Pending";
                    if (Expected_Name.equals(Actual_Name) == true) {
                        System.out.println("Pending Text Found!!!");
                        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
                        break;
                    } else {
                        System.out.println("Pending Text Not Found!!!");
                    }
                }

                System.out.println("Expected Text Found!!!");
                Thread.sleep(100);
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/a")).click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")).click();
                Thread.sleep(2000);
                break;
            } else {
                System.out.println("Expected Text Not Found!!!");
            }
        }
    }
    @When("The user clicks on the Dropdown Menu Link")
    public void theUserClicksOnTheDropdownMenuLink()
    {
        System.out.println("The user clicks on the Dropdown Menu Link");
    }
    @And("Select Edit from the dropdown menu")
    public void selectEditFromTheDropdownMenu()
    {
        System.out.println("Select Edit from the dropdown menu");
    }
    @And("The calendar is visible on the Add Leave page")
    public void theCalendarIsVisibleOnTheAddLeavePage()
    {
        System.out.println("The calendar is visible on the Add Leave page");
    }
    @And("User adds alphabets to the calendar field")
    public void userAddsAlphabetsToTheCalendarField()
    {
        System.out.println("User adds alphabets to the calendar field");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#single_date")));
        driver.findElement(By.cssSelector("#single_date")).clear();
        driver.findElement(By.cssSelector("#single_date")).sendKeys("ABCD");
    }
    @And("To save, click the Save button")
    public void toSaveClickTheSaveButton() throws InterruptedException {
        System.out.println("To save, click the Save button");
        driver.findElement(By.xpath("//*[@id=\"save-leave-form\"]\n")).click();
        Thread.sleep(500);
    }
    @Then("A validation message will appear on the screen")
    public void aValidationMessageWillAppearOnTheScreen()
    {
        System.out.println("A validation message will appear on the screen");
    }

    // Numbers more than in a month----------------------------------
    @Given("The user is viewing the Add Leaves page")
    public void theUserIsViewingTheAddLeavesPage() throws InterruptedException {
        System.out.println("The user is viewing the Add Leaves page");
        // Edit with FOR Loop
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
        int Size = rows.size();
        System.out.println("Total Rows are : " + Size);
        for (int i = 1; i <= Size; i++) {
            WebElement rows1;
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/div/div/h5/a"));
            String actual_name = rows1.getText();

            System.out.println(actual_name);
            String expected_name = "Aayushi Darji";
            if (expected_name.equals(actual_name) == true) {
                for (int j = 1; j <= Size; j++) {
                    WebElement rows2;
                    rows2 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[\"+j+\"]/td[6]"));
                    String Actual_Name = rows2.getText();
                    System.out.println(Actual_Name);
                    String Expected_Name = "Pending";
                    if (Expected_Name.equals(Actual_Name) == true) {
                        System.out.println("Pending Text Found!!!");
                        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
                        break;
                    } else {
                        System.out.println("Pending Text Not Found!!!");
                    }
                }

                System.out.println("Expected Text Found!!!");
                Thread.sleep(100);
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/a")).click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")).click();
                Thread.sleep(2000);
                break;
            } else {
                System.out.println("Expected Text Not Found!!!");
            }
        }
    }
    @When("User clicks on the Menu Link")
    public void userClicksOnTheMenuLink()
    {
        System.out.println("User clicks on the Menu Link");
    }
    @And("Will select Edit from the dropdown menu")
    public void willSelectEditFromTheDropdownMenu()
    {
        System.out.println("Will select Edit from the dropdown menu");
    }
    @And("The calendar is visible on the Add Leaves page")
    public void theCalendarIsVisibleOnTheAddLeavesPage()
    {
        System.out.println("The calendar is visible on the Add Leaves page");
    }
    @And("User adds numbers more than there are in a month to the calendar field")
    public void userAddsNumbersMoreThanThereAreInAMonthToTheCalendarField() throws InterruptedException {
        System.out.println("User adds numbers more than there are in a month to the calendar field");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input")).sendKeys("35-13-2023");
        Thread.sleep(5000);
    }
    @And("Click on the Save Button")
    public void clickOnTheSaveButton() throws InterruptedException {
        System.out.println("Click on the Save Button");
        driver.findElement(By.xpath("//*[@id=\"save-leave-form\"]\n")).click();
        Thread.sleep(5000);
    }
    @Then("Validation message will appear on the screen")
    public void validationMessageWillAppearOnTheScreen()
    {
        System.out.println("Validation message will appear on the screen");
    }

    // Text field blank---------------------------------------
    @Given("The user is viewing the Add Leave page")
    public void theUserIsViewingTheAddLeavePage() throws InterruptedException {
        System.out.println("The user is viewing the Add Leave page");
        // Edit with FOR Loop
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
        int Size = rows.size();
        System.out.println("Total Rows are : " + Size);
        for (int i = 1; i <= Size; i++) {
            WebElement rows1;
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/div/div/h5/a"));
            String actual_name = rows1.getText();

            System.out.println(actual_name);
            String expected_name = "Kevin Panchal";
            if (expected_name.equals(actual_name) == true) {
                for (int j = 1; j <= Size; j++) {
                    WebElement rows2;
                    rows2 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[\"+j+\"]/td[6]"));
                    String Actual_Name = rows2.getText();
                    System.out.println(Actual_Name);
                    String Expected_Name = "Pending";
                    if (Expected_Name.equals(Actual_Name) == true) {
                        System.out.println("Pending Text Found!!!");
                        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
                        break;
                    } else {
                        System.out.println("Pending Text Not Found!!!");
                    }
                }

                System.out.println("Expected Text Found!!!");
                Thread.sleep(100);
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/a")).click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[9]/div/div/div/a[4]")).click();
                Thread.sleep(2000);
                break;
            } else {
                System.out.println("Expected Text Not Found!!!");
            }
        }
    }
    @When("The User clicks on the Dropdown Menu")
    public void theUserClicksOnTheDropdownMenu()
    {
        System.out.println("The User clicks on the Dropdown Menu");
    }
    @And("Selects Edit from the Menu")
    public void selectsEditFromTheMenu()
    {
        System.out.println("Selects Edit from the Menu");
    }
    @And("Text Field is displayed to user")
    public void textFieldIsDisplayedToUser()
    {
        System.out.println("Text Field is displayed to user");
    }
    @And("The User leaves the text field blank")
    public void theUserLeavesTheTextFieldBlank() throws InterruptedException {
        System.out.println("The User leaves the text field blank");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#reason")));
        driver.findElement(By.cssSelector("#reason")).clear();
        Thread.sleep(2000);
    }
    @And("Will Click on Save Button")
    public void willClickOnSaveButton() throws InterruptedException {
        System.out.println("Click on Save Button");
        driver.findElement(By.xpath("//*[@id=\"save-leave-form\"]\n")).click();
        Thread.sleep(500);
    }
    @Then("It shows validation message")
    public void itShowsValidationMessage()
    {
        System.out.println("It shows validation message");
    }
}
