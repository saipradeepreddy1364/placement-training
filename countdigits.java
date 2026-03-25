/*import java.util.Scanner;
public class countdigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int digit=0;
        if(n==0)
        {
            digit=1;
        }
        while(n>0)
        {
            n/=10;
            digit++;
        }
        System.out.println("Digits "+digit);
        sc.close();
    }
}*/
import java.util.*;
public class countdigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n==0)
        {
            sum=0;
        }
        while(n>0)
        {
            int a=n%10;
            sum+=a;
            n/=10;
        }
        System.out.println("the  sum of digits is: "+sum);
        sc.close();
    }
}