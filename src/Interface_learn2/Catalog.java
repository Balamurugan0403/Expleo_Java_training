package Interface_learn2;

import java.util.ArrayList;

public class Catalog {

    static ArrayList<Movie> movieList = new ArrayList<>();

    public void searchbygenre(String genre) {

        for(Movie m : movieList) {
            if(m.getGenre().equalsIgnoreCase(genre)) {
                m.getMovieDetails();
            }
        }
    }

    public void searchbytitle(String title) {

        for(Movie m : movieList) {
            if(m.getTitle().equalsIgnoreCase(title)) {
                m.getMovieDetails();
            }
        }
    }
}