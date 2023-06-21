package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.mail.EmailException;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

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
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1280, 1024));
        driver.get("https://ttstage.addwebprojects.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[1]/input[1]")).sendKeys("saurabhdhariwal.com@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/div[1]/input")).sendKeys("addweb123");
        Thread.sleep(1000);
        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot)driver;
        Thread.sleep(1000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(1000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/Screenshots/Login.png"));
        Thread.sleep(1000);
        System.out.println("Login Page Screenshot is captured");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")).click();
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws MessagingException, EmailException {

        System.out.println("Email Test Has Been Started");

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Enable TLS

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("johnnyharpertesting110@gmail.com", "nulaxesuokdtihpq");
            }
        });

        try {
            // Create email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("johnnyharpertesting110@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("khushi@addwebsolution.in"));
            message.setSubject("Test Report");

            // Create a multipart message to support attachments
            Multipart multipart = new MimeMultipart();

            // Create the email body
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This is the test report.");

            // Add the email body to the multipart message
            multipart.addBodyPart(messageBodyPart);

            // Attach the report file (if applicable)
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(new File("/Users/addweb/Desktop/IdeaProjects/HooksProject/TickTalk_Timelogs_Report.html"));

            // Add the attachment to the multipart message
            multipart.addBodyPart(attachmentBodyPart);

            // Set the content of the email message to the multipart message
            message.setContent(multipart);

            // Send the email
            Transport.send(message);

            System.out.println("Email has been sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After(order = 1)
    public void TearDown() throws InterruptedException, MessagingException, EmailException
    {
        System.out.println("-----------------------");
        System.out.println("Ending Of The Scenario.");
        System.out.println("-----------------------");
        driver.quit();
        Thread.sleep(1000);
    }

//    // Login with CSV----------------------------------------------------
//    String csvFilePath = "/Users/addweb/Desktop/Login Emails and Passwords - Sheet1.csv";
//    List<String[]> csvData = readCSVData(csvFilePath);
//        for (String[] rowData : csvData)
//    {
//        String Email = rowData[0];
//        String Password = rowData[1];
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[1]/input[1]")).sendKeys(Email);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/div[1]/input")).sendKeys(Password);
//        Thread.sleep(1000);
//        //Screenshots
//        TakesScreenshot loginScreenshot = (TakesScreenshot) driver;
//        Thread.sleep(1000);
//        File source = loginScreenshot.getScreenshotAs(OutputType.FILE);
//        Thread.sleep(1000);
//        FileHandler.copy(source, new File("/Users/addweb/Desktop/IdeaProjects/NewClockio/Screenshots/Login.png"));
//        Thread.sleep(1000);
//        System.out.println("Login Page Screenshot is captured");
//        Thread.sleep(1000);
//        // Login Button
//        WebDriverWait ClockinType = new WebDriverWait(driver, ofSeconds(100));
//        ClockinType.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")));
//        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")).click();
//        Thread.sleep(1000);
//    }
    // CSV Data Method-----------------------------------------
    //public List<String[]> readCSVData(String csvFilePath) throws IOException {
    //    List<String[]> data = new ArrayList<>();
    //    try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
    //        String line;
    //        while ((line = reader.readLine()) != null) {
    //            String[] rowData = line.split(",");
    //            data.add(rowData);
    //        }
    //    }
    //    return data;
//}
    public WebDriver getDriver()
    {
        return driver;
    }
}
