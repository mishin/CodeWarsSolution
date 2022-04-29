package main.com.streams;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CountOrderAmountForEachDay {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(LocalDate.of(2021, 9, 21), 8.5),
                new Order(LocalDate.of(2021, 9, 22), 2.5),
                new Order(LocalDate.of(2021, 9, 21), 4),
                new Order(LocalDate.of(2021, 9, 19), 10.8),
                new Order(LocalDate.of(2021, 9, 20), 0.9),
                new Order(LocalDate.of(2021, 9, 22), 4.5)
        );

        System.out.println(countSummaryPriceForDays(orders));
        System.out.println(countOrdersByDate(orders));
    }

    private static Map<LocalDate, Double> countSummaryPriceForDays(List<Order> orders) {
        // TODO implementation here
        return orders.stream()
                .collect(groupingBy(Order::getCreationDate, summingDouble(Order::getPrice)));
    }

    private static Map<LocalDate, Long> countOrdersByDate(List<Order> orders) {
        // TODO implementation here
        return orders.stream()
                .collect(groupingBy(Order::getCreationDate, counting()));
    }

    private static Map<LocalDate, Long> countOrdersByDate2(List<Order> orders) {
        Map<LocalDate, Long> map = new HashMap<>();
        orders.stream().forEach(e -> {
            Long count = map.getOrDefault(e.getCreationDate(), (long) 0);
            count++;
            map.put(e.getCreationDate(), count);
        } );
        return map;
    }

    static class Order {
        private final LocalDate creationDate;
        private final double price;

        public Order(LocalDate creationDate, double price) {
            this.creationDate = creationDate;
            this.price = price;
        }

        public LocalDate getCreationDate() {
            return creationDate;
        }

        public double getPrice() {
            return price;
        }
    }
}
