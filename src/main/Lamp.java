package main;
public class Lamp extends LighingDevice {
    public Lamp (int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }
}