import java.util.Scanner;
public class pow 
{
    public static double mypow(double x, int n)
    {
        if(n==0)
        {
            return 1.0;
        }
        if(n<0)
        {
            if(n==Integer.MIN_VALUE)
            {
                return 1/(mypow(x, Integer.MAX_VALUE)*x);
            }
        return 1/mypow(x,-n);
        }
        double half=mypow(x,n/2);
        if(n%2==0)
        {
            return half*half;
        }
        else
        {
            return half*half*x;
        }
    }
public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    double x=sc.nextDouble();
    int n=sc.nextInt();
    sc.close();
    System.out.println(mypow(x,n));

}
}
