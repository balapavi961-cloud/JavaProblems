import java.util.*;

public class SecondLargestandSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int[] a=new int[s];
        for(int i=0;i<s;a[i++]=sc.nextInt());
        int max=Arrays.stream(a).max().getAsInt();
        int min=Arrays.stream(a).min().getAsInt();
        int smax=0;
        int smin=a[0];
        for(int i=0;i<s;i++){
            if(a[i]>smax && a[i]!=max){
                smax=a[i];
            }
            if(a[i]<smin && a[i]!=min){
                smin=a[i];
            }
        }
        System.out.println(smax);
        System.out.println(smin);
    }
}
