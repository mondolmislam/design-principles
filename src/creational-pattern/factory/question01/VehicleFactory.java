package factory.question01;

public class VehicleFactory {
    public static Vehicle createVehicle(String type){
        if (type.equalsIgnoreCase("car")){
            return new Car();
        }else if (type.equalsIgnoreCase("bike")){
            return new Bike();
        }else if (type.equalsIgnoreCase("scooter")){
            return new Scooter();
        }
        return null;
    }
}
