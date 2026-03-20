import java.util.*;

public class AddOnServiceManager {

    private Map<String, List<Service>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    public void addService(String reservationId, Service service) {
        servicesByReservation
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);
    }

    public double calculateTotalServiceCost(String reservationId) {
        List<Service> services = servicesByReservation
                .getOrDefault(reservationId, new ArrayList<>());
        double total = 0;
        for (Service service : services) {
            total += service.getCost();
        }
        return total;
    }
}