class Board
{
    int length;
    String color;
    int height;
    int width;
    Board(int length,String color,int height,int width)
    {
        this.length=length;
        this.color=color;
        this.height=height;
        this.width=width;
    }
    public void display()
    {
        System.out.println("height is"+height);
        System.out.println("width is"+width);
        System.out.println("color is"+color);
        System.out.println("length is"+length);
    }
    public static void main(String[] args)
    {
        System.out.println("==========Board 1 details==========");
        Board b1=new Board(12,"black",34,56);
        b1.display();
        System.out.println("==========Board 2 details==========");
        Board b2=new Board(22,"white",54,66);
        b2.display();

    }
}