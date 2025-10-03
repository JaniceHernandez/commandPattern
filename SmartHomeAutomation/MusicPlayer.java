package SmartHomeAutomation;

public class MusicPlayer {
    private int volume = 50; // default volume

    public void turnOn() { 
        System.out.println("Start playing music."); 
    }
    public void turnOff() { 
        System.out.println("Stop playing music."); 
    }

    public void volumeUp() { 
        volume++;
        System.out.println("Increase volume to " + volume + "%");
    }
    public void volumeDown() { 
        if (volume > 0) {
            volume--;
            System.out.println("Decrease volume to " + volume + "%");
        }
        else System.out.println("Volume is at minimum.");
    }
}    