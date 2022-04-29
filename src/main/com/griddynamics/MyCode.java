package main.com.griddynamics;
// package whatever; // don't place package name!
// Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
You are developing an application, which analyzes geographical data.
You are given a list of countries, every country has a name, 
population and a continent it belongs to.
Count the number of countries for each 

*/

class MyCode {


    public static void main(String[] args) {

        IntStream.iterate(1, x -> x + 1)
//                .sorted()
                .limit(5)
                .forEach(System.out::println);

        List<String> list= new ArrayList<>(Arrays.asList("A","B","C"));
        list.stream().forEach(x->{
            if (x.equals("A")) {
                list.remove(x);
            }
        });
        //here
        Map<String, Long> result = new HashMap<>();
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Russia", 146, "EURASIA"));
        countries.add(new Country("Belorussia", 9, "EUROPE"));
        countries.add(new Country("India", 1424, "ASIA"));
        countries.add(new Country("Chine", 1415, "ASIA"));
        countries.add(new Country("USA", 333, "NAMERICA"));
        countries.add(new Country("Mexica", 128, "NAMERICA"));
        countries.add(new Country("Canada", 38, "NAMERICA"));
        countries.add(new Country("Indonesia", 277, "OCEANIA"));
        countries.add(new Country("Pakistan", 230, "ASIA"));
        countries.add(new Country("Nigeria", 219, "AFRICA"));
        countries.add(new Country("Brasil", 209, "LAMERICA"));
        countries.add(new Country("Bangladesh", 180, "ASIA"));
        countries.add(new Country("Cuba", 11, "LAMERICA"));
        result = countries.stream()
                .collect(Collectors.groupingBy(Country::getContinent, Collectors.counting()));
        System.out.println("result = " + result);
    }
}

// enum Continent
// {
//     AFRICA, ANTARCTICA, ASIA, EURASIA, AUSTRALIA, EUROPE, NAMERICA, LAMERICA, OCEANIA
// }


class Country {
    private final String name;
    private final Integer population;
    private final String continent;

    Country(String name, Integer population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    // get methods go here

    public String getContinent() {
        return continent;
    }
}
