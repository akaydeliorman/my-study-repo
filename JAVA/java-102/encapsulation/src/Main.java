public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOftheRings = new Book("Lord Of The Rings", -100);
        lordOftheRings.setPageNumber(100);
        System.out.println(lordOftheRings.getPageNumber());
    }
}