class Books{
    String title;
    String author;
}

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        int x= 0;
        myBooks[0].title = "The Graphes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java CookBook";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";


        while(x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.print(myBooks[x].author);
            System.out.println();
            x+=1;
        }
    }

}
//Exception in thread "main" java.lang.NullPointerException: Cannot assign field "title" because "myBooks[0]" is null
//THis wont compile bcz no books been initiated
//to fix this we should initiate Books
//Books[] myBooks = new Books[3];
//the above means myBooks array can hold 3 items