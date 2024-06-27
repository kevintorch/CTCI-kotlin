package Big_O;

import java.util.*;

public class Sample {
    private static HashMap<Integer, Integer> table = new HashMap<>();
    private static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        int testCases = Integer.parseInt(args[0]);
        int size = Integer.parseInt(args[1]);
        for (int i = 0; i < size; i++) {
            int dollType = Integer.parseInt(args[i + 2]);
            if (list.contains(dollType)) {
                list.remove(dollType);
            } else {
                list.add(dollType);
            }
        }

        if (!list.isEmpty()) {
            System.out.println(list.getFirst());
        } else {
            System.out.println();
        }
    }
}
