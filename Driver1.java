class Driver1
{
    static
    {
        System.out.println("static block of driver");
        Greeting.greet();
    }
    public static void main(String args[])
    {
        System.out.println("main start");
        Greeting.greet();
        System.out.println("main ends");
    }

}