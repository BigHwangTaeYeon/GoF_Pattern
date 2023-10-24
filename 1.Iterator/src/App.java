public class App {
    public static void main(String[] args) throws Exception {

        Item[] items = {
            new Item("CPU", 100),
            new Item("Keyboard", 2000),
            new Item("Mouse", 3000),
            new Item("HDD", 50)
        };

        Array array = new Array(items);
        Iterator it = array.iterator();

        while (it.next()) {
            Item item = (Item) it.current();
            System.out.println(item);
        }

    }
}
