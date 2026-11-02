package day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Part1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Advent of Code 2026 - Day 3, Part 1");
        int result = 0;

        String[] input = Files.readAllLines(Path.of("src/day03/input.txt"))
                .toArray(new String[0]);

        for (String battery : input){
            int max = 0;
            for (int i = 0; i < battery.length(); i++){
                for (int j = i + 1; j < battery.length(); j++){

                    int number = (battery.charAt(i) - '0') * 10
                            + (battery.charAt(j) - '0');

                    if (number > max) {
                        max = number;
                    }
                }
            }
            result += max;
        }
        System.out.println(result);
    }
}