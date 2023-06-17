import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 5, 16, -1, -2,
                0, 32, 3, 5, 8, 23, 4);

        List<Integer> positiveAndEven = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i) % 2 == 0) {
                positiveAndEven.add(list.get(i));
            }
        }
        Collections.sort(positiveAndEven);
        System.out.println(positiveAndEven);
    }
}