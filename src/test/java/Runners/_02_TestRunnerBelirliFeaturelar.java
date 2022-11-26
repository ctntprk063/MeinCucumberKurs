package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_login.feature","src/test/java/FeatureFiles/_02_Country.feature"},   // buraya feature files ın path i verilecek.
        glue = {"StepDefinitions"}, // Step definitions ın klasörü yazılıyor.
        dryRun = false // true olduğunda testi çalıştırma sadece feature lara
        // ait steplerin varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır.
)

public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {
}
