package interface_learn3;
import java.util.ArrayList;
import java.util.List;
public class Maininterface implements SearchBygenre,Searchbytitle{
	 private static List<Movie> movieList = new ArrayList<>();

	    public void searchByTitle(String title) {
	        for (Movie movie : movieList) {
	            if (movie.getTitle().equalsIgnoreCase(title)) {
	                System.out.println(movie.getMovieDetail());
	            }
	        }
	    }
	    
	    public void searchByGenre(String genre) {
	        for (Movie movie : movieList) {
	            if (movie.getGenre().equalsIgnoreCase(genre)) {
	                System.out.println(movie.getMovieDetail());
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Maininterface m = new Maininterface();

        Movie m1 = new Movie("Inception", "Sci-Fi", 1,
                "English", "USA", "Movie");

        movieList.add(m1);
        

        System.out.println("Search by Title:");
        m.searchByTitle("Inception");

        System.out.println("Search by Genre:");
        m.searchByGenre("Sci-Fi");


	}

}
