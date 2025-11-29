package practice.code.designpatterns.decorator;

public class VegPizzaDecorator extends PizzaDecorator {

    VegPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake(){
        super.bake();
        System.out.println("Baking Veg Pizza");
    }
}
