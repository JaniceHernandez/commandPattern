package SmartHomeAutomation;

public class VolumeUpCommand implements Command {
    private Object device;

    public VolumeUpCommand(Object device) { 
        this.device = device; 
    }
    
    @Override
    public void execute() {
        if (device instanceof Light){
            ((Light) device).brightnessUp();
        } 
        else if (device instanceof AirConditioner) {
            ((AirConditioner) device).tempUp();
        } 
        else if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).volumeUp();
        } 
    }
}