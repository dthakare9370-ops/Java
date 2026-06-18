import java.util.*;
class ArrrayDemo2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		
		System.out.println("Enter "+arrSize+" Array Elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Array Elements Are : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}

		System.out.println();
	}
}
