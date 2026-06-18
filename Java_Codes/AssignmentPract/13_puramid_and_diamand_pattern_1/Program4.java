import java.io.*;
class Program4{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of rows : ");
		int row = Integer.parseInt(br.readLine());
			
		/*int col = row*2-1;
		for(int i=1;i<=row;i++){
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				System.out.print("* ");
			}
			col = col-2;
			System.out.println();
		}*/


		int no=2;
		for(int i=1;i<=row;i++){
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("  ");
			}

			for(int j=1;j<=2*(row-i)+1;j++){
				System.out.print(no+" ");
				no=no+2;
			}
			System.out.println();
		}

	}
}
