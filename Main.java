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

        // Testing Device class attributes and methods
        // Device testDevice = new Device();
        // System.out.println(testDevice.is_on);
        // testDevice.toggleOnOff();
        // System.out.println(testDevice.is_on);

        // Testing Light class attributes and methods
        Light testLight = new Light();
        // System.out.println(testLight.is_on);
        // testLight.toggleOnOff();
        // System.out.println(testLight.is_on);
        System.out.println(testLight.brightness);
        testLight.setBrightness(50);
        System.out.println(testLight.brightness);
        // testLight.setBrightness(25.7);
        // System.out.println(testLight.brightness);
        // testLight.setBrightness("bread");
        // System.out.println(testLight.brightness);
        testLight.setBrightness(-5);
        System.out.println(testLight.brightness);

        System.out.println(testLight.color);
        testLight.setColor("green");
        System.out.println(testLight.color);
        testLight.setColor("purple");
        System.out.println(testLight.color);
        testLight.setColor("25");
        System.out.println(testLight.color);
    }
}