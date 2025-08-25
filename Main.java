import java.util.ArrayList;
import org.w3c.dom.css.RGBColor;

public class Main{
    public class Device{
        Integer id;
        String name;
        Boolean is_on;
    }
    private class Light extends Device{
        Integer brightness;
        RGBColor color;
    }
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
}