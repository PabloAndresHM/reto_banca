package tasks;

import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.WebElement;
import userinterface.FillPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static userinterface.FillPage.BIRTH_MONTH;

public class Fill implements Task {
    private final String name;
    private final String last_name;
    private final String email;
    private final String birth_day;
    private final String birth_month;
    private final String birth_year;
    private final String language;
    private final String city;
    private final String postal;
    private final String country;
    private final String password;

    public Fill(String name, String last_name, String email, String birth_day,
                String birth_month, String birth_year, String language, String city,
                String postal, String country, String password) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.language = language;
        this.city = city;
        this.postal = postal;
        this.country = country;
        this.password = password;
    }


    public static Performable the(String name, String last_name, String email,
                                  String birth_day, String birth_month, String birth_year,
                                  String language, String city, String postal, String country, String password) {
        return Tasks.instrumented(Fill.class, name, last_name, email, birth_day, birth_month, birth_year, language, city, postal,country, password);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.name).into(FillPage.INPUT_NAME),
                Enter.theValue(this.last_name).into(FillPage.LAST_NAME),
                Enter.theValue(this.email).into(FillPage.EMAIL),
                Click.on(BIRTH_MONTH),
                //Enter.theValue(this.birth_month).into(BIRTH_MONTH),
                Click.on(FillPage.BIRTH_DAY),
                //Enter.theValue(this.birth_day).into(FillPage.BIRTH_DAY),
                Click.on(FillPage.BIRTH_YEAR),
                //Enter.theValue(this.birth_year).into(FillPage.BIRTH_YEAR),
                Click.on(FillPage.LANGUAGE),
                Enter.theValue(this.language).into(FillPage.LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(FillPage.LANGUAGE),
                Click.on(FillPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(this.city).into(FillPage.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(FillPage.CITY),
                Hit.the(Keys.ENTER).keyIn(FillPage.CITY),
                Enter.theValue(this.postal).into(FillPage.POSTAL),
               // Click.on(FillPage.COUNTRY),
               // Enter.theValue(this.country).into(FillPage.COUNTRY),
                Click.on(FillPage.BUTTON_NEXT_DEVICES),
                Click.on(FillPage.BUTTON_NEXT_LAST_STEP),
                Enter.theValue(this.password).into(FillPage.PASSWORD),
                Enter.theValue(this.password).into(FillPage.RE_PASSWORD),
                Click.on(FillPage.CHECK_STAY_INFORMED), Click.on(FillPage.CHECK_READ_TERMS),
                Click.on(FillPage.CHECK_ACCEPT_POLITICS));
    }
}
