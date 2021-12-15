package Q4;

import java.util.ArrayList;
import java.util.Date;

public class Movie {
    private String title;
    private Date releaseDate;
    private ArrayList<ActorAndDirector> actor;

    public Movie(String title, Date releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<ActorAndDirector> getActor() {
        return actor;
    }

    public void setActor(ArrayList<ActorAndDirector> actor) {
        this.actor = actor;
    }
}
