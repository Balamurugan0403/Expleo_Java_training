package file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hardlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path existingFilePath= Paths.get("C:\\Personal\\Training\\Example\\Symbolic_Link\\Test.txt");
			Path hardLinkPath=Paths.get("C:\\\\Test_link.txt");
			Files.createLink(hardLinkPath, existingFilePath);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
