package SmartHomeAutomation;

public class TurnOnCommand implements Command {
    private Object device;

    public TurnOnCommand(Object device) { 
        this.device = device; 
    }

    @Override
    public void execute() {
        if (device instanceof Light){
            ((Light) device).turnOn();
        } 
        else if (device instanceof AirConditioner) {
            ((AirConditioner) device).turnOn();
        } 
        else if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).turnOn();
        } 
    }
}