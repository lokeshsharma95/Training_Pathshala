import java.io.*;
import java.util.Scanner;

/**
 * Created by slokesh on 7/20/16.
 */

public class Sixth {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int k=n-1;k>=i;k--)
                System.out.print(" ");
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i,j,k;
        for(i=n-1; i>=1; i--) {
            for(k=1;k<=n-i;k++)
                System.out.print(" ");
            for ( j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
