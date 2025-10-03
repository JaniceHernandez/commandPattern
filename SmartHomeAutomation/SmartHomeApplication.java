package SmartHomeAutomation;

public class SmartHomeApplication {
    public static void main(String[] args) {
        
        // Devices
        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        MusicPlayer player = new MusicPlayer();

        RemoteControl remote = new RemoteControl();

        // Light 
        remote.setCommand(new TurnOnCommand(light)); remote.pressButton();
        remote.setCommand(new VolumeUpCommand(light)); remote.pressButton();
        remote.setCommand(new VolumeDownCommand(light)); remote.pressButton();
        remote.setCommand(new TurnOffCommand(light)); remote.pressButton();

        // Airconditioner 
        remote.setCommand(new TurnOnCommand(ac)); remote.pressButton();
        remote.setCommand(new VolumeUpCommand(ac)); remote.pressButton();
        remote.setCommand(new VolumeDownCommand(ac)); remote.pressButton();
        remote.setCommand(new TurnOffCommand(ac)); remote.pressButton();

        // Music Player 
        remote.setCommand(new TurnOnCommand(player)); remote.pressButton();
        remote.setCommand(new VolumeUpCommand(player)); remote.pressButton();
        remote.setCommand(new VolumeDownCommand(player)); remote.pressButton();
        remote.setCommand(new TurnOffCommand(player)); remote.pressButton();
    }
}