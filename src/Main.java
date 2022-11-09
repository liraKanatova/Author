import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Author author1 = new Author("Vecheslav Aleksandrov", "@-Vecheslav", 'M');
        Author author2 = new Author("Napoleon Hill", "@-Napoleon", 'M');
        Author author3 = new Author("Uval Noi Harari", "@-Uval", 'M');
        Author author4 = new Author("Jon Keho", "@-Jon", 'M');
        Author author5 = new Author("Sara Jio", "@-Sara", 'F');
        Author[] authors = {author1, author2, author3, author4, author5};


        Book book1 = new Book("Zabeg v nebesa", author1, 700, 500);
        Book book2 = new Book("Think and get rich",  author2, 500, 1000);
        Book book3 = new Book("21 lessons for the 21 century ", author3, 1000, 400);
        Book book4 = new Book("The subconscious mind can do everything", author4, 600, 900);
        Book book5 = new Book("Lunnai trupa", author5, 300, 300);

        Book[] books = {book1, book2, book3, book4, book5};
       // findMaxPrice(books);
        //  findByAuthor(scanner.nextLine(), authors,books);

       Scanner scanner1=new Scanner(System.in);
       String name= scanner1.nextLine();
       switch (name){
           case "Vecheslav Aleksandrov":
               System.out.println("Zabeg v nebesa");
               break;
           case "Napoleon Hill":
               System.out.println("Think and get rich");
               break;
           case "Uval Noi Harari":
               System.out.println("21 lessons for the 21 century");
               break;
           case "Jon Keho":
               System.out.println("The subconscious mind can do everything");
               break;
           case "Sara Jio":
               System.out.println("Lunnai trupa");
               break;
       }






    //  findMaxPrice(books);
     //  findByAuthor(scanner.nextLine(), authors,books);



    }

    public static void findMaxPrice(Book[]  books) {
        int max = books[0].getPrice();
        int min = books[0].getPrice();
        for (int i = 0; i < books.length; i++) {
            max = Math.max(max, books[i].getPrice());
            min = Math.min(min, books[i].getPrice());
        }
        System.out.println(max);
        System.out.println(min);

    }
    public static void findByAuthor(String name,Author[] authors,Book[] books){
        for (Author author:authors){
            if(author.getFullName().equals(name) ){
             author.getInfo();
                System.out.println(author.toString());
            }

            for (Book book: books){
                if(book.getName().equals(name)){
                    book.getInfo();
                    System.out.println(book.toString());
                }
            }

        }

    }


        }

