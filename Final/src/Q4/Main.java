package Q4;

import sun.misc.ClassFileTransformer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {
        //create list
        Date date1 = new GregorianCalendar(1994, Calendar.FEBRUARY, 1).getTime();
        Date date2 = new GregorianCalendar(1997, Calendar.FEBRUARY, 2).getTime();
        Date date3 = new GregorianCalendar(2007, Calendar.FEBRUARY, 3).getTime();
        Date date4 = new GregorianCalendar(1993, Calendar.FEBRUARY, 4).getTime();
        Date date5 = new GregorianCalendar(2021, Calendar.FEBRUARY, 5).getTime();
        Date date6 = new GregorianCalendar(2000, Calendar.FEBRUARY, 6).getTime();
        Date date7 = new GregorianCalendar(1999, Calendar.FEBRUARY, 7).getTime();
        Movie movie1 = new Movie("movie1", date1);
        Movie movie2 = new Movie("movie2", date2);
        Movie movie3 = new Movie("movie3", date3);
        Movie movie4 = new Movie("movie4", date4);
        Movie movie5 = new Movie("movie5", date5);
        Movie movie6 = new Movie("movie6", date6);
        Movie movie7 = new Movie("movie7", date7);
        Date year2000 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime();
        Date year1990 = new GregorianCalendar(1990, Calendar.FEBRUARY, 1).getTime();
        Date timeTest = new GregorianCalendar(1995, Calendar.FEBRUARY, 1).getTime();

        Genre genre1 = new Genre("genre1");
        Genre genre2 = new Genre("genre2");
        Netflix netflix = new Netflix("Netflix");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);

        genre1.addMovie(movie1);
        genre1.addMovie(movie2);
        genre1.addMovie(movie3);
        genre1.addMovie(movie4);

        genre2.addMovie(movie5);
        genre2.addMovie(movie6);
        genre2.addMovie(movie7);

        List<Genre> Netflex = new ArrayList<>();
        Netflex.add(genre1);
        Netflex.add(genre2);

        System.out.println();
        System.out.println("add classic in front of year ");
        System.out.println("-----------------------------");
        Netflex.stream()
                .flatMap(genre -> genre.getMovies().stream())
                //last three realeased movies
                .sorted((m1, m2) -> m1.getReleaseDate().compareTo(m2.getReleaseDate())).limit(3)
                //classic movie modify
                .filter(movie -> movie.getReleaseDate().before(year2000))
                .forEach(movie -> System.out.println("classic " .concat(movie.getTitle())));
        System.out.println();



        //predicates condition by year range
        Predicate<Movie> after1900 = movie -> movie.getReleaseDate().after(year1990);
        Predicate<Movie> before2000 = movie -> movie.getReleaseDate().before(year2000);

        printThelistByYearRange(movies,"between 1990-2000 years", after1900,before2000);

       //comparator to sort title
        System.out.println("-----------------");
        System.out.println("tittle comparator: ");
        System.out.println("--------------");
        Collections.sort(movies, (m1,m2) -> m1.getTitle().compareTo(m2.getTitle()));
        for (Movie moive: movies) {
            System.out.println("tittle: " + moive.getTitle());
        }

        //add year to title
        System.out.println();
        System.out.println("add year to title");
        System.out.println("------------------");
        Function<Movie, String> addYearToTitile = (Movie movie) -> {
            return movie.getReleaseDate() + movie.getTitle();
        };
        System.out.println(addYearToTitile.apply(movie1));

    }

    //print method
    private static void printThelistByYearRange(ArrayList<Movie> movielist, String movieByYearRange, Predicate<Movie> yearRange1, Predicate<Movie> yearRange2){
        System.out.println("--------------");
        System.out.println(movieByYearRange);
        System.out.println("-------------");
        for (Movie moive: movielist) {
            if (yearRange1.test(moive) && yearRange2.test(moive)) {
                System.out.println("movie name: " + moive.getTitle() + " years:" + moive.getReleaseDate());
            }
        }
    }
}
