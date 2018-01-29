import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        String ans = "";

        do{
            System.out.println("Please enter the name of the book ");
            String name = input.nextLine();
            Book book = new Book();
            book.setName(name);
            books.add(book);

             System.out.println("Do you want to add more books  press (y/n)");
             ans = input.nextLine();

        }while(!ans.equalsIgnoreCase("n"));


        Collections.sort(books);
        for (Book b :
                books) {
            System.out.println(b.getName());
        }

    }

}

