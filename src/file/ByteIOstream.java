package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteIOstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[128];
		try(FileInputStream fis=new FileInputStream("output.txt")) {
				FileOutputStream fos=new FileOutputStream("output1.txt");
				System.out.println("Bytes available:"+fis.available());
				int count=0, read=0;
				while((read=fis.read(b))!=-1) {
					fos.write(b);
					count+=read;
				}
				System.out.println("total count"+count);
				
	}catch(FileNotFoundException f) {
		System.out.println("file not found"+f);
	}
	catch(IOException e) {
		System.out.println("Io exception"+e);
	}

}}
