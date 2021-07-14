package com.sistecredito.pruebadafiti.tasks;

import com.sistecredito.pruebadafiti.interactions.Search;
import com.sistecredito.pruebadafiti.models.DataRegistation;
import com.sistecredito.pruebadafiti.userinterfaces.CommonElements;
import com.sistecredito.pruebadafiti.userinterfaces.MyAccountSection;
import com.sistecredito.pruebadafiti.userinterfaces.RegistrerSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registrer implements Task {

    private DataRegistation dataRegistation;

    public Registrer(DataRegistation dataRegistation) {
        this.dataRegistation = dataRegistation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CommonElements.MY_ACCOUNT),
                Click.on(MyAccountSection.REGISTER_OPTION),
                Click.on(MyAccountSection.CREATE_ACCOUNT),
                Enter.theValue(dataRegistation.getEmail()).into(RegistrerSection.EMAIL),
                Enter.theValue(dataRegistation.getPass()).into(RegistrerSection.PASS),
                Enter.theValue(dataRegistation.getPass()).into(RegistrerSection.REPEAT_PASS),
                Click.on(RegistrerSection.DOCUMENT_TYPE),
                Click.on(RegistrerSection.CC_DOCUMENT),
                Enter.theValue(dataRegistation.getDocumentNumber()).into(RegistrerSection.DOCUMENT_NUMBER),
                Enter.theValue(dataRegistation.getName()).into(RegistrerSection.NAME),
                Enter.theValue(dataRegistation.getLastName()).into(RegistrerSection.LAST_NAME),
                Enter.theValue(dataRegistation.getBirthDate()).into(RegistrerSection.BIRTH_DATE),
                Click.on(RegistrerSection.GENDER),
                Click.on(RegistrerSection.MASCULINO_GENDER),
                Click.on(RegistrerSection.BUTTON_SUSCRIPTION),
                Search.theElement(RegistrerSection.SAVE_BUTTON)
        );
    }

    public static Registrer inTheApp(DataRegistation dataRegistation) {
        return Tasks.instrumented(Registrer.class, dataRegistation);
    }
}
