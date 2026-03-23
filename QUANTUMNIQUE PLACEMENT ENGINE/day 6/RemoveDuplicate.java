package Day_06;

import java.util.*;

public class RemoveDuplicate {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            set.add(val);
        }
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
