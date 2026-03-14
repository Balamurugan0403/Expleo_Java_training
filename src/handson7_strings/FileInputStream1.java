package handson7_strings;
import java.io.FileInputStream;
public class FileInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			FileInputStream input=new FileInputStream("handson7_strings/Removedduplicates.java");
//			System.out.println("Data in the file");
//			int i=input.read();
//			while(i!=1) {
//				System.out.println(char[i]);
//				i=input.read();
//				
//			}
//			input.close();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		StringBuilder s=new StringBuilder("programming");
		System.out.println(s.delete(4,10));
	}
	

	
}
