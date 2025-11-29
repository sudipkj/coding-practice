package practice.code.designpatterns.Factory;

public class Volkswagen implements Vehicle{


    @Override
    public void engine() {
        System.out.println("Volkswagen engine roaring");
    }

    @Override
    public void rolls() {
        System.out.println("Volkswagen car rolling");
    }
}
