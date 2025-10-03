package SmartHomeAutomation;

public class Light{
    private int brightness = 1;

    public void turnOn() { 
        System.out.println("Turning on the lights."); 
    }
    public void turnOff() { 
        System.out.println("Turning off the lights."); 
    }

    public void brightnessUp() { 
        brightness++;
        System.out.println("Increase light brightness to " + brightness + "%");
    }
    public void brightnessDown() { 
        if (brightness > 0) {
            brightness--;
            System.out.println("Decrease light brightness to " + brightness + "%");
        }
        else System.out.println("Light is at minimum brightness.");
    }
}
