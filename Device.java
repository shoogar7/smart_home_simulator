public class Device {
    Integer id;
    String name;
    Boolean is_on = false;
    public void toggleOnOff(){
        is_on = !is_on;
    }
}
