package file;

import java.io.FileOutputStream;

public class Fileoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Welcome to Java portal!Have a great learning";
		try {
			FileOutputStream output=new FileOutputStream("Output.txt");
			byte[]array=data.getBytes();
			output.write(array);
			output.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
