package ProxyPattern;

import java.util.HashMap;

public interface MoviePlatform {
    HashMap<String, Movie> popularMovies();

    Movie getMovie(String movieId);
}
