package Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\pedde\\OneDrive\\Desktop\\.metadata\\Cucumber\\src\\test\\resources\\Feature\\Login.feature",
		glue ={"Cucumber"}			
)

public class Test_Runner {

}
