package practice.code.designpatterns.Factory;

public class Honda implements Vehicle{


    @Override
    public void engine() {
        System.out.println("Honda Engine Roars");
    }

    @Override
    public void rolls() {
        System.out.println("Honda Wheels Rolling");
    }
}
