import java.io.*;
class ArrayBufferedReader{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array Size : ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter the Array Elements : ");
		int a[] = new int[size];
		for(int i=0;i<a.length;i++){
			a[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array Elements Are : ");
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
}	
