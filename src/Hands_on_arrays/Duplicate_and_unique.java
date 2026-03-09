package Hands_on_arrays;

public class Duplicate_and_unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,7,4,7,9,8,2,9,1};
		int len=arr.length;
		int temp[]=new int[len];
		int j=0;
		int duplicate=0,unique=0;
		for(int i=0;i<len;i++) {
			int count=0;
			if(temp[i]>=0) {
			for(j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					temp[j]=-1;
					count++;
				}
			}
			if(count>0) {
			    duplicate++;
			}
			else {
				unique++;
		}
		}
	}	
		System.out.println("No of duplicate element:"+duplicate+"\n"+"No of unique elemnts:"+unique);
	}

}
