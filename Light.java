public class Light extends Device{
    Integer brightness = 100;
    String color = "white";

    public void setBrightness(Integer given_brightness){
        try {
            if (given_brightness > 0 & given_brightness < 100) {
            brightness = given_brightness;
        } else {
            System.out.println("Error: Brightness level out of range.");
        }
        } catch (Error error) {
            System.out.println("Error: Non-integer values entered.");
        }
    }

    public void setColor(String given_color){
        try {
            if (given_color == "white" || given_color == "red" || given_color == "green" || given_color == "blue") {
            color = given_color;
        } else {
            System.out.println("Error: Color not implemented.");
        }
        } catch (Error error) {
            System.out.println("Error: Non-color values entered.");
        }
    }
}
