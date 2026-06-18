import java.util.*;
class ArrayDemo4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		char arr1[] = new char[5];
		String arr2[] = new String[5];
		float arr3[] = new float[5];

		System.out.print("Int Empty Array Elements Are : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}

		System.out.println();
		 
		System.out.print("Float Empty Array Elements Are : ");
                for(int i=0;i<arr3.length;i++){
                        System.out.print(arr3[i] +" ");
                }

                System.out.println();

		System.out.print("Char Empty Array Elements Are : ");
                for(int i=0;i<arr1.length;i++){
                        System.out.print(arr1[i] +" ");
                }

                System.out.println();

		System.out.print("String Empty Array Elements Are : ");
                for(int i=0;i<arr2.length;i++){
                        System.out.print(arr2[i] +" ");
                }

                System.out.println();
	}
}
