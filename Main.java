public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 800);

        System.out.println("Available Products:");
        p1.display();
        p2.display();

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.viewCart();

        Order order = new Order(cart);
        order.placeOrder();
    }
}
