package practice.code.designpatterns.decorator;

public class PizzaDecorator implements Pizza{

    private Pizza pizza;

    PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public void bake() {
        pizza.bake();
        System.out.println("Adding more toppings");
    }
}
