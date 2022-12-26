public class Book {
    final private String name;
    final private Author getAuthorName;
    private int year;

    public Book (String name, Author author, int year){
        this.name = name;
        this.getAuthorName = author;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public Author author(){
        return this.getAuthorName;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }
}
