import java.util.Scanner;
public class Int_rom 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int[] number={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result="";
        for(int i=0;i<number.length;i++)
        {
            while(a>=number[i])
            {
                result=result+roman[i];
                a-=number[i];
            }
        }
        System.out.println("The roman of the number "+b+" is: "+result);
        sc.close();
    }
}
