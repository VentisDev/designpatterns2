package abstractfactory.app;

import abstractfactory.WidgetFactory;


public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
