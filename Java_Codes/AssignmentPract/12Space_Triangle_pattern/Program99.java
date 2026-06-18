import java.io.*;
class Program99{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){

			int no = 64+i;

			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=row+i-i;j++){
				if(row%2==0){
					if(j%2==0){
						System.out.print((char)no+"\t");
					}else{
						System.out.print(no+"\t");
					}
				}else{
					if(j%2==0){
						System.out.print(no+"\t");
					}else{
						System.out.print((char)no+"\t");
					}
				}
				no++;			
			}

			System.out.println();
		}
	}
}
