package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UJoinPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form").
            located(By.xpath("//div[@class='unauthenticated-nav-bar__sign-up']//strong[contains(text(),'Join Today')]"));


}
