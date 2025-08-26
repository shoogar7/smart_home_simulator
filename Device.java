public class Device {
    Integer id;
    String name;
    Boolean is_on = false;
    public void toggleOnOff(){
        if (is_on){
            is_on = false;
        } else {
            is_on = true;
        }
    }
}
