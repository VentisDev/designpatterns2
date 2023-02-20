package CommandPattern.Editor;

import java.util.*;


public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }

}
