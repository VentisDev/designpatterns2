package abstractfactory;

import abstractfactory.ant.AntWidgetFactory;
import abstractfactory.app.ContactForm;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new AntWidgetFactory());
    }
}
