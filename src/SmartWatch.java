public class SmartWatch extends Technique{

    String colour;

    public SmartWatch(){

    }

    public SmartWatch(String name, String brand, int version, String colour) {
        super(name, brand, version);
        this.colour = colour;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
    @Override
    public String toString() {
        return "colour: "+colour+super.toString();
    }
}
