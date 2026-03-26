import java.util.Scanner;
public class sqrt
{
    public double mySqrt(int x) 
    {
        return Math.sqrt(x);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sqrt s=new sqrt();
        System.out.println(s.mySqrt(n));
        sc.close();
    }
}
