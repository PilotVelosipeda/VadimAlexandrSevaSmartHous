package main;
public class Chandeller extends LighingDevice {
    public static final int LAMP_BRIGHTNESS_STEPS = 2;
    public static final double CONSUMPTION_COFF = 1.095;
    private final int lampsCount;

    public Chandeller(int power, int lampsCount) {
        super(power);
        this.lampsCount = lampsCount;
    }

    public void setBrightness(double level) {
        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEPS);
        int stepsCount = (int) Math.round(level / step);
        brightness = stepsCount * step;
        super.setBrightness(brightness);
    }

    @Override
    public double getEnergyConsumption() {
        return power * Math.pow(brightness, CONSUMPTION_COFF);
    }
}
