import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class olympiadDate {
    private static boolean isValid(HashMap<Integer, Integer> h) {
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTests = scan.nextInt();

        for (int j = 0; j < numTests; j++) {
            HashMap<Integer, Integer> h = new HashMap<>();
            h.put(0, 3);
            h.put(1, 1);
            h.put(2, 2);
            h.put(3, 1);
            h.put(5, 1);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int result = 0;
            for (int i = 0; i < n; i++) {
                int cur = arr[i];
                if (h.containsKey(cur)) {
                    h.put(cur, h.get(cur) - 1);
                }
                if (isValid(h)) {
                    result = i + 1;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
