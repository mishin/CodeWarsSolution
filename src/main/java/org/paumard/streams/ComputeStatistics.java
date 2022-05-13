package org.paumard.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ComputeStatistics {

    public static void main(String[] args) {

        Function<String, String> lineToName =
                line -> line.split(";")[1];

        // https://en.wikipedia.org/wiki/List_of_United_States_cities_by_population
        Path path = Path.of("/Users/nimishin/IdeaProjects/CodeWarsSolution/src/main/resources/data/cities.csv");
        Set<String> cities = null;
        try (Stream<String> lines = Files.lines(path, StandardCharsets.ISO_8859_1)) {

            cities = lines.skip(2)
                    .map(lineToName)
                    .collect(Collectors.toSet());
	/*		cities = lines.skip(2)
				.map(lineToName)
				.collect(Collectors.toSet());
			*/
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("# cities = " + cities.size());

        List<String> citiesWithA = cities.stream()
                .filter(city -> city.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("citiesWithA = " + citiesWithA);

        String[] array = cities.stream().toArray(String[]::new);
        System.out.println("# array = " + array.length);

        String joined = cities.stream()
                .filter(name -> name.length() == 4)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joined);
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
        String collect = Stream.<String>of("one")
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("collect = " + collect);

        int[] basePhone = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phonePart1 = IntStream.of(basePhone)
                .limit(3)
                .mapToObj(number -> String.valueOf(number))
                .collect(Collectors.joining("", "(", ") "));
        System.out.println("phonePart1 = " + phonePart1);

        String phonePart2 = IntStream.of(basePhone)
                .skip(3)
                .mapToObj(number -> String.valueOf(number))
                .collect(Collectors.joining("", "(", ") "));

        String phoneString = IntStream.range(0, basePhone.length)
                .mapToObj(index ->
                        {
                            switch (index) {
                                case 0:
                                    return String.format("(%s", basePhone[index]);
                                case 2:
                                    return String.format("%s) ", basePhone[index]);
                                case 5:
                                    return String.format("%s-", basePhone[index]);
                                default:
                                    return String.format("%s", basePhone[index]);
                            }
                        }
                )
                .collect(Collectors.joining());
        System.out.println("phoneString = " + phoneString);

        var phone = String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                basePhone[0],
                basePhone[1],
                basePhone[2],
                basePhone[3],
                basePhone[4],
                basePhone[5],
                basePhone[6],
                basePhone[7],
                basePhone[8],
                basePhone[9]);


        System.out.println("phone = " + phone);
        Arrays.stream(basePhone)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .replaceFirst("^(\\d{3})(\\d{3})(\\d{4})$", "($1) $2-$3");

    /*


        List<String> citiesWithA = cities.stream()
                .filter(city -> city.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(citiesWithA);

        String[] array = cities.stream().toArray(String[]::new);
        System.out.println("# array = " + array.length);

        String joined =
                cities.stream()
                        .filter(name -> name.length() == 4)
                        .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joined);

        String collect = Stream.<String>of("one")
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Collecting an empty stream: " + collect);*/
    }
}
