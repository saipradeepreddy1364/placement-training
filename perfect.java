import java.util.Scanner;
public class perfect {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n-1;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("the number is perfect");
        }
        else{
            System.out.println("the number is not a perfect");
        }
        sc.close();
    }   
}
