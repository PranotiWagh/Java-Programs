class Book
{
    int bid;
    int price;
    String author;

    Book(int bid,int price,String author)
    {
        this.bid=bid;
        this.price=price;
        this.author=author;
    }

    public void printBookDetails()
    {
        System.out.println("book id is"+bid);
        System.out.println("book price is"+price);
        System.out.println("author book is"+author);
    }
}
class Page
{
    String page_title;
    int page_no;

    Page(String page_title,int page_no)
    {
        this.page_title=page_title;
        this.page_no=page_no;
    }

    public String getPageTitle()
    {
        return page_title;
    }

    public int getPageNo()
    {
        return page_no;
    }
    public void printPageAttrinbute()
    {
        System.out.println("Page title is"+page_title);
        System.out.println("Page number is"+page_no);
    }

}

class pageDriver
{
    public static void main(String args[])
    {
        Page p =new Page("abc",12);
        p.printPageAttrinbute();
        Book b=new Book(12,123,"pranoti");
        b.printBookDetails();
    }
}
