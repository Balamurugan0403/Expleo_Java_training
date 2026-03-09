package Hands_on_arrays;

public class Remove_the_duplicate_medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,7,4,7,9,8,2,9,1};
		int len=arr.length;
		int unique[] = new int[len];
	    int k = 0;
	    for(int i=0;i<len;i++) {
	    	boolean duplicate = false;
	    	for(int j=0;j<k;j++) {
	    		if(arr[i] == unique[j]) {
	    			duplicate = true;
	                break;
	                }
	            }
	    	if(!duplicate) {
	    		unique[k] = arr[i];
	            k++;
	            }
	    }
	    System.out.println("Unique elemnts are:");
        for(int i=0;i<k;i++) {
            System.out.print(unique[i]+" ");
        }

}
}