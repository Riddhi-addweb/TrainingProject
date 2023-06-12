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

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class ClockIn
{
    WebDriver driver;
    public ClockIn(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }
    //Clock In-------------------------------------
    @Given("User is on the Dashboard")
    public void user_is_on_the_dashboard()
    {
        System.out.println("User is on the Dashboard");
    }
    @And("User is able to see the Clock-In Button")
    public void user_is_able_to_see_the_clock_in_button()
    {
        System.out.println("User is able to see the Clock-In Button");
    }
    @When("User clicks on the Clock-In Button")
    public void user_clicks_on_the_clock_in_button() throws InterruptedException
    {
        System.out.println("User clicks on the Clock-In Button");
        // Path to go to Private Dashboard
        Actions PrivateDashboardaction = new Actions(driver);
        WebElement PrivateDashboardLink = driver.findElement(By.linkText("Private Dashboard"));
        PrivateDashboardaction.moveToElement(PrivateDashboardLink).click().perform();
        Thread.sleep(3000);
        // Path to Click clockin button
        WebDriverWait ClockinButton = new WebDriverWait(driver, ofSeconds(100));
        ClockinButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/button")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/button")).click();
        Thread.sleep(3000);
    }
    @And("And does the Clock-In")
    public void and_does_the_clock_in() throws InterruptedException
    {
        System.out.println("And does the Clock-In");
        //Path to click inner clock in button
        WebDriverWait ClockinType = new WebDriverWait(driver, ofSeconds(100));
        ClockinType.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[3]/button")));
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
        Thread.sleep(3000);
    }
    @Then("User is successfully Clocked-In")
    public void user_is_successfully_clocked_in()
    {
        System.out.println("User is successfully Clocked-In");
    }

    // Verification Of Time----------------------------------------
    @Given("User is on Dashboard Sidebar Menu")
    public void userIsOnDashboardSidebarMenu() throws InterruptedException {
        // Path to go to Private Dashboard
        Actions PrivateDashboardaction = new Actions(driver);
        WebElement PrivateDashboardLink = driver.findElement(By.linkText("Private Dashboard"));
        PrivateDashboardaction.moveToElement(PrivateDashboardLink).click().perform();
        // Get Name and Input it into Search Bar------------------------------------------
        WebDriverWait GetName = new WebDriverWait(driver, ofSeconds(100));
        GetName.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[3]/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/h4")));
        WebElement nameElement = driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/h4"));
        String nameOnDashboard = nameElement.getText();
        System.out.println("Name on Dashboard: " + nameOnDashboard);
        System.out.println("User is on Dashboard Sidebar Menu");
        //----- Close Dashboard dropdown
        WebDriverWait DashboardDropdownClose = new WebDriverWait(driver, ofSeconds(100));
        DashboardDropdownClose.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/a")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/a")).click();
        Thread.sleep(100);
        // To count the rows in the sidebar menu
        Actions sidebaraction = new Actions(driver);
        WebElement sidebar = driver.findElement(By.id("mobile_menu_collapse"));
        sidebaraction.moveToElement(sidebar);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/aside/div[2]/div[2]/ul/li"));
        int rowsize = rows.size();
        System.out.println("The Total Rows Are:- " +rowsize);
        for (int i = 1; i <= rowsize; i++)
        {
            //----Sidebar common xpath
            WebElement HrModule;
            HrModule = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li["+ i +"]/a"));
            String actual_module = HrModule.getText();
            System.out.println(actual_module);
            String HRModule = "HR";

            // To check that HR module is get or not
            if (actual_module.equals(HRModule) == true)
            {
                System.out.println("HR Module Found");
                // Click on HR module
                Actions Hraction = new Actions(driver);
                WebElement HRModuleLink = driver.findElement(By.linkText("HR"));
                Hraction.moveToElement(HRModuleLink).click().perform();
                // Click on Attendance module
                Actions Attendanceaction = new Actions(driver);
                WebElement AttendanceSubMenuLink = driver.findElement(By.linkText("Attendance"));
                Attendanceaction.moveToElement(AttendanceSubMenuLink).click().perform();
                System.out.println("Attendance Module Found");
                break;
            }
            else
            {
                System.out.println("HR Module Not Found");
            }
        }
        //Search ------------------------------------------------------------------------
        //----- Click on Employee------------------------------------------
        WebDriverWait Employee = new WebDriverWait(driver, ofSeconds(100));
        Employee.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[1]/div/div/button")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[1]/div/div/button")).click();
        Thread.sleep(2000);
        //----- Click on Searchbar and Enter Input---------------------------------------
        WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[1]/div/div/div/div[1]/input"));
        searchBar.sendKeys(nameOnDashboard);
        Thread.sleep(2000);
        //----- Click on Name of the Person--------------------------------------------------
        WebDriverWait EmployeeName = new WebDriverWait(driver, ofSeconds(100));
        EmployeeName.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[1]/div/div/div/div[2]/ul/li/a")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[1]/div/div/div/div[2]/ul/li/a")).click();
        Thread.sleep(2000);
    }
    @And("User is able to see the HR Dropdown")
    public void userIsAbleToSeeTheHRDropdown()
    {
        System.out.println("User is able to see the HR Dropdown");
    }
    @When("User clicks on HR Dropdown")
    public void userClicksOnHRDropdown()
    {
        System.out.println("User clicks on HR Dropdown");
    }
    @And("Clicks on Attendance Module from the HR dropdown")
    public void clicksOnAttendanceModuleFromTheHRDropdown()
    {
        System.out.println("Clicks on Attendance Module from the HR dropdown");
    }
    @And("User is redirected to the Attendance Module")
    public void userIsRedirectedToTheAttendanceModule()
    {
        System.out.println("User is redirected to the Attendance Module");
    }
    @Then("User will verify the Clockin time of the respective user")
    public void userWillVerifyTheClockinTimeOfTheRespectiveUser() throws InterruptedException
    {
        System.out.println("User will verify the Clockin time of the respective user");
        Thread.sleep(3000);
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Format the time in 12-hour format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        String formattedDateTime = currentDateTime.format(formatter);
        String day = String.valueOf(Integer.parseInt(formattedDateTime.substring(0, 2)));
        // Output the result
        System.out.println("Current Date is: " + day);
        // Get Current Time -----------------------------------------------------------------
        LocalTime currentTime = LocalTime.now();
        // Format the time
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm");
        String formattedTime = currentTime.format(formatter1);
        // Output the result
        System.out.println("Current Time Is - " + formattedTime);
        //Verify Date and Time with FOR Loop --------------------------------
        // Date Table Xpath
        Actions DateTable = new Actions(driver);
        WebElement Date = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div"));
        DateTable.moveToElement(Date);
        WebDriverWait DateTableSize = new WebDriverWait(driver, ofSeconds(100));
        DateTableSize.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th")));
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th")); //--- Table Xpath
        int Size = rows.size();
        for (int i = 1; i <= Size; i++)
        {
            //----Employee column xpath
            WebElement EmployeeCount;
            EmployeeCount = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th[" + i + "]"));
            String actual_date = EmployeeCount.getText();
            System.out.println(actual_date);

            // To match the dates
            if (actual_date.equals(day) == true)
            {
                System.out.println("Expected Date Found!!!");
                System.out.println("Dashboard and Attendance Dates Matched");
                Thread.sleep(100);
                //---Employee Name column xpath
                WebDriverWait EmployeesName = new WebDriverWait(driver, ofSeconds(100));
                EmployeesName.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th[" + i + "]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th[" + i + "]")).click();
                //--Attendance column xpath
                WebDriverWait Attendance = new WebDriverWait(driver, ofSeconds(100));
                Attendance.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr/td[" + i + "]/a"))); //--Attendance column xpath
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr/td[" + i + "]/a")).click();
                Thread.sleep(2000);
                // Time Verification ----------------------------------------------------------------
                Thread.sleep(3000);
                System.out.println("----- Time Verification Starts -----");

                //                        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
                //                        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div")));
                //                        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div")); //--- Table Xpath
                //                        int Size2 = rows.size();
                //                        System.out.println("Total Rows are : " + Size2);

                //--- Attendance time Table Xpath
                WebDriverWait AttendanceTable = new WebDriverWait(driver, ofSeconds(100));
                AttendanceTable.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div")));
                List<WebElement> RowsTime = driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div"));
                int SizeTime = RowsTime.size();
                System.out.println("Total Rows are : " + SizeTime);
                {
                    int  K= SizeTime;
                    // Loop of finding the latest time
                    WebDriverWait AttendanceLatestTime = new WebDriverWait(driver, ofSeconds(100));
                    AttendanceLatestTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div["+K+"]")));
                    String k = String.valueOf(SizeTime);
                    driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div["+K+"]"));
                    // Loop of trimming and finding the exact time
                    WebDriverWait AttendanceExactTime = new WebDriverWait(driver, ofSeconds(100));
                    AttendanceExactTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div["+K+"]/ul/li[1]/p[2]")));
                    String ClockinTimeMatch = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div["+K+"]/ul/li[1]/p[2]")).getText();
                    // Trim "WFH" and "Late Half Day" from the string
                    String TrimmedClockinTimes = ClockinTimeMatch.replaceAll("\\s*(WFH|Late|Half Day)\\s*", "").trim();
                    System.out.println("Clockin Time in Attendance is: " + TrimmedClockinTimes);

                    // Match the timings
                    if (ClockinTimeMatch.equals(ClockinTimeMatch) == true)
                    {
                        System.out.println("Attendance Column Time Found");
                        //----- Cross Button to close attendance detail page
                        Actions CrossButton = new Actions(driver);
                        WebElement crossbutton = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]"));
                        CrossButton.moveToElement(crossbutton);
                        WebDriverWait CloseButton = new WebDriverWait(driver, ofSeconds(100));
                        CloseButton.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#myModalXl > div > div > div.modal-header > button")));
                        driver.findElement(By.cssSelector("#myModalXl > div > div > div.modal-header > button")).click();
                        Thread.sleep(2000);
                        //------- Dashboard Path
                        Actions Dashboard = new Actions(driver);
                        WebElement SideBar = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]"));
                        Dashboard.moveToElement(SideBar);
                        WebDriverWait DashboardPath = new WebDriverWait(driver, ofSeconds(100));
                        DashboardPath.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/a")));
                        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/a")).click();
                        Thread.sleep(2000);

                        //                                        WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(100));
                        //                                        wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/div/a")));
                        //                                        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/div/a")).click(); //-------- Private dashboard

                        // Private dashboard Xpath
                        Actions PrivateDashboard = new Actions(driver);
                        WebElement PrivateDashboardLink = driver.findElement(By.linkText("Private Dashboard"));
                        PrivateDashboard.moveToElement(PrivateDashboardLink).click().perform();
                        Thread.sleep(1000);
                        //--- Welcome name common Xpath
                        Actions CommonNameaction = new Actions(driver);
                        WebElement CommonName = driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[1]"));
                        CommonNameaction.moveToElement(CommonName);
                        //--- Time Xpath
                        driver.findElements(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/p"));
                        Thread.sleep(2000);
                        //----Time column xpath and trimmed time
                        WebElement ClockTime;
                        ClockTime = driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/p/span"));
                        String actual_time = ClockTime.getText();
                        Thread.sleep(2000);
                        String ClockInTimes = actual_time.substring(actual_time.indexOf("-") + 2);
                        System.out.println("Clockin Time on Dashboard is:- " + ClockInTimes);

                        // Matched Attendance and Dashboard timings
                        if (TrimmedClockinTimes.equals(ClockInTimes) == true)
                        {
                            System.out.println("Expected Time Found!!!");
                            System.out.println("Attendance and Dashboard Timing Matched");
                            break;
                        } else
                        {
                            System.out.println("Expected Time Not Found!!!");
                            Thread.sleep(1000);
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("Attendance Column Time Not Found");
                    }
                }
                break;
            }
            else
            {
                System.out.println("Expected Date Not Found!!!");
                Thread.sleep(1000);
            }
        }
    }

    //Clock Out-------------------------------------
    @Given("User is on Dashboard Page")
    public void user_is_on_dashboard_page()
    {
        System.out.println("User is on Dashboard Page");
    }
    @And("User is able to see the Clock-Out Button")
    public void user_is_able_to_see_the_clock_out_button()
    {
        System.out.println("User is able to see the Clock-Out Button");
    }
    @When("User clicks on the Clock-Out Button")
    public void user_clicks_on_the_clock_out_button() throws InterruptedException
    {
        System.out.println("User clicks on the Clock-Out Button");
        // Path to Private Dashboard
        Actions PrivateDashboardClockout = new Actions(driver);
        WebElement PDLink1 = driver.findElement(By.linkText("Private Dashboard"));
        PrivateDashboardClockout.moveToElement(PDLink1).click().perform();
        Thread.sleep(2000);
        // Path to Click clockout button
        WebDriverWait ClockoutButton = new WebDriverWait(driver, ofSeconds(100));
        ClockoutButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/button[1]")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
    }
    @Then("User is successfully Clocked-Out")
    public void user_is_successfully_clocked_out()
    {
        System.out.println("User is successfully Clocked-Out");
    }
}
