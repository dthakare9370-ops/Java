import java.io.*;
class Program2{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int no = Integer.parseInt(br.readLine());

		int i=2,count=0;
		while(i<=no/2){
			if(no%i==0){
				count++;
			}
			i++;
		}

		if(count==0){
			System.out.println(no+" is Prime");
		}else{
			System.out.println(no+" is Not Prime");
		}
	}
}

