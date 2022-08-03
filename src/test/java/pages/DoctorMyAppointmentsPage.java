package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorMyAppointmentsPage {

    public DoctorMyAppointmentsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
