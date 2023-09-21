package Practice6.task11;

enum Systems{
    KELVIN, CELCII, FARENGATE
}

public class Kelvin implements Convertable{

    private double temperature;

    public Kelvin(double temperature) {
        this.temperature = temperature;

    }

    @Override
    public double convert(Systems s) {
        switch (s){
            case KELVIN -> {
                return temperature+273.15d;
            }
            case FARENGATE -> {
                return (temperature*2)*0.9+32;
            }
        }
        return temperature;
    };

    public static void main(String[] args) {
        Kelvin converter = new Kelvin(20);
        System.out.println(converter.convert(Systems.FARENGATE));
        System.out.println(converter.convert(Systems.KELVIN));
    }
}
