package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class byteiostream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []b=new char[128];
		try (FileReader fr=new FileReader("output.txt") ;
				FileWriter fw=new FileWriter("output1.txt")) {
					int count=0, read=0;
					while((read=fr.read(b))!=-1) {
						fw.write(b);
						System.out.println(Arrays.toString(b));
						count+=read;
					}
					System.out.println("Total count:"+count+" characterrs");
				}
				catch(FileNotFoundException f) {
					System.out.println("File"+args[0]+"not found");
		}
				catch(IOException e) {
					System.out.println("IOException"+e);
				}
	}

}
