import java.util.ArrayList;
public class TestOrders{
    public static void main(String[] args){
        
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip coffee";
        item4.name = "capuccino";
        item1.price = 4;
        item2.price = 3.5;
        item3.price = 5;
        item4.price = 4.5;


    

       
        // ArrayList<Item> order2items = new <ArrayList>();
        // ArrayList<Item> order3items = new <ArrayList>();
        // ArrayList<Item> order4items = new <ArrayList>();

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";
        
        order2.items.add(item1);
        order2.total+=item1.price;
        order3.items.add(item4);
        order3.total=item4.price;
        order4.items.add(item2);
        order4.total=(item2.price)*2;

        // order3.add("capuccino");
        order1.ready=true;
        order2.ready=true;
        
        

        System.out.println(order1.name);
        System.out.println(order1.total);
        System.out.println(order2.total);
        System.out.println(order3.total);
        System.out.println(order4.total);
        System.out.printf("Order1 - Ready: %s\n", order1.ready);
        System.out.printf("Order2 - Ready: %s", order2.ready);
        // System.out.println(order4);
    }
}