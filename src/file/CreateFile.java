package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path path1=Paths.get("C:/Users/ksman/OneDrive/Desktop/Java_expleo_training/Smartcliff_java/src/practice/Sample.java");
			if(!Files.exists(path1)) {
				Files.createFile(path1);
					System.out.println("File created");
			}
			else {
				System.out.println("File alraedy exists");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
