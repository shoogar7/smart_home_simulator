import java.util.ArrayList;

public class Main{
    private class Thermostat extends Device{
        Integer current_temperature;
        Integer target_temperature;
    }
    private class Room{
        String name;
        ArrayList<Device> devices;
    }
    private class House{
        String name;
        ArrayList<Room> rooms;
    }

    public static void main(String[] args) {
        Device testDevice = new Device();
        System.out.println(testDevice.is_on);
        testDevice.toggleOnOff();
        System.out.println(testDevice.is_on);
    }
}