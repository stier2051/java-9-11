package mun.cookbook.stream;

import java.util.Arrays;
import java.util.List;

public class TakeWithDemo {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Denim Jeans", "Garment", 1500.00),
                new Product("T shirt", "Garment", 500.00),
                new Product("Nike", "Sports", 200.00),
                new Product("Kurtis", "Garment", 300.00)
        );

        productList.stream().takeWhile(e -> e.getProductCategory().equals("Garment")).forEach(System.out::println);
    }
}
