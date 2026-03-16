import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int digits=0;
        int sum=0;
        int temp=n;
        while(t>0)
        {
            digits++;
            t/=10;
        }
        while(temp>0)
        {
            int d=temp%10;
            sum+=(int)Math.pow(d,digits);
            temp/=10;
        }
        if(sum==n)
        {
            System.out.println("the number is armstrong number");
        }
        else{
            System.out.println("the  number is not an armstrong number");
        }
        sc.close();
    }
}
/*import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int digits = 0;
        int t = n;

        // Count number of digits
        while (t > 0) {
            digits++;
            t = t / 10;
        }

        // Calculate Armstrong sum
        while (temp > 0) {
            int d = temp % 10;
            sum = sum + (int)Math.pow(d, digits);
            temp = temp / 10;
        }

        // Check Armstrong
        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

        sc.close();
    }
}*/