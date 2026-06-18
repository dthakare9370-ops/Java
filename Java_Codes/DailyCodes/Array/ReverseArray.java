import java.io.*;
class ReverseArray{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array Size :");
		int size = Integer.parseInt(br.readLine());

		int a[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a.length;i++){
			a[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0,j=size-1; i<(size/2); i++,j--){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		System.out.println("Array Elements Are : ");
		for(int i=0;i<a.length;i++){
			System.out.println(" "+a[i]);
		}
	}
}
