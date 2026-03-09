package interface_learn3;

public class Movie {
	private String title;
	private String description;
	private int rating;
	private String language;
	private String country;
	private String genre;

	public Movie(String title, String description, int rating, String language, String country, String genre) {
	        this.title = title;
	        this.description = description;
	        this.rating = rating;
	        this.language = language;
	        this.country = country;
	        this.genre = genre;
	}
	public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getMovieDetail() {
        return "Movie [title=" + title + ", genre=" + description +
                ", rating=" + rating + ", language=" + language +
                ", country=" + country + ", genre=" + genre + "]";
    }


}
