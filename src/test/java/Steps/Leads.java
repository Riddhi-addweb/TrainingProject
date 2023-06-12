//package Steps;
//
//import com.sun.org.apache.bcel.internal.generic.NEW;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.apache.commons.io.FileUtils;
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//
//public class Leads
//{
//    WebDriver driver;
//
//    public Leads(Hooks hooks)
//    {
//        this.driver = hooks.getDriver();
//    }
//
//    @Given("The user on the site")
//    public void theUserOnTheSite()
//    {
//        System.out.println("The user on the site");
//    }
//
//    @When("The user click on Leads option")
//    public void theUserClickOnLeadsOption() throws InterruptedException, IOException {
//        Thread.sleep(100);
//            Actions actions = new Actions(driver);
//            WebElement Sidemenu = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]"));
//            actions.moveToElement(Sidemenu);
//            Thread.sleep(1000);
//               driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]")).click();
//
//                    WebElement Leads1 =  driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]"));
//                    actions.moveToElement(Leads1);
//                    actions.click();
//                    Thread.sleep(1000);
//                    TakesScreenshot scrShot =((TakesScreenshot)driver);
//                    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//                    File DestFile1=new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/test.png");
//                    FileUtils.copyFile(SrcFile, DestFile1);
//
//    }
//
//    @Then("The user redirect to Leads page")
//    public void theUserRedirectToLeadsPage()
//    {
//        System.out.println("The user redirect to Leads page");
//    }
//
//    @And("Click on add lead button")
//    public void clickOnAddLeadButton() throws InterruptedException, IOException {
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div[1]/a")).click();
//        Thread.sleep(1000);
//        TakesScreenshot scrShot =((TakesScreenshot)driver);
//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//        File DestFile1=new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/AddLeads.png");
//        FileUtils.copyFile(SrcFile, DestFile1);
//
//
//        System.out.println("Click on add lead button");
//    }
//
//    @Then("The add lead information page is open")
//    public void theAddLeadInformationPageIsOpen()
//    {
//        System.out.println("The add lead information page is open");
//    }
//
//    @And("Fill all the fields")
//    public void fillAllTheFields() throws InterruptedException, IOException {
//        System.out.println("Fill all the fields");
//        TakesScreenshot scrShot =((TakesScreenshot)driver);
//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//        File DestFile1=new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/save.png");
//        FileUtils.copyFile(SrcFile, DestFile1);
//        Actions actions = new Actions(driver);
//        WebElement Leads = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input"));
//        actions.moveToElement(Leads);
//        actions.click();
//        WebElement LeadsName =  driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input"));
//        actions.moveToElement(LeadsName);
//        actions.sendKeys("Johnny");
//        actions.perform();
//        Thread.sleep(2000);
//    }
//
//    @And("Click on the save button")
//    public void clickOnTheSaveButton() throws InterruptedException, IOException {
//        System.out.println("Click on the save button");
//
//        Actions actions = new Actions(driver);
//            WebElement submitclass = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]"));
//            actions.moveToElement(submitclass);
//            Thread.sleep(100);
//            driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click();
//            Thread.sleep(100);
//
//            //Use TakesScreenshot method to capture screenshot
//            TakesScreenshot scrShot =((TakesScreenshot)driver);
//            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//            File DestFile1=new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/save.png");
//            FileUtils.copyFile(SrcFile, DestFile1);
//            Thread.sleep(2000);
//            System.out.println("Lead Data Page Screenshot is captured");
//            Thread.sleep(2000);
//    }
//
//    @Then("The new lead is create")
//    public void theNewLeadIsCreate()
//    {
//        System.out.println("The new lead is create");
//    }
//
//
//    //Delete
//    @Given("User is on the Leads page")
//    public void userIsOnTheLeadsPage()
//    {
//        System.out.println("User is on the Leads page");
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
//    }
//    @And("User is able to see Dropdown Menu Link")
//    public void UserIsAbleToSeeDropdownMenuLink()
//    {
//        System.out.println("User is able to see Dropdown Menu Link");
//    }
//    @When("User clicks on the Dropdown menu link")
//    public void userClicksOnTheDropdownMenuLink() throws InterruptedException {
//        System.out.println("User clicks on the Dropdown menu link");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
//        Thread.sleep(2000);
//    }
//    @And("Choose on delete option")
//    public void chooseOnDeleteOption() throws InterruptedException {
//        System.out.println("Choose on delete option");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")).click();
//        Thread.sleep(2000);
//    }
//    @And("Click on yes,delete it option from the pop-up box")
//    public void clickOnYesDeleteItOptionFromThePopUpBox() throws InterruptedException {
//        System.out.println("Click on yes,delete it option from the pop-up box");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div[3]/button[1]")));
//        driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]")).click();
//        Thread.sleep(2000);
//    }
//    @Then("The data is delete successfully")
//    public void theDataIsDeleteSuccessfully()
//    {
//        System.out.println("The data is delete successfully");
//    }
//}
