package command.question01;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        Fan fan=new Fan();

        RemoteControl remoteControl=new RemoteControl();

        remoteControl.addCommand(new LightOnCommand(light));
        remoteControl.addCommand(new FanOnCommand((fan)));
        //light on
        remoteControl.getCommands().get(0).execute();
        // fan one
        remoteControl.getCommands().get(1).execute();
    }
}
