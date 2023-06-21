package HooksProjects.Reports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.IOException;
import java.sql.SQLException;

    public class ReportClass {
        public static ExtentHtmlReporter htmlReporter;
        public static ExtentReports extent;
        public static ExtentTest logger;

        @BeforeSuite
        public void initReport() throws SQLException
        {
            htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/testREport.xml" +
                    "");
            extent = new ExtentReports ();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Host Name", "Pilocity_Automation");
            extent.setSystemInfo("Environment", "City__Automation__Reports");
            extent.setSystemInfo("User Name", "Riddhi");

            htmlReporter.config().setDocumentTitle("test_riddhi Test_cases");
            htmlReporter.config().setReportName("Test_riddhi Test_Report");
            htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
            htmlReporter.config().setTheme(Theme.STANDARD);
        }

        @AfterSuite
        public void tearDown() throws IOException {
            extent.flush();

        }
    }
}
