package Q4;

import java.util.ArrayList;

public class Netflix {
    private String name;
    private ArrayList<Genre> genrelist;

    public Netflix(String name) {
        this.name = name;
        this.genrelist = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGenre(Genre genre){
        genrelist.add(genre);
    }
}
