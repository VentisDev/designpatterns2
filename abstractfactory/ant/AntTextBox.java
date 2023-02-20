package abstractfactory.ant;

import abstractfactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendered by Ant Text Box");
    }
}
