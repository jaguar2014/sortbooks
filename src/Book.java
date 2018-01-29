public class Book implements Comparable<Book>{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Book book) {
        return this.name.compareTo(book.getName());
    }
}
