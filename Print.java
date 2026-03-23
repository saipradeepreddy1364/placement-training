public class Print
{
    Print()
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j==0)
                    {
                        System.out.print("*");
                    }
                else if(i==0)
                    {
                        System.out.print(" * ");
                    }
                else if(i==3&&j<5)
                    {
                        System.out.print(" * ");
                    }   
                else if(j==4&&i<4)
                    {
                        System.out.print(" *");
                    }
                else 
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        new Print();
    }
}