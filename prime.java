import java.util.Scanner;
public class prime {
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count+=1;
            }

        }
        if(count==2)
        {
            System.out.println("the number " +n +" is prime");
        }
        else 
        {
            System.out.println("the number is not a prime");
        }
        sc.close();
    }
}
