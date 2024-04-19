package main;
public abstract class LighingDevice implements ElectricDevice {
    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_BRIGHTNESS = 0D;
    protected final int power;
    protected double brightness;

    public LighingDevice(int power) {
        this.power = power;
    }
    @Override
    public boolean isSwitchedOn() {
        /*return brightness > MIN_BRIGHTNESS;*/
        //Alexandr
        return true;
    }

    @Override
    public void switchOn() {
        setBrightness(MAX_BRIGHTNESS);
    }
    @Override
    public void switchOf() {
        setBrightness(MIN_BRIGHTNESS);
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if  (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = level;
        }
        //Seva develop
    }
    public double getBrightness() {
        return brightness;
    }
    public void changeBrightness(double rate) {
//        double changed = brightness + brightness * rate;
//        setBrightness(changed);
        //Vadim
    }
}