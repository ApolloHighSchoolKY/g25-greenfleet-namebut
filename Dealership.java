import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        inventory.add(new Vehicle("Model T"));
        
        inventory.add(new ElectricCar("CyberJunk"));
       
        System.out.println("--- End of Day Report ---");
        
        // TODO: Loop through inventory.
        for(Vehicle vehicle: inventory)
        {
            vehicle.drive(100);
            if(vehicle instanceof ElectricCar)
            {
                if(.GetBatteryPercent() < 50.0)
                {
                    ((ElectricCar)vehicle).charge();
                }
            }
        }
        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
        
    }
}
