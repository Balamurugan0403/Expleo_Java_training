package Java_core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Read_input {


	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		 int id=console.nextInt();
	        console.nextLine();
	        String moviename=console.nextLine();
	        String moviedes=console.nextLine();
	        String moviegenre=console.nextLine();
	        String movielan=console.nextLine();
	        float movierate=console.nextFloat();
	        String date=console.next();
	        SimpleDateFormat moviereleasedate=new SimpleDateFormat("dd/MM/yyyy/mm");
	        Date moviedate=moviereleasedate.parse(date);
	        System.out.println("Movie ID:"+id);
	        System.out.println("Movie name:"+moviename);
	        System.out.println("Movie des:"+moviedes);
	        System.out.println("Movie genre:"+moviegenre);
	        System.out.println("Movie lan:"+movielan);
	        System.out.println("Movie rate:"+movierate);
	        System.out.println("Movie release date:"+moviedate);
	        

	}

}
