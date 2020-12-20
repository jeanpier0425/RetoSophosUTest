package task;

import interactions.UsuarioElige;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.awt.*;
import java.awt.event.KeyEvent;

import static userinterface.utestPage.*;

public class IngresarDatos implements Task {

    Robot robot = new Robot();;
    private String city;
    private String postalcode;

    public IngresarDatos(String city, String postalcode) throws AWTException {
        this.city = city;
        this.postalcode = postalcode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(CITY)
        );

        CiudadElegida();

        actor.attemptsTo(
                Enter.theValue(postalcode).into(CODE),
                Click.on(NEXT_STEP2)
        );
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void CiudadElegida() {
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static IngresarDatos sobreLaDireccion(String city, String postalcode){
        return Tasks.instrumented(IngresarDatos.class,city,postalcode);
    }
}
