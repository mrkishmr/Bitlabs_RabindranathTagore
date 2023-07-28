//4. Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook

import java.util.*;

class Book
  {
    Scanner s=new Scanner(System.in);
    String title;
    String author;
    long isbn;
    String publisher;
    System.out.println("Enter the count of books");
    int n=s.nextInt();
    System.out.println("Enter book details");
    Book()
    {
      title=s.nextLine();
      isbn=s.nextLong();
      publisher=s.nextLine();
    }
    void getTitle()
    {
      System.out.println("The title of the book is "+title);
    }
    void getAuthor()
    {
      System.out.println("The author of "+title+" is "+author);
    }
  }
class Author
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      Book b[]=new Book[n];
      Book a=new Book();
      System.out.println("Enter name");
      a.author=s.nextLine();
      System.out.println("Enter email");
      String email=sc.nextLine();
      
    }
  }