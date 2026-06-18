import java.io.*;
class Program2{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		/*int no=1;
		for(int i=1;i<=row;i++){
			no = row;
			for(int j=1;j<=row-i;j++){
				System.out.print("\t");
			}

			for(int j=1;j<=i;j++){
				System.out.print(no+"\t");
				no--;
			}
			System.out.println();
		}*/

		int no = 1;
		for(int i=1;i<=row;i++){
			no = row;
			for(int j=1;j<=row;j++){
				if(j<=row-i){
					System.out.print("\t");
				}else{
					System.out.print(no+"\t");
					no--;
				}
			}
		}



	}
}
