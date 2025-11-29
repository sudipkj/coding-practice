package practice.code.designpatterns.Factory;

public class VehicleFactory {

    public static Vehicle getCarInstance(String car){

        switch(car){

            case "Honda": return new Honda();
            case "Volkswagen": return new Volkswagen();
            default: return null;
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getCarInstance("Honda");
        vehicle.engine();
        vehicle.rolls();
    }
}
