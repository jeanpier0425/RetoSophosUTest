package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPage {

    public static final Target JOIN_TODAY  = Target.the("boton login").located(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Join Today')]"));
    public static final Target NOMBRE  = Target.the("campo nombre").located(By.xpath("//input[@id='firstName']"));
    public static final Target APELLIDO  = Target.the("campo apellido").located(By.xpath("//input[@id='lastName']"));
    public static final Target EMAIL  = Target.the("campo email").located(By.xpath("//input[@id='email']"));
    public static final Target MES  = Target.the("mes").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target DIA  = Target.the("dia").located(By.xpath("//select[@id='birthDay']"));
    public static final Target ANIO  = Target.the("año").located(By.xpath("//select[@id='birthYear']"));
    public static final Target NEXT  = Target.the("boton next").located(By.xpath("//span[text()='Next: Location']"));
    public static final Target CITY  = Target.the("campo ciudad").located(By.xpath("//input[@id='city']"));
    public static final Target CODE  = Target.the("campo code").located(By.xpath("//input[@id='zip']"));
    public static final Target NEXT_STEP2  = Target.the("boton next step 2").located(By.xpath("//span[text()='Next: Devices']"));
    public static final Target NEXT_STEP3  = Target.the("boton next step 3").located(By.xpath("//span[text()='Next: Last Step']"));
    public static final Target PASS  = Target.the("campo password").located(By.xpath("//input[@id='password']"));
    public static final Target CONFIRM_PASS  = Target.the("campo confirmar password").located(By.xpath("//input[@id='confirmPassword']"));
    public static final Target TYC  = Target.the("check terminos y condiciones").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target PRIVACY  = Target.the("check privacy").located(By.xpath("//input[@id='privacySetting']"));
    public static final Target COMPLETE_SETUP  = Target.the("boton").located(By.xpath("//span[text()='Complete Setup']"));



}
