import java.io.*;
class Program1{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number of Rows : ");
		int row = Integer.parseInt(br.readLine());
		
		int no=1;
		for(int i=1;i<=row;i++){
			/*no=1;
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=i;j++){
				System.out.print(no+"\t");
				no++;
			}*/

			no = 1;
			for(int j=1;j<=row;j++){
				if(j<=row-i){
					System.out.print("\t");
				}else{
					System.out.print(no+"\t");
					no++;
				}
			}
			System.out.println();
		}
	}
}


