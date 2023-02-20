package AdapterPattern;

import AdapterPattern.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilterAdapter(new Caramel()));
    }
}
