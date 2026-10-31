package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Part2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Advent of Code 2025 - Day 1, Part 2");
        int result = 0;
        int counter = 50;

        String[] input = Files.readAllLines(Path.of("src/day01/input.txt"))
                .toArray(new String[0]);

        for (String s : input) {
            String direction = s.substring(0, 1);
            int number = Integer.parseInt(s.substring(1));

            for (int i = 0; i < number; i++) {
                if (direction.equals("R")) {
                    counter++;
                } else if (direction.equals("L")) {
                    counter--;
                }

                counter = Math.floorMod(counter, 100);

                if (counter == 0) {
                    result++;
                }

            }
        }
        System.out.println("The result is: " + result);
    }
}