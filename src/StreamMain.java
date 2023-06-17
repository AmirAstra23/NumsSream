import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> listInteger = List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
                .stream().filter(integer -> integer > 0)
                .filter(integer -> integer % 2 == 0).sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());

        System.out.println(listInteger);

    }
}
