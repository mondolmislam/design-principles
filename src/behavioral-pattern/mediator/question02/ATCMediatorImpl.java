package mediator.question02;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator{
    private List<Airplane> airplanes;

    public ATCMediatorImpl(){
        airplanes=new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, Airplane airplane) {
        for(Airplane a: airplanes){
            if (a==airplane)
                airplane.receive(msg);
        }
    }

    @Override
    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }
}
