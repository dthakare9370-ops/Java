import java.io.*;
class Program3{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		char ch='a';
		for(int i=1;i<=row;i++){
			if(i%2==1){
				ch='A';
			}else{
				ch='a';
			}

			for(int spc=1;spc<=row-i;spc++){
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
