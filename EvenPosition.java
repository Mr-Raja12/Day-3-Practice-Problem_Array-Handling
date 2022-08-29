               /*To check even position element In Array*/


public class EvenPosition {
   public static void main(String[] args) {  
 
	        int [] arr = new int [] {1, 2, 3, 4, 5,6};  
	        System.out.println("Elements of given array present on even position: ");   
	        for (int i = 1; i < arr.length; i = i+2) {  
	            System.out.println(arr[i]);  
	        }  
	    }  
	}  

/*In this program, we need to print the element which is present on even position. 
Even positioned element can be found by traversing 
the array and incrementing the value of i by 2.*/