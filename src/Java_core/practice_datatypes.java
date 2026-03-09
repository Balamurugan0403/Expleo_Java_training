package Java_core;

public class practice_datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		double b=7;
//		int c=a/b;
//		System.out.println(b);
		
		int m=200;
		byte n=(byte)m;
		System.out.println(n);
		// 200-256 = -56 because bytes ranges from 127 to -128
        int y=127; // it is the range value if above 127 
        //it will subtract and copnverted to byte 
        byte z=(byte)y;
        System.out.println(z);
        
        int e=-129;
        byte f=(byte)e;
        System.out.println(f);
        // 256 + (-129) = 127 for negative range it will add 256.
        char let='R';
        float l=let;
        System.out.println(l);

	}

}
