package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AutomationUtestPage;

public class OpenUp implements Task {
    AutomationUtestPage automationUtestPage;

    public OpenUp() {
    }

    public static Performable thePage() {
        return (OpenUp) Tasks.instrumented(OpenUp.class, new Object[0]);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new Performable[]{Open.browserOn(this.automationUtestPage), Click.on(AutomationUtestPage.JOIN_BUTTON)});
    }
}
