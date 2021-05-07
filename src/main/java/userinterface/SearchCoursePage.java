package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Select the course and certification choucair")
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Click for search the course and certification")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Click for search the course")
            .located(By.xpath("//h4[@class='result-title']/a"));

    public static final Target NAME_COURSE = Target.the("It extract the name of course")
            .located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
