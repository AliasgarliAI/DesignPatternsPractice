package ProxyPattern;

public class Connection {
    public static void connectToServer(MoviePlatform moviePlatform) throws InterruptedException {
        System.out.println("Connecting to " + moviePlatform.getClass().getName() +". . .");

        Thread.sleep(3000);
    }
}
