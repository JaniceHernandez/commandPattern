package SmartHomeAutomation;

public class VolumeDownCommand implements Command {
    private Object device;

    public VolumeDownCommand(Object device) { 
        this.device = device; 
    }
    
    @Override
    public void execute() {
        if (device instanceof Light){
            ((Light) device).brightnessDown();
        } 
        else if (device instanceof AirConditioner) {
            ((AirConditioner) device).tempDown();
        } 
        else if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).volumeDown();
        } 
    }
}