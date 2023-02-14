public class Computer extends Technique{

    String marka;
    public Computer(){

    }

    public Computer(String name, String brand, int version, String marka) {
        super(name, brand, version);
        this.marka = marka;
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
        return "marka: "+marka+super.toString();    }
}
