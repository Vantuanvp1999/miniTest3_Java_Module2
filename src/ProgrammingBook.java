public class ProgrammingBook extends Book {
    private String language;
    private String Framework;

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        Framework = framework;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        Framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return Framework;
    }

    public void setFramework(String framework) {
        Framework = framework;
    }

    @Override
    public double getFinalPrice() {
        return this.getPrice()*95/100;
    }
}
