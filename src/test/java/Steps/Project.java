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

import static java.time.Duration.ofSeconds;

public class Project
{
    WebDriver driver;

    public Project(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }

    @Given("User is on Dashboard sidebar menu")
    public void userIsOnDashboardSidebarMenu()
    {
        System.out.println("User is on Dashboard sidebar menu");
    }

    @When("User clicks on Work dropdown")
    public void userClicksOnWorkDropdown() throws InterruptedException
    {
        System.out.println("User clicks on Work dropdown");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(2000);
    }

    @And("User clicks on Project Module")
    public void userClicksOnProjectModule() throws InterruptedException {
        System.out.println("User clicks on Project Module");
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[2]")).click();
        Thread.sleep(3000);
    }

    @Then("User is navigated to Project Module page")
    public void userIsNavigatedToProjectModulePage()
    {
        System.out.println("User is navigated to Project Module page");
    }

//    @Given("User is on Project Page")
//    public void user_is_on_project_page() throws InterruptedException {
//        System.out.println("User is on Project Page");
//    }
    @And("User can see the Add Project Button")
    public void user_can_see_the_add_project_button() throws InterruptedException {
        System.out.println("User can see the Add Project Button");
    }
    @When("User clicks on Add Project Button")
    public void user_clicks_on_add_project_button() throws InterruptedException
    {
        System.out.println("User clicks on Add Project Button");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div[1]/a[1]")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);
    }
    @And("User is navigated to Add Project Page")
    public void user_is_navigated_to_add_project_page()
    {
        System.out.println("User is navigated to Add Project Page");
    }
    @And("User enters the data in to the fields")
    public void userEntersTheDataInToTheFields() throws InterruptedException {
        System.out.println("User enters the data in to the fields");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")).sendKeys("Test123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("01-01-2023");
        Thread.sleep(2000);
        WebDriverWait Datebar = new WebDriverWait(driver, Duration.ofSeconds(50));
        Datebar.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input")).sendKeys("01-05-2023");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/button/div/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/select/option[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/button/div/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/select/option[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[7]/div/div[1]/button/div/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[7]/div/div[1]/select/option[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[11]/div/div/div[1]/button/div/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[11]/div/div/div[1]/select/option[27]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/h4[2]/a")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[12]/div/div[1]/button/div/div/div")).click();
//        Thread.sleep(1000);
//        WebDriverWait ClockoutButton = new WebDriverWait(driver, ofSeconds(100));
//        ClockoutButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[12]/div/div[1]/div/div[1]/input")));
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[12]/div/div[1]/div/div[1]/input")).click();
//        Thread.sleep(1000);
        WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait0.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#hours_allocated")));
        driver.findElement(By.cssSelector("#hours_allocated")).sendKeys("40");
        Thread.sleep(2000);
    }
    @And("Click on Save Button")
    public void clickOnSaveButton() throws InterruptedException, IOException {
        System.out.println("Click on Save Button");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click();

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Project_Data.png"));
        Thread.sleep(2000);
        System.out.println("Project Data Page Screenshot is captured");
        Thread.sleep(5000);
        Thread.sleep(2000);
    }
    @Then("User is able to see the data on Project Listing page")
    public void userIsAbleToSeeTheDataOnProjectListingPage()
    {
        System.out.println("User is able to see the data on Project Listing page");
    }

    // -----Search Data
