import java.io.*;
class AlphaWithNumber_Pattern{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Rows : ");
		int row = Integer.parseInt(br.readLine());

		char ch = 64;
		int value=1;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
			//	ch = char(64+row);
				System.out.print(ch +""+ value +"\t");
				value++;
			}
			System.out.println();
		}

	}
}
