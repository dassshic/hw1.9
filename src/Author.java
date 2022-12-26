public class Author {
    final private String name;
    final private String surname;

    public Author (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getAuthorName(){
        return this.name + this.surname;
    }
}
