public class LibrarySystemTest {
    public static void main(String[] args) {
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM TEST ===\n");
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("B001", "Java Programming", "James Gosling", "978-0135166307", 800, "Programming");
        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 42, "October", true);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");

        System.out.println("=== Adding Items to Library ===");
        manager.addItem(book1);
        System.out.println("Added: Book - " + book1.title + " by " + book1.author);
        manager.addItem(mag1);
        System.out.println("Added: Magazine - " + mag1.title + " by " + mag1.author);
        manager.addItem(dvd1);
        System.out.println("Added: DVD - " + dvd1.title + " by " + dvd1.author + "\n");

        manager.displayAllItems();

        System.out.println("=== Testing Borrowing ===");
        Student student = new Student("U001", "John Smith", "john@example.com", "S123", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "drsmith@example.com", "Engineering", "Professor");

        manager.borrowItem("B001", student.getName(), student);
        System.out.println("Student " + student.getName() + " borrowed: " + book1.title);
        manager.borrowItem("D001", faculty.getName(), faculty);
        System.out.println("Faculty " + faculty.getName() + " borrowed: " + dvd1.title + "\n");

        manager.displayAvailableItems();

        System.out.println("=== Testing Late Fees ===");
        System.out.printf("%s - 5 days late: $%.2f%n", book1.title, book1.calculateLateFee(5));
        System.out.printf("%s - 3 days late: $%.2f%n%n", dvd1.title, dvd1.calculateLateFee(3));

        System.out.println("=== Testing User Information ===");
        System.out.println("Student: " + student.getName() + " (" + student.getMajor() + ") - " + student.getBorrowedItemsCount() + " items borrowed");
        System.out.println("Faculty: " + faculty.getName() + " (" + faculty.getDepartment() + ") - " + faculty.getBorrowedItemsCount() + " items borrowed");
    }
}
