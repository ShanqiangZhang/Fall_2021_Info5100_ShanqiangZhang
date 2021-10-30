package Question1;

public class Reference extends Book{
    private String category;


    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }


    @Override
    public String description() {
        return "World Maps(title) all information is real";
    }

    //getter and setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
