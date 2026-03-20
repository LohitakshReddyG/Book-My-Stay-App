public class UseCase7AddOnServiceSelection {

    public void run() {
        System.out.println("Add-On Service Selection");

        AddOnServiceManager manager = new AddOnServiceManager();

        manager.addService("Single-1", new Service("Breakfast", 1500.0));

        System.out.println("Reservation ID: Single-1");
        System.out.println("Total Add-On Cost: "
                + manager.calculateTotalServiceCost("Single-1"));
    }
}