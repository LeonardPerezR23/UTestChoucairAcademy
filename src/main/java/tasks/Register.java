package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.RegisterFormPage;

public class Register implements Task {
    private String form;

    public Register(String form) {
        this.form = form;
    }

    public static Register the(String form) { return Tasks.instrumented(Register.class,form);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(form).into(RegisterFormPage.FIRST_NAME),
                Enter.theValue(form).into(RegisterFormPage.LAST_NAME),
                Enter.theValue(form).into(RegisterFormPage.EMAIL),
                Click.on(RegisterFormPage.SELECT_BIRTH_MONTH),
                Click.on(RegisterFormPage.SELECT_BIRTH_DAY),
                Click.on(RegisterFormPage.SELECT_BIRTH_YEAR),
                Click.on(RegisterFormPage.BUTTON_NEXT));

    }
}
