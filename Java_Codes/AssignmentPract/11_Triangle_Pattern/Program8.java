import java.io.*;
class Program8{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		int no;
		for(int i=1;i<=row;i++){
			no=i;
		       for(int j=1;j<=row+1-i;j++){
				System.out.print(no+"\t");
				no++;
		       }
		       System.out.println();
		}
	}
}	
