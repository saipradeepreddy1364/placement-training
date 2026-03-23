class square
{
    void area(int side)
    {
        System.out.println("the area of Suare is "+side*side);
    } 
    void area(int l,int b)
    {
        System.out.println("the area of rectangle is: "+l*b);
    }
    void area(double r)
    {
        System.out.println("the area of circle is: "+r*r*Math.PI);
    }
}
public class AreaCalculator {
    public static void main(String[] args)
    {
        square s=new square();
        s.area(5);
        s.area(3,5);
        s.area(3.0);
    }
}
