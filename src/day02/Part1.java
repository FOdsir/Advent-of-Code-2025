package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Part1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Advent of Code 2026 - Day 2");
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

                if (number.length() % 2 == 0){
                    int middle = number.length() / 2;
                    String first = number.substring(0, middle);
                    String second = number.substring(middle);

                    if (first.equals(second)) {
                        result += i;
                    }
                }
            }
        }
        System.out.println(result);
    }
}