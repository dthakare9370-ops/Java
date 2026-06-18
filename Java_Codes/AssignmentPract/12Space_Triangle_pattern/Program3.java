import java.io.*;
class Program3{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		char ch = 'A';
		for(int i=1;i<=row;i++){
			ch = (char)(64+(row+1-i));
			for(int j=1;j<=row-i;j++){
				System.out.print("\t");
			}

			for(int j=1;j<=i;j++){
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
	}
}
