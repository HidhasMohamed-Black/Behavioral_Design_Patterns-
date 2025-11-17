package Command_Pattern;

public class CommandMain {
    public static void main(String[] args) {

        Light light = new Light();
        Fan fan = new Fan();

        RemoteControl remote = new RemoteControl();

        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command lightOff = new LightOffCommand(light);
        Command fanOff = new FanOffCommand(fan);

        // Light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Fan ON
        remote.setCommand(fanOn);
        remote.pressButton();

        // Light OFF
        remote.setCommand(lightOff);
        remote.pressButton();

        // Fan OFF
        remote.setCommand(fanOff);
        remote.pressButton();

        // last command
        System.out.println("\nUndoing last command:");
        remote.pressUndo();
    }
}
