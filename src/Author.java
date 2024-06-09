public class Author {
    private String authorsFirstName;
    private String authorsLastName;

    public Author (String authorsFirstName, String authorsLastName) {
        this.authorsFirstName = authorsFirstName;
        this.authorsLastName = authorsLastName;

    }

    public String getAuthorsFirstName (){
        return this.authorsFirstName;
    }
    public String getAuthorsLastName () {
        return this.authorsLastName;
    }



}
