import java.util.*;
class Sample{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i=0;i<n;arr[i++]=sc.nextInt());
   int l=sc.nextInt();
   int h=sc.nextInt();
   int count=0;
   for(int i=0;i<n;i++){
     for(int j=i+1;j<n;j++){
      int xor=arr[i] ^ arr[j];
      if(xor>=l && xor<=h){
        count++;
      }
     }
   }
 System.out.println(count);
}
}