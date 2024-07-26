package mediator.question02;

public interface ATCMediator {
    void sendMessage(String msg, Airplane airplane);
    void addAirplane(Airplane airplane);
}
