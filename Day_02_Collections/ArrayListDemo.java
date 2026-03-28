import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an Amazon-like Cart
        ArrayList<String> cart = new ArrayList<>();

        // Add items to cart
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");

        // View the full cart
        System.out.println("My Cart: " + cart);

        // Access the first item (Index 0)
        System.out.println("First item: " + cart.get(0));

        // Remove an item
        cart.remove("Mouse");

        // Final status
        System.out.println("After remove: " + cart);
        System.out.println("Total items in cart: " + cart.size());
    }
}
