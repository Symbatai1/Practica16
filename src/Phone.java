public class Phone extends Technique {

   private String model;

    public Phone() {
    }

    public Phone(String model, String name, String brand, int version) {
        super(name, brand, version);
        this.model = model;
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }



    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public String toString() {

        return "model: "+ model +super.toString();
    }
}










