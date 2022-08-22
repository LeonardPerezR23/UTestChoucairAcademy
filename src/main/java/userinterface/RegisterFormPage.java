package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterFormPage extends PageObject {

    public static final Target FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("Select to the birth mont")
            .located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("Select to the birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("Select to the birth year")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT = Target.the("Click in the NEXT:LOCATION button")
            .located(By.id("//button[@class='btn btn-blue']"));

}