//    @Given("User is on the Project Page")
//    public void userIsOnTheProjectPage()
//    {
//        System.out.println("User is on the Project Page");
//    }
    @And("User is able to see the Search Field")
    public void userIsAbleToSeeTheSearchField()
    {
        System.out.println("User is able to see the Search Field");
    }
    @When("User clicks on the Search Field")
    public void userClicksOnTheSearchField() throws InterruptedException {
        System.out.println("User clicks on the Search Field");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search-text-field\"]\n")));
        driver.findElement(By.xpath("//*[@id=\"search-text-field\"]\n")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search-text-field\"]\n")).sendKeys("QA");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[4]/button")).click();
        Thread.sleep(3000);
    }
    @And("User enters the Search Data")
    public void userEntersTheSearchData()
    {
        System.out.println("User enters the Search Data");
    }
    @Then("User is able to view the Search Data")
    public void userIsAbleToViewTheSearchData()
    {
        System.out.println("User is able to view the Search Data");
    }

    // ----- Edit Data
    @Given("User is on Projects Page")
    public void user_is_on_projects_page() throws InterruptedException {
        System.out.println("User is on Projects Page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[2]")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[2]")).click();
        Thread.sleep(3000);
    }
    @And("User is able to see the dropdown menu link")
    public void user_is_able_to_see_the_dropdown_menu_link()
    {
        System.out.println("User is able to see the dropdown menu link");
    }
    @When("User clicks on the dropdown menu link")
    public void user_clicks_on_the_dropdown_menu_link() throws InterruptedException
    {
        System.out.println("User clicks on the dropdown menu link");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
        Thread.sleep(2000);
    }
    @And("Clicks on the edit option from dropdown menu link")
    public void clicks_on_the_edit_option_from_dropdown_menu_link() throws InterruptedException {
        System.out.println("Clicks on the edit option from dropdown menu link");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[2]")).click();
        Thread.sleep(3000);
    }
    @Then("User is navigated to Edit Project Page")
    public void user_is_navigated_to_edit_project_page()
    {
        System.out.println("User is navigated to Edit Project Page");
    }
    @And("User is able to Edit all the data")
    public void userIsAbleToEditAllTheData() throws InterruptedException, IOException {
        System.out.println("User is able to Edit all the data");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input")).sendKeys("Testing123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("01-08-23");
        Thread.sleep(2000);
        WebDriverWait date = new WebDriverWait(driver, Duration.ofSeconds(100));
        date.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input")).clear();
        Thread.sleep(1000);
        WebDriverWait dateinput = new WebDriverWait(driver, Duration.ofSeconds(100));
        dateinput.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input")));
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input")).sendKeys("01-12-23");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/select/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/select/option[9]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[7]/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[7]/div/div[1]/select/option[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[10]/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[10]/div/div/select/option[2]")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[6]/div/div/button/div/div/div")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[6]/div/div/select/option[21]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#save-project-data-form > div > div:nth-child(4) > div.col-md-3 > div > div.dropdown.bootstrap-select.form-control.select-picker.dropup > button")).click();
//        Thread.sleep(2000);
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
//        wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#bs-select-21-4")));
//        driver.findElement(By.cssSelector("#bs-select-21-4")).click();
//        Thread.sleep(2000);
//        WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(100));
//        wait0.until(ExpectedConditions.elementToBeClickable(By.cssSelector("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[3]/div/input")));
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[3]/div/input")).clear();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[3]/div/input")).sendKeys("20");
        driver.findElement(By.cssSelector("#save-project-form")).click();

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Project_Edit_Data.png"));
        Thread.sleep(2000);
        System.out.println("Project Edit Data Page Screenshot is captured");
        Thread.sleep(5000);
        Thread.sleep(5000);
    }

    //-----View Data

    @Given("User is on the Projects Page")
    public void userIsOnTheProjectsPage() throws InterruptedException {
        System.out.println("User is on the Projects Page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[2]")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[2]")).click();
        Thread.sleep(3000);
    }
    @And("Dropdown menu link is visible to the User")
    public void dropdownMenuLinkIsVisibleToTheUser()
    {
        System.out.println("Dropdown menu link is visible to the User");
    }
    @When("Dropdown menu link is clicked by User")
    public void dropdownMenuLinkIsClickedByUser() throws InterruptedException
    {
        System.out.println("Dropdown menu link is clicked by User");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
        Thread.sleep(2000);
    }
    @And("Clicks on the view option from dropdown menu link")
    public void clicksOnTheViewOptionFromDropdownMenuLink() throws InterruptedException
    {
        System.out.println("Clicks on the view option from dropdown menu link");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[1]")).click();
        Thread.sleep(2000);
    }
    @Then("User is navigated to View Project Page")
    public void userIsNavigatedToViewProjectPage()
    {
        System.out.println("User is navigated to View Project Page");
    }

    //----- Delete Data
    @Given("User is on projects page")
    public void userIsOnProjectsPage() throws InterruptedException {
        System.out.println("User is on projects page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[2]")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[2]")).click();
        Thread.sleep(3000);
    }
    @And("Dropdown menu link is displayed to the User")
    public void dropdownMenuLinkIsDisplayedToTheUser()
    {
        System.out.println("Dropdown menu link is displayed to the User");
    }
    @When("User will click the Dropdown menu link")
    public void userWillClickTheDropdownMenuLink() throws InterruptedException
    {
        System.out.println("User will click the Dropdown menu link");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
        Thread.sleep(2000);
    }
    @And("Will click Delete option from Dropdown menu link")
    public void willClickDeleteOptionFromDropdownMenuLink() throws InterruptedException
    {
        System.out.println("Will click Delete option from Dropdown menu link");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[7]")).click();
        Thread.sleep(3000);
    }
    @And("Delete Confirmation Card is visible to user")
    public void deleteConfirmationCardIsVisibleToUser()
    {
        System.out.println("Delete Confirmation Card is visible to user");
    }
    @And("User clicks on Yes Delete It Option")
    public void userClicksOnYesDeleteItOption() throws InterruptedException, IOException {
        System.out.println("User clicks on Yes Delete It Option");
        driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/button[1]")).click();
        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Project_Delete_Data.png"));
        Thread.sleep(2000);
        System.out.println("Project Delete Data Page Screenshot is captured");
        Thread.sleep(5000);
        Thread.sleep(5000);
    }
    @Then("The project will be deleted")
    public void theProjectWillBeDeleted()
    {
        System.out.println("The project will be deleted");
    }
}
