package practice.code.designpatterns.decorator;

public class VegPizzaDecorator extends AbstractDecorator{

    VegPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake(){
        super.bake();
        System.out.println("Baking Veg Pizza");
    }
}
