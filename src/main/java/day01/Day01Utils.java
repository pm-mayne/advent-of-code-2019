package day01;

import java.util.stream.Stream;

public class Day01Utils {
    public static int computeFuel(int inputWeight) {
        return inputWeight / 3 - 2;
    }

    public static Stream<Integer> computeRecursiveFuel(int inputWeight) {
        int current = computeFuel(inputWeight);
        if(current < 0) {
            return Stream.of(0);
        }
        return Stream.concat(Stream.of(current), computeRecursiveFuel(current));
    }
}
