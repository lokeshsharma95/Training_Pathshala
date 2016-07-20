import java.io.*;
import java.util.Scanner;

public class Ninth {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generate(n);
    }
    public static void generate(int n)
    {
        if(n%2==0)
            System.out.print("2");
        for(int i=3;i<=n;i+=2)
        {
            if(n%i==0) {
                if (checkPrime(i) == 0) {
                    System.out.print(","+i);

                }
            }
        }
    }
    public static int checkPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return 1;
        }
        return 0;
    }
}
