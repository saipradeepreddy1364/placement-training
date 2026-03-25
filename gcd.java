import java.util.Scanner;
public class gcd 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int a=n1;
        int b=n2;
        while(a!=b)
            {
                if(a>b)
                {
                    a=a-b;
                }
                else{
                    b=b-a;
                }
            }
            int lcm=(n1*n2)/a;
            System.out.println("the GCD of two numbers is "+a);
            System.out.println("the LCM of two numbeers is: "+lcm);
            sc.close();
    }    
}
