package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Part2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Advent of Code 2026 - Day 2, Part 2");
        long result = 0;

        String[] input = Files.readAllLines(Path.of("src/day02/input.txt"))
                .toArray(new String[0]);
        String[] ranges = input[0].split(",");

        for (String range : ranges){
            String[] numbers = range.split("-");
            long start = Long.parseLong(numbers[0]);
            long end = Long.parseLong(numbers[1]);

            for (long i = start; i <= end; i++){
                String number = String.valueOf(i);

                for (int length = 1; length <= number.length() / 2; length++){
                    if (number.length() % length == 0){
                        String part = number.substring(0, length);
                        String repeated = part.repeat(number.length() / length);

                        if (number.equals(repeated)){
                            result += i;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}