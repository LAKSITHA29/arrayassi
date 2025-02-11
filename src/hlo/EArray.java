/*package laks;
import java.util.Scanner;
public class EArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		
		System.out.println("Enter array1:");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter array2:");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int arr3[]=arr1[]+arr2[];
		//sum[]=arr1[]+arr2[];
		for(int i=0;i<=n;i++) {
			System.out.println("Array 1 is:"+arr1[i]);
			System.out.println("Array 2 is:"+arr2[i]);
			System.out.println("Merged array is:"+(arr1[i]+arr2[i]));
		}
	}
}


package laks;
import java.util.Scanner;
public class EArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

       
        int[] arr = new int[25];

       
        System.out.println("enter random num:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == search) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + search + " appears " + count + " times");
        } else {
            System.out.println("The number " + search + " is not present");
        }

   
    }
}*/
package hlo;
import java.util.Arrays;
import java.util.Scanner;
public class EArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n1,n2 and n3:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int arr3[]=new int[n3];
		
		System.out.println("Enter array1:");
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter array2:");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Enter array3:");
		for(int i=0;i<n3;i++) {
			arr3[i]=sc.nextInt();
		}

		int[] arr4 = new int[n1+n2+n3];
        for (int i = 0; i <n1; i++) {
            arr4[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }
        System.out.println("First array:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        //System.out.println();

        System.out.println("\nSecond array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        
        Arrays.sort(arr3);
        System.out.println("\nSorted array:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        //System.out.println();

		/*
		 * for(int i=0;i<=n1;i++) { System.out.println("Array 1 is:"+arr1[i]); } for(int
		 * i=0;i<=n2;i++) { System.out.println("Array 2 is:"+arr2[i]);
		 * //System.out.println("Merged array is:"+arr3[i]); }
		 */
	}
}




		
		