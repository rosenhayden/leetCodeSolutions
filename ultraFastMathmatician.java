import java.util.Scanner;
import java.util.ArrayList;
public class ultraFastMathmatician {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aStr = scan.next();
        String bStr = scan.next();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (char ch : aStr.toCharArray()) {
            a.add(Character.getNumericValue(ch));
        }
        for (char ch : bStr.toCharArray()) {
            b.add(Character.getNumericValue(ch));
        }
        int[] out = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) == b.get(i)) {
                out[i] = 0;
                System.out.print(0);
            } else {
                out[i] = 1;
                System.out.print(1);
            }
        }
    }
}
