class BagDriver
{
    public static void main(String args[])
    {
        Bag b=new Bag();
        Book bk=new Book();
        //System.out.println("book name is"+bk.book_name);
       // b.getBookName;
        b.addBook();
        b.removeBook();


    }
}
class Bag
{
    String bcolor="red";
    int price=500;
    //Book bk;
    Book bk=new Book();
   
    public void addBook()
    {
        this.bk=bk;
        System.out.println("bood added");
    }

    public void getBookName()
    {
        System.out.println("book name is"+bk.book_name);
    }
    public void removeBook()
    {
        this.bk=null;
        System.out.println("book removed");
    }
}
class Book
{
    String book_name="java";
    int book_id=1;
    int price=50;
}