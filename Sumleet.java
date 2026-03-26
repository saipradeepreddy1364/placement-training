/*import java.util.Scanner;
    class Sumleet
    {
    public void sum(int[] nums, int target)
    {
            boolean found=false;
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        System.out.println(i+"  "+j);
                        found=true;
                    }
                }
            }
            if(!found)
            {
                System.out.println("No Pair");
            }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int [n];
        int t=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();       
        }
        Sumleet m=new Sumleet();
        m.sum(a,t);
        sc.close();
    }
}*/
import java.util.*;
public class Sumleet
{
    public int[] sum(int[] nums, int target)
    {
        boolean b=true;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println(Arrays.toString(new int[]{nums[i],nums[j]}));
                    b=true;
                    
                }
            }
        }
        if(!b)
        {
            System.out.println("no pair");
        }
        return new int[]{};
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        int t=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Sumleet s=new Sumleet();
        s.sum(a,t);
        sc.close();
    }

}