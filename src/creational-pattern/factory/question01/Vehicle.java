package factory.question01;

public abstract class Vehicle {
    private double capacity;
    private double efficiency;
    private double rentalCost;

    public Vehicle(double capacity, double efficiency, double rentalCost) {
        this.capacity = capacity;
        this.efficiency = efficiency;
        this.rentalCost = rentalCost;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public double getRentalCost() {
        return rentalCost;
    }
}
