package Interface_learn2;

import java.util.*;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] arg) {

        Catalog c = new Catalog();

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        Date date = cal.getTime();
        String todaysdate = dateFormat.format(date);

        Movie m1 = new Movie("AAA","Drama",todaysdate,3);
        Catalog.movieList.add(m1);

        Movie m2 = new Movie("BBB","Story",todaysdate,3);
        Catalog.movieList.add(m2);

        Movie m3 = new Movie("CCC","Drama",todaysdate,3);
        Catalog.movieList.add(m3);

        System.out.println("--------------Searching Movie by Genre----------------");
        c.searchbygenre("Drama");

        System.out.println("--------------Searching Movie by Title----------------");
        c.searchbytitle("BBB");
    }
}