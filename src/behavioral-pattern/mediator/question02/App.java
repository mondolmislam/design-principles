package mediator.question02;

public class App {
    public static void main(String[] args) {
        ATCMediator mediator = new ATCMediatorImpl();
        Airplane plane1 = new Airplane(mediator, "Boeing 747");
        Airplane plane2 = new Airplane(mediator, "Airbus A320");
        Airplane plane3 = new Airplane(mediator, "Cessna 172");
        mediator.addAirplane(plane1);
        mediator.addAirplane(plane2);
        mediator.addAirplane(plane3);
        plane1.send("Requesting permission to take off");
        plane2.send("Roger that");
    }
}
