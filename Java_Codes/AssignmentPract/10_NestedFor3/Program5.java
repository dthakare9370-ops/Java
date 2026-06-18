import java.io.*;
class Program5{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Row : ");
		int row = Integer.parseInt(br.readLine());

		int no = row;
		char ch = (char)(64+no);

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(ch+"\t");
				}else{
					System.out.print(no+"\t");
				}
			}
			System.out.println();
			no--;
			ch--;
		}
	}
}
