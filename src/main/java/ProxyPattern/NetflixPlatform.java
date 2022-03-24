package ProxyPattern;

import java.util.*;
import java.util.stream.Collectors;


public class NetflixPlatform implements MoviePlatform {


    @Override
    public HashMap<String, Movie> popularMovies() {
        HashMap<String, Movie> foundMovies = new HashMap<>();
        List<String> movieGenres = new ArrayList<>();
        foundMovies.put("TheLastKingdom", new Movie("1", Arrays.asList("War", "British", "Violence"), 8.9));
        foundMovies.put("Pera_Palace", new Movie("2", Arrays.asList("BasedOnBooks", "Turkish", "Thriller"), 8.5));
        foundMovies.put("Punisher", new Movie("3", Arrays.asList("War", "Drama", "Violence"), 6.9));
        return foundMovies;
    }

    @Override
    public Movie getMovie(String movieId2) {
        try {
            Connection.connectToServer(this);
        } catch (Exception ex) {
            System.out.println("Connection failed..." + "\r" + "\r");
            ex.getStackTrace();
        }
        Optional<Movie> any = popularMovies().values().stream().filter(x -> x.getMovieId().equals(movieId2)).findAny();
        return any.get();
    }
}
