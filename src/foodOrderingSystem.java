import java.util.ArrayList;

public class foodOrderingSystem {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private static int totalOrders = 0;


    public foodOrderingSystem(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        totalOrders++;
    }

    public void addItem(String item, double price) {
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        items.add(item);
        prices.add(price);
    }

    public void addMultipleItems(String[] itemsArray, double... pricesArray) {
        if (itemsArray.length != pricesArray.length) {
            throw new IllegalArgumentException("Items and prices count mismatch");
        }

        for (int i = 0; i < itemsArray.length; i++) {
            try {
                addItem(itemsArray[i], pricesArray[i]);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public double getTotalAmount() {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public String getOrderSize() {
        int count = items.size();
        if (count == 0) return "Empty order";
        if (count <= 3) return "Small";
        if (count <= 6) return "Medium";
        return "Large";
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getItemCount() {
        return items.size();
    }

    public String displayOrder() {
        return String.format("Order for %s: %d items, Total: $%.2f, Size: %s",
                customerName, getItemCount(), getTotalAmount(), getOrderSize());
    }
}