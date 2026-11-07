package day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Part2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Advent of Code 2025 - Day 3, Part 2");
        long result = 0;

        String[] input = Files.readAllLines(Path.of("src/day03/input.txt"))
                .toArray(new String[0]);

        for (String battery : input) {
            int start = 0;
            long max = 0;

            StringBuilder number = new StringBuilder();

            for (int i = 0; i < 12; i++) {
                int best = start;

                for (int j = start; j <= battery.length() - (12 - i); j++) {
                    if (battery.charAt(j) > battery.charAt(best)) {
                        best = j;
                    }
                }
                number.append(battery.charAt(best));
                start = best + 1;
            }
            max = Long.parseLong(number.toString());
            result += max;
        }
        System.out.println(result);
    }
}