package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {
    public static final Target INPUT_NAME = Target.the("Where we write the name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Where we write the last name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Where we write the Email").located(By.id("email"));
    public static final Target BIRTH_DAY = Target.the("Where we write the day of birth").located(By.xpath("//*[@id=\"birthDay\"]/option[18]"));
    public static final Target BIRTH_MONTH = Target.the("Where we write the month of birth").located(By.xpath("//*[@id=\"birthMonth\"]/option[6]"));
    public static final Target BIRTH_YEAR = Target.the("Where we write the year of birth").located(By.xpath("//*[@id=\"birthYear\"]/option[12]"));
    public static final Target LANGUAGE = Target.the("Where we write the language").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button to continue to the next step").located(By.className("btn-blue"));
    public static final Target CITY = Target.the("Where we write the city of resident").located(By.id("city"));
    public static final Target POSTAL = Target.the("Where we write the postal code").located(By.id("zip"));
    public static final Target COUNTRY = Target.the("Where we write the country").located(By.className("ui-select"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Button to continue to the next step").located(By.className("btn-blue"));
    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("Button to continue to the next step").located(By.className("btn-blue"));
    public static final Target PASSWORD = Target.the("Where we write the password").located(By.id("password"));
    public static final Target RE_PASSWORD = Target.the("Where we write the confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("check the information").located(By.className("signup-consent--highlight"));
    public static final Target CHECK_READ_TERMS = Target.the("check the read of terms and conditions").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_ACCEPT_POLITICS = Target.the("check that accept politics").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target MESSAGE_INIT = Target.the("choose a message to confirm the profile ").located(By.className("sub-title"));

    public FillPage() {
    }
}
