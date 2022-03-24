package ProxyPattern;

import java.util.Scanner;

public class NetflixProxy {
    private NetflixPlatform netflix;

    public void watchMovieOnNetflix(){
        if (netflix == null){
            netflix =new NetflixPlatform();
        }
        System.out.println(netflix.popularMovies().keySet());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie Id");
        Movie movie = netflix.getMovie(sc.nextLine());
        System.out.println(movie);

    }

}
