package hlo;
import java.util.Scanner;
public class Duplicatenum{

////public class EqualChocolateSharing {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no.of.friends");
//        int N = sc.nextInt();
//        int[] chocolates = new int[N];
//        int totalChoco = 0;
//        
//        for (int i = 0; i < N; i++) {
//            chocolates[i] = sc.nextInt();
//            totalChoco += chocolates[i];
//        }
//        
//        if (totalChoco % N == 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);	        
	        int[] arun = new int[10];
	        int[] naveen = new int[10];
	        int arunSum = 0, naveenSum = 0;
	        
	        System.out.print("Arun dice choice:");
	        for (int i = 0; i < 10; i++) {
	            arun[i] = sc.nextInt();
	            arunSum += arun[i];
	        }
	        
	        System.out.print("Naveen dice choice:");
	        for (int i = 0; i < 10; i++) {
	            naveen[i] = sc.nextInt();
	            naveenSum += naveen[i];
	        }
	        
	        if (arunSum > naveenSum) {
	            System.out.println("Arun Wins!!!");
	        } else if (naveenSum > arunSum) {
	            System.out.println("Naveen Wins!!!");
	        } 
	    }
	}
