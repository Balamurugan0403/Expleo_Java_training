package Control_flow_assign;

public class Printing_a_to_z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char start='a';
		char end='z';
		for(int i=0;i<13;i++) {
			System.out.print(""+(char)(start+i)+(char)(end-i)+" ");
		}
		for(int i=12;i>=0;i--) {
			System.out.print(""+(char)(end-i)+(char)(start+i)+" ");
		}

	}

}
