package net.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"me.jvt.cucumber.report.PrettyReports:target/cucumber", "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "net/trycloud/step_definitions",
        dryRun = false,
        tags = "@wipAP",
        publish = false
)


public class CukesRunner {
}
