import java.util.*;
class ArrayDemo3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size For * Int *: ");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		
		System.out.println("Enter *Int* "+arrSize+" Array Elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("*Int* Array Elements Are : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}

		System.out.println("\n");


		System.out.println("Enter the Array Size For * Float *: ");
                arrSize = sc.nextInt();
                float arr1[] = new float[arrSize];
                System.out.println("Enter *Float* "+arrSize+" Array Elements :");
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextFloat();
                }
                System.out.print("*Float* Array Elements Are : ");
                for(int i=0;i<arr1.length;i++){
                        System.out.print(arr1[i] +"  ");
                }

		System.out.println("\n");


                System.out.println("Enter the Array Size For * Char *: ");
                arrSize = sc.nextInt();
                char ch[] = new char[arrSize];
                System.out.println("Enter *Char* "+arrSize+" Array Elements :");
                for(int i=0;i<ch.length;i++){
                        ch[i]=sc.next().charAt(0);
                }
                System.out.print("*Char* Array : ");
                for(int i=0;i<ch.length;i++){
                        System.out.print(ch[i] +"  ");
                }

		System.out.println("\n");
		
		System.out.println("Enter the Array Size For * String *: ");
                arrSize = sc.nextInt();
                String s[] = new String[arrSize];
                System.out.println("Enter *String* "+arrSize+" Array Elements :");
                for(int i=0;i<s.length;i++){
                        s[i]=sc.next();
                }
                System.out.print("*String* Array : ");
                for(int i=0;i<s.length;i++){
                        System.out.print(s[i] +"  ");
                }

                System.out.println();
	}
}
