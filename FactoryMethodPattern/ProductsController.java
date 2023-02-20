package FactoryMethodPattern;

import FactoryMethodPattern.Matcha.Controller;
import FactoryMethodPattern.Matcha.MatchaViewEngine;
import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        //get products from a database
        Map<String, Object> context = new HashMap<>();
        //context.put(products);
        render("Products.html", context, new MatchaViewEngine());
    }
}
