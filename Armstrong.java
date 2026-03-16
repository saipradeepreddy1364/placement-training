import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int digits=0;
        int t=n;
        while(t>0)
        {
            digits++;
            t/=10;
        }
        while(temp>0)
        {
            int d=temp % 10;
            sum+=Math.pow(d,digits);
            temp/=10;
        }
        if(sum==n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
        sc.close();
    }
}