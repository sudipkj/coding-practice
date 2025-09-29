package practice.code.designpatterns.decorator;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Plan Pizza");
    }
}
