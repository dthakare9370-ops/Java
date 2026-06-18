import java.io.*;
class Program5{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of rows : ");
		int row = Integer.parseInt(br.readLine());

		int no = 1;
		for(int i=1;i<=row;i++){
			no = row+1-i;
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("  ");
			}
			for(int j=1;j<=2*(row-i)+1;j++){
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}
}
