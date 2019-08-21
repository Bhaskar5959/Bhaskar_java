import java.util.Scanner;
import java.util.*;
public class PrimeNumber{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= s.nextInt();
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println("Given num is not  prime" + n);

            }

            else
            {
                System.out.println("Given num is  a prime");
            }
            break;

        }
    }

}
