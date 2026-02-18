import java.util.*;
 
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
 
            int whiteCount = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W') {
                    whiteCount++;
                }
            }
 
            int minRecolor = whiteCount;
            for (int i = k; i < n; i++) {
                if (s.charAt(i - k) == 'W') {
                    whiteCount--;
                }
                if (s.charAt(i) == 'W') {
                    whiteCount++;
                }
 
                minRecolor = Math.min(minRecolor, whiteCount);
            }
 
            System.out.println(minRecolor);
        }
    }
}