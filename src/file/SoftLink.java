package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path existingFilePath=Paths.get("C:\\Users\\ksman\\OneDrive\\Desktop\\Personal\\Training\\Test.txt");
		Path symLinkPath=Paths.get("C:\\Test_link.txt");
		Path p=Paths.get("C:/Users/ksman/OneDrive/Desktop/Java_expleo_training/Smartcliff_java");
		Boolean result=Files.exists(p);
		System.out.println("exists:"+result);
		System.out.println("isreadable:"+Files.isReadable(p));
		try {
		
			Files.createSymbolicLink(symLinkPath,existingFilePath);
			
		}
		catch(IOException x){
			System.err.println(x);
			
		}
		catch(UnsupportedOperationException x) {
			System.err.println(x);
		}

	}

}
