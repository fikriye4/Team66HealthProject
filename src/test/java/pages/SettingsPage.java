package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SettingsPage {
    public SettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
