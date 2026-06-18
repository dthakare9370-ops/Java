import java.io.*;
class Program9{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Number of Row : ");
		int row = Integer.parseInt(br.readLine());
		
		char ch;
		for(int i=1;i<=row;i++){
			ch = (char)(64+row);
			for(int j=1;j<=row+1-i;j++){
				System.out.print(ch+"\t");
				ch--;
			}
			System.out.println();
		}
	}
}

