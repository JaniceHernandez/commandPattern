package SmartHomeAutomation;

public class TurnOffCommand implements Command {
    private Object device;

    public TurnOffCommand(Object device) { 
        this.device = device; 
    }
    
    @Override
    public void execute() {
        if (device instanceof Light){
            ((Light) device).turnOff();
        } 
        else if (device instanceof AirConditioner) {
            ((AirConditioner) device).turnOff();
        } 
        else if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).turnOff();
        } 
    }
}