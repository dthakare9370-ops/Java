import java.io.*;
class SumOfArray{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array Size :");
		int size = Integer.parseInt(br.readLine());

		int a[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<size;i++){
			a[i] = Integer.parseInt(br.readLine());
		}

		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum = sum + a[i];
		}

		System.out.println("Sum of array Elements : "+sum);
	}
}
