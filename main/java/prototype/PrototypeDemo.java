package prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Java - Creational Pattern");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie secondMovie = (Movie) registry.createItem("Movie");
        secondMovie.setTitle("Gang of Four");

        System.out.println(secondMovie);
        System.out.println(secondMovie.getRuntime());
        System.out.println(secondMovie.getTitle());
        System.out.println(secondMovie.getUrl());
        
    }

}
