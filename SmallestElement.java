                /*Find Smallest number in Array*/


import java.util.Scanner;
public class SmallestElement {
public static void main(String[] args) {
	int a[]=new int[5];int min;
	Scanner r=new Scanner(System.in);
	System.out.println("Enter Array Elemet");
	for(int i=0;i<a.length;i++)
	{
		a[i]=r.nextInt();
	}
	min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
    System.out.println("Smallest Element "+min);
}
}
