import java.io.*;
class Program8{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int no = Integer.parseInt(br.readLine());

		int rem=0;
		while(no>0){
			rem=no%10;
			if(rem%2==0){
				System.out.print(rem+" ,");
			}else{
				System.out.print(rem*rem+" ,");
			}
			no=no/10;
		}
	}
}

