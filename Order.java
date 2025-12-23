class Order {
    Cart cart;

    Order(Cart cart) {
        this.cart = cart;
    }

    void placeOrder() {
        System.out.println("\nOrder placed successfully!");
        System.out.println("Final Amount: " + cart.getTotal());
    }
}
