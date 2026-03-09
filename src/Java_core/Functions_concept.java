package Java_core;

import java.util.Scanner;

public class Functions_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String moviename="david",description="feel good",language="english",duration="2.30hrs",releasedate="jan 15",country="America",genre="action";
		getMoviedetails(moviename,description,language,duration,releasedate,country,genre);
		
		
	}

	private static void getMoviedetails(String moviename,String description,String language,String duration,String releasedate,String country,String genre) {
		
		// TODO Auto-generated method stub
		System.out.println("Movie name:"+moviename);
		System.out.println("Movie description:"+description);
		System.out.println("Movie language:"+language);
		System.out.println("Movie duration:"+duration);
		System.out.println("Movie coountry:"+releasedate);
		System.out.println("Movie genre:"+genre);
		
	}
}
