package CommandPattern;

import CommandPattern.fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new addCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }
}
