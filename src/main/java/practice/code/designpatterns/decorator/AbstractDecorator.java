package practice.code.designpatterns.decorator;

public class AbstractDecorator implements Pizza{

    private Pizza pizza;

    AbstractDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public void bake() {
        pizza.bake();
        System.out.println("Adding more toppings");
    }
}
