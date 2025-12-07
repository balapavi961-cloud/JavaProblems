import java.util.Scanner;

public class MagicArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum=sum+a[i][j];
                }
            }
        }
        int[] temp = new int[r*c];
        int k=0;
        for(int i=0;i<r;i++){
            int sum1=0;
            for(int j=0;j<c;j++){
                sum1+=a[i][j];
            }
            temp[k++]=sum1;
        }
        for(int j=0;j<c;j++){
            int sum2=0;
            for(int i=0;i<r;i++){
                sum2+=a[j][i];

            }
            temp[k++]=sum2;
        }
        boolean f=false;
        for(int i=0;i<temp.length;i++){
            if(temp[i]==sum) f=true;
        }
        System.out.println(f?"Magic":"Not Magic");
    }
}
