package day01;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Day01Test {

    @Test
    public void day_01_part_1() {
        try (Stream<String> lines = Files.lines(Paths.get("src/test/data/day01_1"))) {
            long result = lines.map(Integer::parseInt)
                    .map(Day01Utils::computeFuel)
                    .reduce(0, Integer::sum);
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test
    public void day_01_part_2() {
        try (Stream<String> lines = Files.lines(Paths.get("src/test/data/day01_1"))) {
            long result = lines.map(Integer::parseInt)
                    .flatMap(Day01Utils::computeRecursiveFuel)
                    .reduce(0, Integer::sum);
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
