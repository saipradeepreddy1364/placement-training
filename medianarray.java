import java.util.*;
public class medianarray
{
    public void sort1(int[] nums1)
    {
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=i+1;j<nums1.length;j++)
            {
                if(nums1[i]>nums1[j])
                {
                    nums1[i]=nums1[i]+nums1[j];
                    nums1[j]=nums1[i]-nums1[j];
                    nums1[i]=nums1[i]-nums1[j];
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    public void sort2(int[] nums2)
    {
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=i+1;j<nums2.length;j++)
            {
                if(nums2[i]>nums2[j])
                {
                    nums2[i]=nums2[i]+nums2[j];
                    nums2[j]=nums2[i]-nums2[j];
                    nums2[i]=nums2[i]-nums2[j];
                }
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int [] a=new int[n1];
        int [] b=new int[n2];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n2;j++)
        {
            b[j]=sc.nextInt();

        }
        medianarray m=new medianarray();
        m.sort1(a);
        m.sort2(b);
        sc.close();
    }
}