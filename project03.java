package Javapkg;
import java.util.Arrays;
public class project03 {
	public static void main(String args[]) {
		String studentNames[] = {"Jack","Magan","Amy","Sarah","David"};
		Arrays.sort(studentNames);
		System.out.println("Original String array: "+ Arrays.toString(studentNames));
		
		System.out.println("");
		
		System.out.println("Sorted String array: "+Arrays.toString(studentNames));
		
		int[]A = {10,22,52,1,8,24,9};
		
		System.out.println("       ");
		System.out.println("Original numeric array: ");
		System.out.println(" ");
		for(int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		System.out.println(" ");
		System.out.println("Sorted numeric array: "); 
		System.out.println(" ");
	       for(int i=0; i < A.length ; i++)
	       {
	    	  
	    	   for(int j=i+1; j< A.length ; j++)
	    	   {
	    		   int temp = 0;
	    		   {
	    		   if (A[i]>A[j])
	    				   {
	    				  
	    			   temp = A[i];
	    			   A[i]=A[j];
	    			   A[j]=temp;
	    				   }
	    	   }
	       }
	       
	        
	        
	        	System.out.println(A[i]);
	        }

	}
}
	
	    		 


