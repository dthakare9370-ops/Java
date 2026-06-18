import java.io.*;
class Try{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number of Rows : ");
		int row = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row-i;j++){
				System.out.print("\t");
			}

			for(int j=1;j<=i;j++){
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}


