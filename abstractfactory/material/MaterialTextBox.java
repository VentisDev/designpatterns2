package abstractfactory.material;

import abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendered with Material TextBox");
    }
}
