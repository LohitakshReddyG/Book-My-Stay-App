public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=== Hotel Room Initialization ===\n");
        InventorySetup setup = new InventorySetup();
        setup.displayInventory();

        System.out.println("\n=== Room Search ===\n");
        RoomSearch roomSearch = new RoomSearch();
        roomSearch.search();

        System.out.println("\n=== Room Allocation Processing ===\n");
        BookingRequestQueue queue = new BookingRequestQueue();
        queue.addRequest(new Reservation("Abhi", "Single"));
        queue.addRequest(new Reservation("Subha", "Single"));
        queue.addRequest(new Reservation("Vanmathi", "Suite"));

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService allocationService = new RoomAllocationService();
        allocationService.processQueue(queue, inventory);

        System.out.println();
        AddOnServiceSelection addOn = new AddOnServiceSelection();
        addOn.run();

        System.out.println();
        BookingHistoryReport historyReport = new BookingHistoryReport();
        historyReport.run();

        System.out.println();
        ErrorHandlingValidation validation = new ErrorHandlingValidation();
        validation.run();

        System.out.println();
        BookingCancellation cancellation = new BookingCancellation();
        cancellation.run();

        System.out.println();
        ConcurrentBookingSimulation concurrent = new ConcurrentBookingSimulation();
        concurrent.run();
    }
}