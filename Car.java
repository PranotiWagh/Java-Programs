class Car
{
    String model;
    String color;
    double price;
    {
        System.out.println("non static block");
    }
    public void display()
    {
        System.out.println("car model is "+model);
        System.out.println("car color is "+color);
        System.out.println("car price is "+price);
    }
    public static void main(String args[])
    {
        Car c1= new Car();
        c1.display();
    }
}
