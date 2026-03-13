public class RoomSearch {
    public static void main(String[] args) {
        System.out.println("Room Search\n");
        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();
        // Create inventory
        RoomInventory inventory = new RoomInventory();
        // Create search service
        RoomSearchService searchService = new RoomSearchService();
        // Perform search
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}