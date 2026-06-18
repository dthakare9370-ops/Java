//Perfect Number 
import java.io.*;
class Program1{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int end = Integer.parseInt(br.readLine());
		int sum = 0;

		for(int start=1;start<=end;start++){
			int x=1;
			sum=0;

			while(x<start){
				if(start%x==0){
					sum = sum + x;
				}
				x++;
			}
			if(start == sum){
				System.out.println(start);
			}
		}
	}
}

