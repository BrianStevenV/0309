import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Arroz", 30.5, "Alimentos", 50));
        products.add(new Product("Leche", 20.0, "Alimentos", 0));
        products.add(new Product("Laptop", 1500.0, "Electrónicos", 10));
        products.add(new Product("TV", 800.0, "Electrónicos", 5));
        products.add(new Product("Mesa", 120.0, "Hogar", 15));

        products.stream().filter(product -> product.getStock() > 0 && product.getPrice() < 50).forEach(System.out::println);
        products.stream().forEach(name -> System.out.println(name.getName()));
        System.out.println(products.stream().mapToDouble(Product::getPrice).sum());
    }
}