package FactoryMethodPattern;

import FactoryMethodPattern.Matcha.Controller;
import FactoryMethodPattern.Matcha.ViewEngine;
import FactoryMethodPattern.sharp.SharpViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
