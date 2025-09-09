public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══\n");

        System.out.println("Creating orders and adding items...");


        foodOrderingSystem order1 = new foodOrderingSystem("Alice Johnson");
        foodOrderingSystem order2 = new foodOrderingSystem("Bob Smith");
        foodOrderingSystem order3 = new foodOrderingSystem("Charlie Brown");


        try {
            order1.addMultipleItems(
                    new String[]{"Pizza", "Pasta", "Salad"},
                    12.99, 8.75, 2.99
            );
            System.out.println("Items added: Pizza, Pasta, Salad");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            order2.addMultipleItems(
                    new String[]{"Burger", "Fries", "Soda", "Nuggets", "Ice Cream"},
                    8.50, 3.25, 2.00, 6.20, 12.50
            );
            System.out.println("Items added: Burger, Fries");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            order3.addItem("Hotdog", -5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order3.addItem("", 5.50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            order3.addMultipleItems(
                    new String[]{"Taco", "Juice"},
                    7.25, 8.25
            );
            System.out.println("Items added: Taco, Juice");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("\nOrder Results:");
        System.out.println(order1.displayOrder());
        System.out.println(order2.displayOrder());
        System.out.println(order3.displayOrder());


        System.out.println("\nTotal orders created: " + foodOrderingSystem.getTotalOrders());


        System.out.println("All Orders:");
        System.out.printf("- %s: $%.2f\n", order1.getCustomerName(), order1.getTotalAmount());
        System.out.printf("- %s: $%.2f\n", order2.getCustomerName(), order2.getTotalAmount());
        System.out.printf("- %s: $%.2f\n", order3.getCustomerName(), order3.getTotalAmount());


        foodOrderingSystem[] allOrders = {order1, order2, order3};
        foodOrderingSystem largestOrder = allOrders[0];
        for (foodOrderingSystem o : allOrders) {
            if (o.getTotalAmount() > largestOrder.getTotalAmount()) {
                largestOrder = o;
            }
        }

        System.out.printf("Largest order: %s ($%.2f)\n",
                largestOrder.getCustomerName(), largestOrder.getTotalAmount());
    }
}