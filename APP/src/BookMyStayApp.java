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
        UseCase7AddOnServiceSelection addOn = new UseCase7AddOnServiceSelection();
        addOn.run();

        System.out.println();
        UseCase8BookingHistoryReport historyReport = new UseCase8BookingHistoryReport();
        historyReport.run();
    }
}