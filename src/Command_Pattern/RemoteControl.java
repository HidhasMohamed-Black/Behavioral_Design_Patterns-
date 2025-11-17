package Command_Pattern;

public class RemoteControl {
    private Command command;
    private Command lastCommand; // for undo feature

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        lastCommand = command;
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}
