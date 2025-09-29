package practice.code.designpatterns.decorator;

public class TestDecoarator {
    public static void main(String[] args) {
        Pizza pizza =  new VegPizzaDecorator(new PlainPizza());
        pizza.bake();
    }
}
