import java.io.*;
class Program4{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		int no=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(no%2==0){
					System.out.print(no*no+"\t");
				}else{
					System.out.print(no*no*no+"\t");
				}
				no++;
			}
			System.out.println();
		}
	}
}

