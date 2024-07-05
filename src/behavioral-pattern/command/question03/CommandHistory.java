package command.question03;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> stack=new Stack<>();

    public void addCommand(Command command){
        stack.push(command);
    }

    public Command remove(){
        return stack.pop();
    }

    public boolean isUndoable(){
        return !stack.isEmpty();
    }
}
