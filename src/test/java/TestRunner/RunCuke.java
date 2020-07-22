package TestRunner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Search.feature",tags = {},
        glue = "StepDefination",
        dryRun = false,
        monochrome = false,
        plugin = {"pretty","html:test-output",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"}
)

public class RunCuke {
    @AfterClass
    public static void getExtentReport(){
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/main/resources/extentConfig.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");



    }
}
