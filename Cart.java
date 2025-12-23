import java.util.ArrayList;

class Cart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void viewCart() {
        double total = 0;
        System.out.println("\nCart Items:");
        for (Product p : products) {
            System.out.println(p.name  +" : " + p.price);
            total += p.price;
        }
        System.out.println("Total:  " + total);
    }

    double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}
