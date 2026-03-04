public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model
        super(model);
        // TODO: Set batteryPercent to 100.0
        batteryPercent = 100.0;
    }

    public double GetBatteryPercent(){
        return batteryPercent;
    }
    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override
    public void drive(int distance) {
        // TODO: Call super.drive() 
        super.drive(distance);
        // TODO: Calculate battery loss
        if(batteryPercent <= 0)
        {
            System.out.println("You can't drive anymore, you're outta battery");
        }
        else
        {
            batteryPercent = batteryPercent - (1/5.0);
        }
    }

    public void charge() {
        batteryPercent = 100.0;
    }
}
