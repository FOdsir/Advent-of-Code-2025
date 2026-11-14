package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Part1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Advent of Code 2025 - Day 4, Part 1");

        String[] input = Files.readAllLines(Path.of("src/day04/input.txt"))
                .toArray(new String[0]);

        int count = 0;

        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[i].length(); j++){
                if (input[i].charAt(j) == '@') {
                    int neighbors = 0;

                    for (int x = -1; x <= 1; x++){
                        for (int y = -1; y <= 1; y++) {
                            int row = i + x;
                            int col = j + y;

                            if (row >= 0 && row < input.length &&
                                    col >= 0 && col < input[i].length() &&
                                    (x != 0 || y != 0)){

                                if (input[row].charAt(col) == '@'){
                                    neighbors++;
                                }
                            }
                        }
                    }
                    if (neighbors < 4){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}