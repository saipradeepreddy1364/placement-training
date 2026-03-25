/*import java.util.Scanner;
public class largestdigit 
{
    public static void main( String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int largest=0;
        int digit;
        if(n==0)
        {
            largest=0;
        }
        else
        {
            while(n>0)
            {
                digit=n%10;
                if(digit>largest)
                {
                    largest=digit;
                }
                n=n/10;

            }
        }
        System.out.println("the largest digit is: "+largest);
        sc.close();
    }     
}
*/
import java.util.Scanner;
public class largestdigit
{  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digits=0;
        int temp=n;
        int largest=0;
        if(n==0)
        {
            digits=1;
        }
        else
        {
            while(temp>0)
            {
                digits++;
                temp/=10;
            }
        }
        int[] a=new int[digits];
        temp=n;
        for(int i=digits-1;i>0;i--)
        {
           a[i]=temp%10;
           temp/=10;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
        }
        System.out.println("the largest of the digits is: "+largest);
        sc.close();
    }
}