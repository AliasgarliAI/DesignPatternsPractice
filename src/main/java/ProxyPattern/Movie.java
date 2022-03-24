package ProxyPattern;

import java.util.List;
import java.util.Objects;

public class Movie {

    private String movieId;
    private List<String> movieGenres;
    private double movieIMBD;

    public Movie(String movieId, List<String> movieGenres, double movieIMBD) {
        this.movieId = movieId;
        this.movieGenres = movieGenres;
        this.movieIMBD = movieIMBD;
    }

    public String getMovieId() {
        return movieId;
    }

    public List<String> getMovieName() {
        return movieGenres;
    }

    @Override
    public String toString() {

        return "movieId: " + movieId +"\r\n"
                + "movieGenres: " + movieGenres.toString() +"\r\n"
                + "movieIMBD: " + movieIMBD;
    }

    public double getMovieIMBD() {
        return movieIMBD;
    }

}
