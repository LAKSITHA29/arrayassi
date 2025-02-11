package hlo;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}Arrays.sort(arr);
		 System.out.print("Sorted array is: ");
		for(int index:arr) {
		  System.out.print(index+" "); 
		}
	}
}
