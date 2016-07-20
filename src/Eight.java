import java.io.*;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=100;i++)
            Fizzbuzz(i);
    }
    public static void Fizzbuzz(int n)
    {
        if(n%15==0)
            System.out.println("FizzBuzz");
        else
        if (n%5==0)
            System.out.println("Buzz");
        else
            if (n%3==0)
                System.out.println("Fizz");
        else
            System.out.println(n);
    }
}
