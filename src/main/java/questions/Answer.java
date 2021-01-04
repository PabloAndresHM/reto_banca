package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FillPage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Object toThe(String question) {
        return new Answer(question);
    }

    public Boolean answeredBy(Actor actor) {
        String nameCourse = ((Text)Text.of(FillPage.MESSAGE_INIT).viewedBy(actor)).asString();
        boolean result = this.question.equals(nameCourse);
        return result;
    }

    public String getSubject() {
        return null;
    }
}

