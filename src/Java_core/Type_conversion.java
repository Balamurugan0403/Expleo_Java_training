package Java_core;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Type_conversion {
	public static void main(String[]args) throws ParseException {
		/* implicit conversion*/
		int i=12;
		long l=i;
		float f=i;
		short k=78;
		
//		System.out.println(l);
//		System.out.println(f);
//		/*explicit conversion*/
//		float y=18.88f;
//		double b=17.8888d;
//		int g=(int)y;
//		float m=(float)b;
//		System.out.println(g);
//        System.out.println(m);	
//        
//        byte by=20;
//        by=(byte)(by*7);
//        System.out.println(by);
//        
//        double res=(f*g)+(l*i)+k;
//        System.out.println(res);
        Scanner console=new Scanner(System.in);
//        String name=console.nextLine();
//        System.out.println("the name "+name+" was devil");
//        console.close();
//        System.out.println("hi"+name);
//        String fname=console.nextLine();
//        System.out.println("fisst "+fname);
        
        
        int id=console.nextInt();
        console.nextLine();
        String moviename=console.nextLine();
        String moviedes=console.nextLine();
        String moviegenre=console.nextLine();
        String movielan=console.nextLine();
        float movierate=console.nextFloat();
        String date=console.next();
        SimpleDateFormat moviereleasedate=new SimpleDateFormat("dd/MM/yyyy");
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
