package practice.code.designpatterns.decorator;

public class NonVegPizza extends PizzaDecorator {

    NonVegPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake(){
        super.bake();
        System.out.println("Baking Non Veg Pizza");
    }

}
