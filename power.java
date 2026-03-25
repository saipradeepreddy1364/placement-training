import java.util.Scanner;
public class power 
{
    public void pow(double a,int b)
    {
        double result=Math.pow(a,b);
        System.out.println(a+" power of  "+b+" is "+result);
    } 
public static void main(String[] args)
{
    Scanner b=new Scanner(System.in);
    Double c=b.nextDouble();
    int d=b.nextInt();
    power p=new power();
    p.pow(c,d);
    b.close();
}
}
