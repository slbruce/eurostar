package com.microfocus.eurostar;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin={"junit:junitResult.xml"},
        features="src/test/resources/tests/feature")

public class ManualRunnerTest {
}
