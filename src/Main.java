public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Mawa Bear", "Kyle Gonzales", 90);
        Book book2 = new Book("Mining the Cat", "Juris Ko", 80);
        Book book3 = new Book("I Am Yours", "Razo Sir Paps", 70);

        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        book2.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book2.displayInfo();

        book3.displayInfo();
        book3.returnBook();
        book3.returnBook();




    }
}