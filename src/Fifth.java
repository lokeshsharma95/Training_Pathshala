import java.io.*;
import java.util.Scanner;

/**
 * Created by slokesh on 7/20/16.
 */

public class Fifth {
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

    }

}
