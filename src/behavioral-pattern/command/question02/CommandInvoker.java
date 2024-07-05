package command.question02;

import java.util.Stack;

public class CommandInvoker {
    private Stack<Command> commandHistory=new Stack<>();

    public void executeCommand(Command command){
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand(){
        if (!commandHistory.isEmpty()){
            Command lastCommand=commandHistory.pop();
            lastCommand.undo();
        }
    }
}
