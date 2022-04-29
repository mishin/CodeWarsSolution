package main.com.streams;

import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
//assume implementation of a Person class that has a constructor for name
//and age, along with appropriate set and get methods
        List<Person> people = Arrays.asList(new Person("Person 1", 20), new Person("Person 2", 25));
        int result = people.stream().reduce(0, (currAge, user) -> currAge + user.getAge(), Integer::sum);
        System.out.println(result);

    }
}
