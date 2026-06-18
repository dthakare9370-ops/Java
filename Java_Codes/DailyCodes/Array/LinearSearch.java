import java.util.*;
class LinearSearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int size = sc.nextInt();

		System.out.println("Enter the Array Elements :");
		int a[] = new int[size];
		for(int i=0;i<size;i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter Elements to be Search  : ");
		int target = sc.nextInt();

		boolean flag = false;
		for(int i=0;i<size;i++){
			if(target == a[i]){
				flag = true;
				break;
			}
		}
		if(flag == false){
			System.out.println(target+" not Found");
		}else{
			System.out.println(target+" is Found");
		}
	}
}
