package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.CompanyApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CompanyApplication.class })
public class CucumberSpingConfiguration {}
