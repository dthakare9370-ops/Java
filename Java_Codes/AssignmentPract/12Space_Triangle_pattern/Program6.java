import java.io.*;
class Program6{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of rows : ");
		int row = Integer.parseInt(br.readLine());

		int no = row;
		for(int i=1;i<=row;i++){
			
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=row+1-i;j++){
				System.out.print(no+"\t");
			}
			System.out.println("");
			no--;
		}
	}
}
