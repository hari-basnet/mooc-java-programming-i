
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        
        Item book = new Item("Lord of the rings", 8);
        Item phone = new Item("Nokia 3210", 8);
        Item brick = new Item("brick", 8);

        Suitcase suitcase = new Suitcase(20);

        suitcase.addItem(book);

        suitcase.addItem(phone);

        suitcase.addItem(brick);
        System.out.println(suitcase);
    }

}
