package steps;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;
public class Hooks extends BasePage {
    public Hooks() {
        super(driver);
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("Scenario faling, please refer to the image attached to this report");
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
            scenario.attach(screenshot, "image/png","Screnshot of the error");
        }
    }
}
