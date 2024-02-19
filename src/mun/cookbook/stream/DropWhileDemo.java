package mun.cookbook.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileDemo {
    public static void main(String[] args) {
        List<Customer> customerList = Arrays.asList(
                new Customer(101, "Alex Cerry", 440),
                new Customer(102, "John Smith", 55),
                new Customer(103, "Alan Willis", 770),
                new Customer(104, "Mark Flex", 667)
        );

        List<Customer> eligibleCustomers = customerList.stream()
                .sorted()
                .dropWhile(e -> e.getCustomerBalance() < 500)
                .collect(Collectors.toList());

        for (Customer eligibleCustomer : eligibleCustomers) {
            System.out.println(eligibleCustomer);
        }
    }
}
