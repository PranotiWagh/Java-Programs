class Area
{
    public static double areaOfRectangle(int length,int breadth)
    {
        double area=length*breadth;
        return area;
    
    }

    public static double areaOfSquare(int side)
    {
        double area=side*side;
        return area;
    }

    public static double areaOfCircle(double radius)
    {
        double area=3.14*radius*radius;
        return area;
    }

    public static void main(String args[])
    {
        System.out.println(areaOfRectangle(12,13));
        System.out.println(areaOfSquare(4));
        double area=areaOfCircle(6);
        System.out.println(area);
    }
}