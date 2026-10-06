class Book {
    int bookid;
    String title;
    String author;
    double price;

    static int count = 0;
    Book(int id,String t,String a,double p) {
        bookid=id;
        title=t;
        author=a;
        price=p;
        count++;
    }

    void display() {
         System.out.println("BOOKID:"+ bookid);
         System.out.println("TITLE:"+title);
         System.out.println("AUTHOR:"+author);
         System.out.println("PRICE:"+price);    

    }

    void search(int id) {
        if(bookid==id) {
            System.out.println("book found:"+title);

        }
        else {
            System.out.println("book not found");
        }
    }

    void search(String t) {
        if(title.equalsIgnoreCase(t))
            System.out.println("book found:"+title);
        else
            System.out.println("book not found");

    }

    Book costlier(Book b) {
        if(price>b.price)
            return this;
        else
            return b;
    }



}
public class Program {
    public static void main(String args[]) {
        Book b1 =new Book(101,"java","james",500);
        Book b2 =new Book(102,"python","gudio",400);
        Book b3 =new Book(103,"data structure","mark alien",650);



        b1.display();
        System.out.println();
        b2.display();
        System.out.println();
        b3.display();
        System.out.println();
        b1.search(101);
        b2.search("python");
        Book expensive = b1.costlier(b3);

        System.out.println("COSTLIER BOOK:");
        expensive.display();

        System.out.println("\n total books created:"+Book.count);





    }

}