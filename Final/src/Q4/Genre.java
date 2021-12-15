package Q4;

import java.util.ArrayList;

public class Genre {
    private String name;
    private ArrayList<Movie> movielist;

    public Genre(String name) {
        this.name = name;
        movielist = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movielist.add(movie);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMovies() {
        return movielist;
    }
}
