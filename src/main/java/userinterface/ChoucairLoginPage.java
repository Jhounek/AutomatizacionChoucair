package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Button than shows us the form to login")
            .located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a/strong"));

    public static final Target INPUT_USER = Target.the("Where we write the user")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("Where we write the password")
            .located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("Button to confirm the login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
