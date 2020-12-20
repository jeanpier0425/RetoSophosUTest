package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.UtestPage.*;

public class Establezco implements Task {

    private String pass;

    public Establezco(String pass) {
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(pass).into(PASS),
                Enter.theValue(pass).into(CONFIRM_PASS),
                Click.on(TYC),
                Click.on(PRIVACY),
                Click.on(COMPLETE_SETUP)
        );
    }

    public static Establezco elPassword(String pass){
        return Tasks.instrumented(Establezco.class,pass);
    }
}
