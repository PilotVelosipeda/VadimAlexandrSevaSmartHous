package main;
public interface ElectricDevice {
    boolean isSwitchedOn();
    void switchOn();
    void switchOf();

    default void toggle() {
        if (isSwitchedOn()) {
            switchOf();
        } else {
            switchOn();
        }
    }
    double getEnergyConsumption();
}