import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//       Stream<Integer> stream = Stream.iterate(1, integer -> integer + 1);        1
//   boolean match = stream
//           .map(String::valueOf)
//           .distinct()
//           .limit(5)
//           .noneMatch(str -> str.length() != 1);
//   System.out.println(match);

//        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");            2
//        List<Integer> integers = new ArrayList<>();
//        for (String s : strings) {
//            integers.add(Integer.parseInt(s));
//        }
//        int multiply = 1;
//        for (int i : integers) {
//            multiply *= i;
//        }
//        System.out.println(multiply);

        int multiply = Stream.of("1", "2", "3", "4", "5")
                .map(Integer::parseInt)
                .reduce(1, (integer, integer2) -> integer * integer2);
        System.out.println(multiply);
    }
}