package file;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Path p1=Paths.get("C:\\Users\\ksman\\OneDrive\\Desktop\\Java_expleo_training\\Smartcliff_java\\src\\practice");
			Path p2=p1.subpath(1,4);
			System.out.println(p2);
			Path normalizedPath=p1.normalize();
//			Path p2=Paths.get("C:/Users/ksman/OneDrive/Desktop/Java_expleo_training/Smartcliff_java/src/innerclasseslearn");
			System.out.println("normalized path:"+normalizedPath);
			Path subPath=p1.subpath(1, 3);
			System.out.println("Subpath:"+subPath);
			System.out.println("getFileName:"+p1.getFileName());
			System.out.println("getParent:"+p1.getParent());
			System.out.println("getNamecount:"+p1.getNameCount());
			System.out.println("getRoot:"+p1.getRoot());
			System.out.println("isAbsolute:"+p1.isAbsolute());
			System.out.println("toabsolute:"+p1.toAbsolutePath());
			System.out.println("to URI:"+p1.toUri());
			if(p1.equals(p2))
				System.out.println("Both are equal");
			else
				System.out.println("both are not equal");
			FileSystem fs=FileSystems.getDefault();
			Path p3=fs.getPath("C:/Users/ksman/OneDrive/Desktop/Java_expleo_training/Smartcliff_java/src/innerclasseslearn");
			System.out.println(p3);
			
			
	}

}
