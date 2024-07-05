package command.question01;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commands;
    public RemoteControl(){
        commands=new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }
}
