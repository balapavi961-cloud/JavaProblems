import java.util.*;
 
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            if (k == 2) {
                boolean even = false;
                for (int x : arr) {
                    if (x % 2 == 0) {
                        even = true;
                        break;
                    }
                }
                System.out.println(even ? 0 : 1);
            }
 
            else if (k == 3) {
                int ans = Integer.MAX_VALUE;
                for (int x : arr) {
                    if (x % 3 == 0) {
                        ans = 0;
                        break;
                    }
                    ans = Math.min(ans, 3 - (x % 3));
                }
                System.out.println(ans);
            }
 
            else if (k == 5) {
                int ans = Integer.MAX_VALUE;
                for (int x : arr) {
                    if (x % 5 == 0) {
                        ans = 0;
                        break;
                    }
                    ans = Math.min(ans, 5 - (x % 5));
                }
                System.out.println(ans);
            }
 
            else if (k == 4) {
                int evenCount = 0;
                int ans = Integer.MAX_VALUE;
 
                for (int x : arr) {
                    if (x % 2 == 0) evenCount++;
                    ans = Math.min(ans, (4 - (x % 4)) % 4);
                }
 
                if (evenCount >= 2) {
                    System.out.println(0);
                } else {
                    int costToMakeTwoEven = (evenCount == 1) ? 1 : 2;
                    System.out.println(Math.min(ans, costToMakeTwoEven));
                }
            }
        }
    }
}