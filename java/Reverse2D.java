import java.util.Scanner;

public class Reverse2D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[] temp=new int[r*c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[k++]=a[i][j];
            }
        }
        int[] temprever=new int[r*c];
        k=0;
        for(int i=temp.length-1;i>=0;i--){
            temprever[k++]=temp[i];
        }
        k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=temprever[k++];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
