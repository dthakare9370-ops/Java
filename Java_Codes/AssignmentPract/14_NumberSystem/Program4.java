import java.io.*;
class Program4{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int no = Integer.parseInt(br.readLine());

		int i=no;
		int fact=1;
		while(i>0){
			fact = fact*i;
			i--;
		}

		System.out.println(no+" Factorial is : "+fact);
	}
}

