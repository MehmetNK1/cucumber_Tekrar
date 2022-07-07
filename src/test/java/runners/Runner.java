package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={"html:target/cucumber-reports.html"},// bu satir raporlama icin kullanilir
            features = "src/test/resources/features",
            glue = "stepDefinitions",
            tags = "@guru",
            dryRun = false
    )

    public class Runner {


}
