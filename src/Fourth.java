import java.io.*;
import java.util.Scanner;

/**
 * Created by slokesh on 7/20/16.
 */

public class Fourth {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
