package Interface_learn2;

public class Movie {

    private String title;
    private String genre;
    private String date;
    private int cost;

    public Movie(String title, String genre, String date, int cost) {
        this.title = title;
        this.genre = genre;
        this.date = date;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public int getCost() {
        return cost;
    }

    public void getMovieDetails() {
        System.out.println("Movie title: " + title);
        System.out.println("Movie genre: " + genre);
        System.out.println("Movie date: " + date);
        System.out.println("Movie cost: " + cost);
        System.out.println();
    }
}