package SmartHomeAutomation;

public class AirConditioner {
    private int temperature = 24; // Default temperature

    public void turnOn() { 
        System.out.println("Start cooling the room."); 
    }
    public void turnOff() { 
        System.out.println("Stop cooling the room."); 
    }

    public void tempUp() { 
        temperature++;
        System.out.println("Increase temperature to " + temperature + "°C");
    }
    public void tempDown() { 
        temperature--;
        System.out.println("Decrease temperature to " + temperature + "°C");
    }
}
