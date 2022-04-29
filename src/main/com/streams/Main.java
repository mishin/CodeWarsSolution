package main.com.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

        //старый подход Императивный
/*        List<Animal> predators = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getClassification().equals(Classification.PREDATOR)) {
                predators.add(animal);
            }
        }*/


        //новый подход Декларативный
        //Filter
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());

//        predators.forEach(System.out::println);
        //Sort
        List<Animal> sorted = animals.stream()
                        .sorted(Comparator.comparing(Animal::getAge)
                                .thenComparing(Animal::getClassification).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
        //All match
        boolean allMatch= animals.stream()
                .allMatch(animal -> animal.getAge()>10);
        System.out.println("allMatch = " + allMatch);
        //Any match
        boolean anyMatch= animals.stream()
                .anyMatch(animal -> animal.getAge()>10);
        System.out.println("anyMatch = " + anyMatch);
        //None match
        boolean noneMatch= animals.stream()
                .noneMatch(animal -> animal.getName().equals("Медведь"));
        System.out.println("noneMatch = " + noneMatch);
//Max
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);
        //Min
        animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);
        //Group
        Map<Classification, List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        classificationListMap.forEach(((classification, animals1) -> {
            System.out.println("classification = " + classification);
            animals1.forEach(System.out::println);
        }));
/*        Optional<String> predatorsAge=  animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR));*/

        Optional<String> predatorsAge = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        predatorsAge.ifPresent(System.out::println);
    }

    private static List<Animal> getAnimals(){
        return Arrays.asList(
                new Animal("Слон", 20, Classification.HERBIVORE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 7, Classification.HERBIVORE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVORE),
                new Animal("Рысь", 2, Classification.PREDATOR),
                new Animal("Динозавр", 200, Classification.PREDATOR)
        );
    }
}
