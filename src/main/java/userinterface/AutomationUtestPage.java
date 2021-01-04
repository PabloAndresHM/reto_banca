package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class AutomationUtestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Button to begin the creation of a new profile").located(By.className("unauthenticated-nav-bar__sign-up"));

    public AutomationUtestPage() {
    }
}
